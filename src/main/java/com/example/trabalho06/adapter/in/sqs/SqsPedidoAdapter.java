package com.example.trabalho06.adapter.in.sqs;

import com.example.trabalho06.adapter.in.sqs.dto.EventoPedidoDTO;
import com.example.trabalho06.applications.ports.in.ProcessarPedidoUseCase;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsPedidoAdapter {

    private final ProcessarPedidoUseCase processarPedidoUseCase;

    public SqsPedidoAdapter(ProcessarPedidoUseCase processarPedidoUseCase) {
        this.processarPedidoUseCase = processarPedidoUseCase;
    }

    @SqsListener("${queue.order-events}")
    public void listen(EventoPedidoDTO dto) {
        if ("PAGAMENTO_APROVADO".equals(dto.getTipo())) {
            System.out.println("Mensagem recebida: " + dto.getDados().getPedidoId());
            processarPedidoUseCase.processar(dto.getDados().getPedidoId(), dto.getDados().getValorPago());
            System.out.println("Mensagem consumida com sucesso.");
        }
    }
}
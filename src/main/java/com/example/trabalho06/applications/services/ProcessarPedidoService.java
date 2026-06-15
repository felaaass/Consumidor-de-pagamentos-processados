package com.example.trabalho06.applications.services;

import com.example.trabalho06.core.domain.model.PedidoBO;
import com.example.trabalho06.applications.ports.in.ProcessarPedidoUseCase;
import com.example.trabalho06.applications.ports.out.SalvarPedidoPort;
import org.springframework.stereotype.Service;

@Service
public class ProcessarPedidoService implements ProcessarPedidoUseCase {

    private final SalvarPedidoPort salvarPedidoPort;

    public ProcessarPedidoService(SalvarPedidoPort salvarPedidoPort) {
        this.salvarPedidoPort = salvarPedidoPort;
    }

    @Override
    public void processar(String pedidoId, Double valorPago) {
        PedidoBO pedido = new PedidoBO(pedidoId, valorPago);

        if (pedido.isElegivelParaDesconto()) {
            pedido.aplicarDesconto();
        }

        salvarPedidoPort.salvar(pedido);
    }
}
package com.example.trabalho06.core.usecase;

import com.example.trabalho06.core.domain.model.PedidoBO;
import com.example.trabalho06.core.ports.in.ProcessarPedidoUseCase;
import com.example.trabalho06.core.ports.out.SalvarPedidoPort;
import org.springframework.stereotype.Service;

@Service
public class ProcessarPedidoService implements ProcessarPedidoUseCase {

    private final SalvarPedidoPort salvarPedidoPort;

    public ProcessarPedidoService(SalvarPedidoPort salvarPedidoPort) {
        this.salvarPedidoPort = salvarPedidoPort;
    }

    @Override
    public void processar(String pedidoId, Double valorPago) {
        PedidoBO pedidoBO = new PedidoBO(pedidoId, valorPago);
        salvarPedidoPort.salvar(pedidoBO);
    }
}
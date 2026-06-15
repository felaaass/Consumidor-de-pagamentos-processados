package com.example.trabalho06.applications.ports.out;

import com.example.trabalho06.core.domain.model.PedidoBO;

public interface SalvarPedidoPort {
    void salvar(PedidoBO pedidoBO);
}
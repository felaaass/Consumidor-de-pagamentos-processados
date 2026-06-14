package com.example.trabalho06.core.ports.in;

public interface ProcessarPedidoUseCase {
    void processar(String pedidoId, Double valorPago);
}
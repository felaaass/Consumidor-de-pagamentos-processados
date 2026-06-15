package com.example.trabalho06.core.domain.model;

public class PedidoBO {

    private String pedidoId;
    private Double valorOriginal;
    private Double valorPago;

    public PedidoBO(String pedidoId, Double valorOriginal) {
        this.pedidoId = pedidoId;
        this.valorOriginal = valorOriginal;
        this.valorPago = valorOriginal;
    }

    public boolean isElegivelParaDesconto() {
        return this.valorOriginal > 1000.0;
    }

    public void aplicarDesconto() {
        this.valorPago = this.valorOriginal * 0.90;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public Double getValorPago() {
        return valorPago;
    }
}
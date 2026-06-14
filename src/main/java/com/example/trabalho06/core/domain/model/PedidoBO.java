package com.example.trabalho06.core.domain.model;

public class PedidoBO {

    private String id;
    private Double valorOriginal;
    private Double valorFinal;
    private boolean descontoAplicado;

    public PedidoBO(String id, Double valorOriginal) {
        this.id = id;
        this.valorOriginal = valorOriginal;
        this.aplicarRegrasDeDesconto();
    }

    private void aplicarRegrasDeDesconto() {
        if (this.valorOriginal > 1000.00) {
            this.valorFinal = this.valorOriginal * 0.90;
            this.descontoAplicado = true;
        } else {
            this.valorFinal = this.valorOriginal;
            this.descontoAplicado = false;
        }
    }

    public String getId() {
        return id;
    }

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public boolean isDescontoAplicado() {
        return descontoAplicado;
    }
}
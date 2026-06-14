package com.example.trabalho06.adapter.in.sqs.dto;

public class EventoPedidoDTO {

    private String idEvento;
    private String tipo;
    private String dataOcorrencia;
    private DadosPedidoDTO dados;

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public DadosPedidoDTO getDados() {
        return dados;
    }

    public void setDados(DadosPedidoDTO dados) {
        this.dados = dados;
    }
}
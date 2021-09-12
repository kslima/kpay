package com.kslima.kpay;

public class PaymentResponse {

    private StatusPagamento statusPagamento;
    private String erro;

    public PaymentResponse(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public PaymentResponse(String erro) {
        this.erro = erro;
    }

    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}

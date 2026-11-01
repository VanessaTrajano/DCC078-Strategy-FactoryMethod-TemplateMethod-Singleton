package org.example;

public class Compra {
    private float valorTotal;
    private String statusPagamento;

    public void setValorTotal(float valorTotal) {
        if (valorTotal <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }
        this.valorTotal = valorTotal;
    }

    public String getStatusPagamento() {
        return this.statusPagamento;
    }

    public void pagar(String tipoPagamento) {
        FormaPagamento forma = FormaPagamentoFactory.getInstance().criarPagamento(tipoPagamento);

        this.statusPagamento = forma.processarPagamento(this.valorTotal);
    }
}

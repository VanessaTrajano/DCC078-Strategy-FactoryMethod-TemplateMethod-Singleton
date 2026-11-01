package org.example;

public class PagamentoCredito extends FormaPagamento{
    @Override
    protected String autorizarTransacao(float valor) {
        return "Crédito de R$" + valor + " aprovado.";
    }
}

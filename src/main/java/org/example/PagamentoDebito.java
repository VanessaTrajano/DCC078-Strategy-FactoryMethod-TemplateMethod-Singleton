package org.example;

public class PagamentoDebito extends FormaPagamento{
    @Override
    protected String autorizarTransacao(float valor) {
        return "Débito de R$" + valor + " aprovado.";
    }
}

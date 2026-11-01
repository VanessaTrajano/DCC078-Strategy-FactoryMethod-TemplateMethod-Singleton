package org.example;

public class PagamentoPix extends FormaPagamento{
    @Override
    protected String autorizarTransacao(float valor) {
        return "PIX de R$" + valor + " aprovado.";
    }
}

package org.example;

public class PagamentoDinheiro extends FormaPagamento{
    @Override
    protected String autorizarTransacao(float valor) {
        return "Pagamento em dinheiro de R$" + valor + " aprovado.";
    }
}

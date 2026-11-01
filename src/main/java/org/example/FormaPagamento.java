package org.example;

public abstract class FormaPagamento {
    public final String processarPagamento(float valor) {
        String mensagemAutorizacao = autorizarTransacao(valor);
        return emitirRecibo(mensagemAutorizacao);
    }

    private String emitirRecibo(String mensagemAutorizacao) {
        return "Recibo: " + mensagemAutorizacao;
    }

    protected abstract String autorizarTransacao(float valor);
}

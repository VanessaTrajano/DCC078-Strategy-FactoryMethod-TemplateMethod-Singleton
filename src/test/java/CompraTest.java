import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveAprovarPagamentoCreditoCompra() {
        Compra compra = new Compra();
        compra.setValorTotal(100f);
        compra.pagar("Credito");
        assertEquals("Recibo: Crédito de R$100.0 aprovado.", compra.getStatusPagamento());
    }

    @Test
    void deveAprovarPagamentoDebitoCompra() {
        Compra compra = new Compra();
        compra.setValorTotal(100f);
        compra.pagar("Debito");
        assertEquals("Recibo: Débito de R$100.0 aprovado.", compra.getStatusPagamento());
    }

    @Test
    void deveAprovarPagamentoPixCompra() {
        Compra compra = new Compra();
        compra.setValorTotal(100f);
        compra.pagar("Pix");
        assertEquals("Recibo: PIX de R$100.0 aprovado.", compra.getStatusPagamento());
    }

    @Test
    void deveAprovarPagamentoDinheiroCompra() {
        Compra compra = new Compra();
        compra.setValorTotal(100f);
        compra.pagar("Dinheiro");
        assertEquals("Recibo: Pagamento em dinheiro de R$100.0 aprovado.", compra.getStatusPagamento());
    }

    @Test
    void naoDeveAceitarValorZero() {
        Compra compra = new Compra();
        try {
            compra.setValorTotal(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O valor da compra deve ser maior que zero.", e.getMessage());
        }
    }
}
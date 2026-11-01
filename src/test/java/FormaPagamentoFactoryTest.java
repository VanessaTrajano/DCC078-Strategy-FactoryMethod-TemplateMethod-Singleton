import org.example.FormaPagamento;
import org.example.FormaPagamentoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormaPagamentoFactoryTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FormaPagamento fabrica = FormaPagamentoFactory.getInstance().criarPagamento("Voucher");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Forma de pagamento inexistente", e.getMessage());
        }
    }
}
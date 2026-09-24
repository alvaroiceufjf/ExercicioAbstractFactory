
import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GerenteNegocioTest {

    @Test
    void deveEmitirDocumentosPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        GerenteNegocio gerente = new GerenteNegocio(fabrica);

        assertEquals("Contrato de Empréstimo Pessoa Física", gerente.emitirContrato());
        assertEquals("Relatório de Análise de Risco PF", gerente.emitirRelatorio());
    }

    @Test
    void deveEmitirDocumentosAgro() {
        FabricaAbstrata fabrica = new FabricaAgro();
        GerenteNegocio gerente = new GerenteNegocio(fabrica);

        assertEquals("Contrato de Cédula de Crédito Rural", gerente.emitirContrato());
        assertEquals("Relatório de Vistoria de Safra e Penhor", gerente.emitirRelatorio());
    }
}
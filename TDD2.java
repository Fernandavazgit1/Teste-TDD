import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CadastroDependentesTest {

    private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("Joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentesDuplicados() {
        irpf.cadastrarDependente("Joao");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Jose");
        irpf.cadastrarDependente("Maria Jose");
        irpf.cadastrarDependente("Jose Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}

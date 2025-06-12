package tst;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import app.IRPF;

public class CadastrarDeducaoTest {

    private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarPrevidenciaOficial1() {
        irpf.cadastrarPrevidenciaOficial(100);
        assertEquals(100f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial2() {
        irpf.cadastrarPrevidenciaOficial(200);
        assertEquals(200f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial3() {
        irpf.cadastrarPrevidenciaOficial(300);
        assertEquals(300f, irpf.getPrevidenciaOficial(), 0);
    }
}

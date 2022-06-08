import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteAutoridade {

    @Test
    public void testeInformal()
    {
        FormatadorNome fn = new Informal();
        Autoridade a = new Autoridade ("Breno", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Breno");
    }

    @Test
    public void testeRespeitosoMasculino ()
    {
        FormatadorNome fn = new Respeitoso(true, false);
        Autoridade a = new Autoridade ("Breno", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Sr. Breno Oliveira");
    }

    @Test
    public void testeRespeitosoFeminino ()
    {
        FormatadorNome fn = new Respeitoso(false, true);
        Autoridade a = new Autoridade ("Isabele", "Ferreira", fn);
        assertEquals(a.getTratamento(), "Sra. Isabele Ferreira");
    }

    @Test
    public void testeComTitulo ()
    {
        FormatadorNome fn = new ComTitulo("Magnífico");
        Autoridade a = new Autoridade ("Breno", "Oliveira", fn);
        assertEquals(a.getTratamento(), "Magnífico Breno Oliveira");
    }

}

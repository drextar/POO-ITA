import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteProduto {

    @Test
    public void testeEquals() {

        Produto p = new Produto(2, "Tenis", 30);
        Produto p1 = new Produto(2, "Moletom", 32);
        assertEquals(p.equals(p1), p1.equals(p));
    }

    @Test
    public void testeHashCode()
    {
        Produto p1 = new Produto(2, "Meia", 30);
        Produto p2 = new Produto(2, "Luva", 32);
        assertEquals(p1.hashCode(), p2.hashCode());

    }
}

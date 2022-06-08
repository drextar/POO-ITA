import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteProdutoComTamanho {

    @Test
    public void testeEquals() {

        Produto pt = new ProdutoComTamanho(1, "Tenis", 20, 5);
        Produto pt1 = new ProdutoComTamanho(1, "Meia", 22, 15);
        assertEquals(pt.equals(pt1), pt1.equals(pt));
    }

    @Test
    public void testeHashCode()
    {
        Produto pt = new ProdutoComTamanho(1, "Bermuda", 25, 5);
        Produto pt1 = new ProdutoComTamanho(1, "Bota", 20, 5);
        assertEquals(pt.hashCode(), pt1.hashCode());

    }
}

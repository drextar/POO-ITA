import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCarrinhoDeCompra {

    @Test
    public void testeQuantidadeNoCarrinho()
    {
        Produto p = new Produto(12, "Gravata", 15);
        CarrinhoDeCompra c1 = new CarrinhoDeCompra();
        c1.adicionaProduto(p, 3);
        assertEquals(CarrinhoDeCompra.getQuantidadeNoCarrinho(), 3);

    }
}

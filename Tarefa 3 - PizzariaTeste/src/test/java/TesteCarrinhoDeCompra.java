import org.junit.Test;

import static org.junit.Assert.*;

public class TesteCarrinhoDeCompra {

    @Test
    public void testeVerificarPreco() {
        Pizza pedidoPizza1 = new Pizza();

        pedidoPizza1.adicionaIngrediente("Tomate");
        pedidoPizza1.adicionaIngrediente("Queijo");
        pedidoPizza1.adicionaIngrediente("Presunto");
        pedidoPizza1.adicionaIngrediente("Orégano");

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.addPizza(pedidoPizza1);

        assertEquals(20.0, carrinho.getPrecoTotal(), 0);
    }

    @Test
    public void testeIngredientesVazio() {
        Pizza pedidoPizza1 = new Pizza();

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.addPizza(pedidoPizza1);

        assertEquals(0, carrinho.getPrecoTotal(), 0);
    }
}

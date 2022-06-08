import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestePizza {

    @Before
    public void limparRegPizza() {
        Pizza.zeraIngredientes();
    }

    @Test
    public void testePrecoPizza() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Mussarela");
        pizza.adicionaIngrediente("Catupiry");
        pizza.adicionaIngrediente("Provolone");
        pizza.adicionaIngrediente("Gorgonzola");

        assertEquals(4, pizza.getIngrediente().size());
    }

    @Test
    public void testeMapIngredientes() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Mussarela");
        pizza.adicionaIngrediente("Catupiry");
        pizza.adicionaIngrediente("Provolone");
        pizza.adicionaIngrediente("Gorgonzola");

        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.addAll(pizza.getIngrediente());

        assertEquals(ingredientes, pizza.getIngrediente());
    }
}

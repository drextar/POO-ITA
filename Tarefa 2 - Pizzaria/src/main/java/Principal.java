package main.java;

public class Principal {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();

        p1.adicionaIngrediente("Mussarela");
        p1.adicionaIngrediente("Tomate");

        p2.adicionaIngrediente("Mussarela");
        p2.adicionaIngrediente("Catupiry");
        p2.adicionaIngrediente("Provolone");
        p2.adicionaIngrediente("Gorgonzola");
        p2.adicionaIngrediente("Parmesão");

        p3.adicionaIngrediente("Calabresa");
        p3.adicionaIngrediente("Catupiry");
        p3.adicionaIngrediente("Mussarela");
        p3.adicionaIngrediente("Bacon");
        p3.adicionaIngrediente("Cebola");
        p3.adicionaIngrediente("Palmito");

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.addPizza(p1);
        carrinhoDeCompra.addPizza(p2);
        carrinhoDeCompra.addPizza(p3);

        System.out.println("Total de pizzas no carrinho: " + carrinhoDeCompra.totalPizzas());
        System.out.println("Valor total da compra: " + carrinhoDeCompra.getPrecoTotal());

        System.out.println("Lista de ingredientes utilizados: \n" + Pizza.getListaIngredientes());

    }
}

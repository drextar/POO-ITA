package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    public static int qtdTotalIngredientes = 0;
    private double preco;
    private ArrayList<String> ingrediente = new ArrayList<String>();
    public static HashMap<String, Integer> todosIngredientes = new HashMap<String, Integer>();


    public ArrayList<String> getIngrediente() {
        return ingrediente;
    }

    public static HashMap<String, Integer> getListaIngredientes()
    {
        return todosIngredientes;
    }

    public void adicionaIngrediente (String ingrediente)
    {
        this.ingrediente.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public double getPreco ()
    {
        if (ingrediente.size() <= 2)
        {
            preco = 15;
        }
        if (ingrediente.size() >= 3 && ingrediente.size() <=5)
        {
            preco = 20;
        }
        if (ingrediente.size() > 5)
        {
            preco = 23;
        }
        return preco;
    }

    public static void contabilizaIngrediente(String ingrediente)
    {
        if (todosIngredientes.containsKey(ingrediente))
        {
            int value = todosIngredientes.get(ingrediente);
            todosIngredientes.put(ingrediente, value += 1);
        }
        else
        {
            todosIngredientes.put(ingrediente, 1);
        }
        qtdTotalIngredientes++;
    }
}

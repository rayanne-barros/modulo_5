package br.com.ada.pizzaria.dao;

import br.com.ada.pizzaria.model.Pizza;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CardapioDAO {
    private List<Pizza> pizzas = new ArrayList<>();

    public List<Pizza> getCardapio() {
        return pizzas;
    }

    public Pizza getPizza(String nome) {
        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nome)) {
                return pizza;
            }
        }
        return null;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void excluirPizzas(String nome) {
        pizzas.removeIf(pizza -> pizza.getNome().equalsIgnoreCase(nome));
    }

    public void atualizarPizza(String nomeAntigo, Pizza pizzaParaatualizar) {
        for (Pizza pizza : pizzas) {
            if(pizza.getNome().equalsIgnoreCase(nomeAntigo)) {
                pizza.setIngredientes(pizzaParaatualizar.getIngredientes());
                pizza.setPreco(pizzaParaatualizar.getPreco());

//                pizza.setNome(pizzaParaatualizar.getNome());
//                pizza.setImagem(pizzaParaatualizar.getImagem());

            }
        }

    }
}

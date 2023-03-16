package br.com.ada.estoque.dao;

import br.com.ada.estoque.model.Produto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProdutoDAO {
    private static List<Produto> produtos = new ArrayList<>();
    private static int proximoId = 1;

    public void adicionar(Produto produto) {
        produto.setId(proximoId++);
        produtos.add(produto);
    }

    public void atualizar(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == produto.getId()) {
                produtos.set(i, produto);
                break;
            }
        }
    }

    public void remove(int id) {
        produtos.removeIf(p -> p.getId() == id);
    }

    public Produto buscarPorId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Produto> buscarTodos() {
        return produtos;
    }
}

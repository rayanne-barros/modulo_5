package br.com.ada.estoque.controller;

import br.com.ada.estoque.dao.ProdutoDAO;
import br.com.ada.estoque.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoDAO produtoDAO;

    @GetMapping
    public String listar(Model model){
        List<Produto> lista = produtoDAO.buscarTodos();
        model.addAttribute("produtos", lista);
        return "produto_listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Produto produto = produtoDAO.buscarPorId(id);
        model.addAttribute("produto", produto);
        return "produto_editar";
    }

    @PostMapping("/editar")
    public String atualizar(Produto produto) {
        produtoDAO.atualizar(produto);
        return "redirect:/produto";
    }

    @GetMapping("/remover/{id}")
    public String remover(@PathVariable int id) {
        produtoDAO.remove(id);
        return "redirect:/produto";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("produto", new Produto());
        return "produto_novo";
    }

    @PostMapping("/novo")
    public String adicionar(Produto produto) {
        produtoDAO.adicionar(produto);
        return "redirect:/produto";
    }
}

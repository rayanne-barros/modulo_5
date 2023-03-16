package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.model.Produto;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CardapioWeb",value = "/cardapio")
public class CardapioServlet extends HttpServlet {

    private List<Produto> produtos;


    public void init() {
        Produto pizzaCalabresa = new Produto("Pizza calabresa", "R$ 45,99", "https://images.unsplash.com/photo-1458642849426-cfb724f15ef7?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=250&q=50");
        Produto pizzaPortuguesa = new Produto("Pizza Portuguesa", "R$ 51,99", "https://images.unsplash.com/photo-1555072956-7758afb20e8f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=250&q=50");
        produtos = List.of(pizzaCalabresa, pizzaPortuguesa);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Pizzaria do Seu José</h1> ");
        out.println("<ul>");
        produtos.forEach(produto -> {
            out.println("<li>");
              out.println("<h3>" + produto.getNome() + "</h3>");
              out.println("<h5>" + produto.getPreco() + "</h5>");
              out.println("<img src=" + produto.getUrlImagem() + "/>");
            out.println("</li>");
        });
        out.println();
        out.println("</ul>");
        out.println("</body></html>");

    }

}

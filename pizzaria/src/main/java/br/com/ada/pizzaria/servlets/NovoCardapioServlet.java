package br.com.ada.pizzaria.servlets;

import br.com.ada.pizzaria.dao.CardapioDAO;
import br.com.ada.pizzaria.model.Pizza;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/novo-cardapio")
public class NovoCardapioServlet extends HttpServlet {
    
    @Inject
    private CardapioDAO cardapioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pizza> pizzas = cardapioDAO.getCardapio();
        request.setAttribute("cardapio", pizzas);
        request.getRequestDispatcher("cardapio.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String ingredientes = request.getParameter("ingredientes");
        Double preco = Double.parseDouble(request.getParameter("preco"));
        String imagem = request.getParameter("imagem");
        Pizza pizza = new Pizza(nome, ingredientes, preco, imagem);
        cardapioDAO.adicionarPizza(pizza);
        response.sendRedirect("cardapio");
    }
}

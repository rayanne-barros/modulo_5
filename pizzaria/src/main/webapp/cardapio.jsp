
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 24/02/2023
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Cardapio</title>

</head>
<body>
<h1>Bem-vindo ao Cardapio</h1>
<table class="table">
    <tr>
        <th scope="col">Nome</th>
        <th scope="col">Ingredientes</th>
        <th scope="col">Preço</th>
        <th scope="col">Imagem</th>
        <th scope="col">Ação</th>
    </tr>
    <c:forEach items="${cardapio}" var="pizza">
        <tr>
            <td>${pizza.nome}</td>
            <td>${pizza.ingredientes}</td>
            <td>${pizza.preco}</td>
            <td>${pizza.imagem}</td>
            <td>
                <a href="editar-pizza?nome=${pizza.nome}">Editar</a>
                <a href="excluir-pizza?nome=${pizza.nome}">Excluir</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="nova-pizza.jsp">Adicionar Pizza</a>
</body>
</html>

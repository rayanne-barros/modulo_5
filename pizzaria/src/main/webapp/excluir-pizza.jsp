<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 24/02/2023
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Excluir Pizza</title>
</head>
<body>
<h1>Excluir Pizza</h1>
<p>Tem certeza que deseja excluir a pizza ${pizza.nome}?</p>
<form method="post" action="excluir-pizza">
  <input type="hidden" name="nome" value="${pizza.nome}">
  <button type="submit">Sim</button>
  <a href="${request.contextPath}/cardapio">Não</a>
</form>
</body>
</html>

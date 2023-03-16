<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 24/02/2023
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adicionar Pizza</title>
</head>
<body>
    <h3>Nova Pizza</h3>
    <form method="POST" action="novo-cardapio">
        <label for="nome"> Nome:</label>
        <input type="text" name="nome" required>
        <br>
        <label for="ingredientes"> Ingrediantes:</label>
        <input type="text" name="ingredientes" required>
        <br>
        <label for="preco"> Preço:</label>
        <input type="text" name="preco" required>
        <br>
        <label for="imagem"> Imagem:</label>
        <input type="text" name="imagem" required>
        <br>
        <button type="submit">Salvar</button>
    </form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: RYZEN2400G
  Date: 28/11/2019
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<a href="logout">Logout</a>
    <h2>Página inicial da Lista de Tarefas</h2>
    <p>Bem vindo, ${usuarioLogado.login}</p>
    <a href="listaTarefas">Clique aqui</a> para acessar a
    lista de tarefas
</body>
</html>

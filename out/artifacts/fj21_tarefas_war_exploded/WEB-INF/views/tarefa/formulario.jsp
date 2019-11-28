<%--
  Created by IntelliJ IDEA.
  User: RYZEN2400G
  Date: 27/11/2019
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
    <h3>Adicionar tarefas</h3>
    <form action="adicionaTarefa" method="post">
        Descrição:
        <br/>
        <textarea name="descricao" rows="5" cols="100"></textarea>
        <br/>
        <form:errors path="tarefa.descricao"/>
        <input type="submit" value="Adicionar"/>
    </form>
</body>
</html>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: RYZEN2400G
  Date: 28/11/2019
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alterar tarefa</title>
</head>
<body>
    <h3>Alterar Tarefa - ${tarefa.id}</h3>
    <hr/>
    <form action="alteraTarefa" method="get">
        Descrição:
        <br/>
        <input type="hidden" name="id" value="${tarefa.id}"/>
        <textarea name="descricao">${tarefa.descricao}</textarea>
        <br/>
        Finalizado:
        <input type="text" name="finalizado" value="${tarefa.finalizado}"/>
        <br/>
        Data de Finalização:
        <input type="text" name="dataFinalizacao" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />"/>
        <br/>
    <input type="submit" value="Alterar"/>
    </form>
</body>
</html>

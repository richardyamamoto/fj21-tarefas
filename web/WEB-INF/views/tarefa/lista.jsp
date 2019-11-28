<%--
  Created by IntelliJ IDEA.
  User: RYZEN2400G
  Date: 28/11/2019
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Lista de Tarefas</h3>
<hr/>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Descrição</td>
            <td>Status</td>
            <td>Data Finalização</td>
            <td>Editar</td>
        </tr>
    <c:forEach var="tarefa" items="${tarefas}">
        <tr>
            <td>${tarefa.id}</td>
            <td>${tarefa.descricao}</td>
            <td>
                <c:if test="${tarefa.finalizado eq false}">
                    Não Finalizado
                </c:if>
                <c:if test="${tarefa.finalizado eq true}">
                    Finalizado
                </c:if>
            </td>
            <td>
                <fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/>
            </td>
            <td>
                <a href="removeTarefa?id=${tarefa.id}">Remover</a>
                |
                <a href="mostraTarefa?id=${tarefa.id}">Alterar</a>
            </td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>

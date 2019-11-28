<%--
  Created by IntelliJ IDEA.
  User: RYZEN2400G
  Date: 28/11/2019
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <hr/>
    <form action="efetuaLogin" method="post">
        Login: <input type="text" name="login"/>
        <br/>
        Senha <input type="password" name="senha"/>
        <br/>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>

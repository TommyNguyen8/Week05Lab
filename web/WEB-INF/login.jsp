<%-- 
    Document   : login
    Created on : Oct 5, 2020, 5:04:24 PM
    Author     : 791662
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username:
            <input type="text" name="username"><br>
            Password:
            <input type="text" name="password"><br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="logincontroller" method="post">
        Username:<input type="text" name="username">
        Password:<input type="password" name="pass">
                 <input type="radio" name="type" value="user">User
                 <input type="radio" name="type" value="admin">Admin
                 <input type="submit">
        </form>
    </body>
</html>

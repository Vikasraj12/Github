<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
      <form action="registercontroller" method="get">
          <pre>
              Name:        <input type="text" name="name">
              Description: <textarea name="info" style="height:100px; width:50%;"></textarea>
              Username:    <input type="text" name="Username">
              Password:    <input type="password" name="pass">
              Select type: <input type="radio" name="type" value="user">User
                           <input type="radio" name="type" value="admin">Admin
                           <input type="submit">
          </pre>
          </form>
    </body>
</html>

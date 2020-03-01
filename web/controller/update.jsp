<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
         Connection con;
         Statement stmt;
         ResultSet res;
        %>
        <%
            try
            {
         String uname=request.getParameter("id");
         String sql="select * from sample where username='"+uname+"'";
         stmt=con.createStatement();
         res=stmt.executeQuery(sql);
         while(res.next()){
        %>    
      <form action="updateController.jsp">
          <pre>
              Name:        <input type="text" value="<%=res.getString("name")%>" name="name">
              Description: <textarea name="info" style="height:100px; width:50%;"><%=res.getString("info")%></textarea>
              Username:    <input disabled="true" type="text" value="<%=res.getString("username")%>" name="Username">
              Password:    <input type="password" value="<%=res.getString("pass")%>" name="pass">
              Select type: <input type="radio" name="type" value="user">User
                           <input type="radio" name="type" value="admin">Admin
                           <input type="hidden" value="<%=res.getString("username")%>" name="id">
                           <input type="submit">
          </pre>
          </form>
      <%
         }}
catch(Exception ex)
{
  out.print(ex);
}
      %>
    </body>
</html>

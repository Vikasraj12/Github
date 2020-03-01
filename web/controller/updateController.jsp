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
        %>
        <%
         String uname=request.getParameter("id");
         stmt=con.createStatement();
         int a=stmt.executeUpdate("update sample set name='"+request.getParameter("name")+"',info='"+request.getParameter("info")+"',pass='"+request.getParameter("pass")+"',type='"+request.getParameter("type")+"' where username='"+request.getParameter("id")+"'");
         if(a>0)
         response.sendRedirect("../admin.jsp");
         %>
    </body>
</html>

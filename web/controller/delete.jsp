<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%!
        Connection con;
        Statement stmt;
        %>
     
        <%
        con=connect.MySQLConnection.ConnectTo();
        stmt=con.createStatement();
        int i=stmt.executeUpdate("delete from sample where username='"+request.getParameter("id")+"'");
        if(i>0)
        {
            response.sendRedirect("../admin.jsp");
        }
        %>
    


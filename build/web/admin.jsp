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
        <h1>Admin page</h1>
        <table border="1">
            <%!
                Connection con;
                Statement stmt;
                ResultSet res;
            %>
            <%
                try {
                    con = connect.MySQLConnection.ConnectTo();
                    stmt = con.createStatement();
                    res = stmt.executeQuery("select * from sample");
                    while (res.next()) {
            %>
            <tr>
                <td><%=res.getString("name")%></td>
                <td><%=res.getString("info")%></td>
                <td><%=res.getString("username")%></td>
                <td><%=res.getString("pass")%></td>
                <td><%=res.getString("type")%></td>
                <td><a href="contoller/update.jsp?id=<%=res.getString("username")%>">Update</a></td>
                <td><a href="controller/delete.jsp?id=<%=res.getString("username")%>">Delete</a></td>
            </tr>

            <%
                    }
                    con.close();
                   } 
              catch (Exception ex) 
                {

                }
            %>
        </table>
    </body>
</html>

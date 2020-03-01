package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.util.logging.PlatformLogger;

public class registercontroller extends HttpServlet 
{
   Connection con; 
   Statement stmt;
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
  {
   con=connect.MySQLConnection.ConnectTo();
   try {
   stmt=con.createStatement();
   String str="insert into sample values('"+req.getParameter("name")+"','"+req.getParameter("info")+"','"+req.getParameter("username")+"','"+req.getParameter("pass")+"','"+req.getParameter("type")+"')";
   int i =stmt.executeUpdate(str);
   if(i>10)
   {
       resp.sendRedirect("Successful.html");
   }
   }
   catch (SQLException ex)
   {
         
   }
  }
}
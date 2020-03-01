package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class logincontroller extends HttpServlet 
{ 
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
  {
     PrintWriter out=resp.getWriter();
     HttpSession s=req.getSession(true);
     req.getParameter("username");
     req.getParameter("pass");
     Connection con;
     Statement stmt;
     con=connect.MySQLConnection.ConnectTo();
      try {
          stmt=con.createStatement();
         ResultSet res=stmt.executeQuery("select * from sample Where username='"+ req.getParameter("username")+"' && '"+ req.getParameter("pass")+"'");
         ArrayList arr1=new ArrayList();
         if(res!=null)
         {
         while(res.next())
         {
           ArrayList arr=new ArrayList();
           arr.add(res.getString("name"));
           arr.add(res.getString("info"));
           arr.add(res.getString("username"));
           arr.add(res.getString("pass"));
           arr.add(res.getString("type"));
           arr.add(arr);
         }
         s.setAttribute("userdata",arr1);
         resp.sendRedirect("home.jsp");
         }
         else
         {
            out.println("User name password is wrong!");
         }
      } 
      catch (SQLException ex) 
      {
         
      }
  }
}

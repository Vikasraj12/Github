package connect;

import java.sql.Connection;
import java.sql.DriverManager;
public class MySQLConnection
{
    public static Connection conn=null;
    
    public static Connection ConnectTo()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded...");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample");
            System.out.println("Connection Established...");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
     public static void main(String a[])
     {
         ConnectTo();
     }
}

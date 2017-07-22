package DB;
import java.sql.*;
public class DB_connect
{
  static Connection conn=null;
    public static Connection getConn()
    {
        try
        {
        if(conn==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","");
        }
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    finally
    {
        try
        {
        conn.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    }
    return conn;
    }
}
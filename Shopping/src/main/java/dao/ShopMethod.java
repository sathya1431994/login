import DB.DB_connect;
import DB.DB_connect.*;
import login.Login;
import java.util.*;
import java.sql.*;
import dao.Shopdao;
public class ShopMethod implements Shopdao
{
    Connection con=DB_connect.getConn();
    Login ln=new Login();
    public List<Login> login(String uname,String pass)
    {
         List<Login> log=new ArrayList<Login>();
         try
         {
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("select * from login");
         while(rs.next())
         {
                ln.setUsername(rs.getString(1));
                ln.setPassword(rs.getString(2));
                log.add(ln);
         }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         return log;
    }
}
import DB.DB_connect;
import DB.DB_connect.*;
import login.Login;
import java.util.*;
import java.sql.*;
import dao.Shopdao;
public class ShopMethod implements Shopdao
{
    Connection con=DB_connect.getConn();
    public List<Login>  login(String uname,String pass)
    {
         List<Login> log=new ArrayList<Login>();
         try
         {
            Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select username,password from login");  
         while(rs.next())
         {
                Login ln=new Login();
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

        public void register(Login l)
        {
            try
            {
                PreparedStatement ps=con.prepareStatement("insert into login(username,password,email) values(?,?,?)");
                ps.setString(1,l.getUsername());
                 ps.setString(2,l.getPassword());
                  ps.setString(3,l.getEmail());
                  ps.executeUpdate();
            }
            catch(Exception ex)
        {
            ex.printStackTrace();
        }
        }

}
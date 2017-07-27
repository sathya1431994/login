import DB.DB_connect;
import DB.DB_connect.*;
import login.Login;
import java.util.*;
import java.sql.*;
import dao.Shopdao;
import order.Order;
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
   public ResultSet order()
    {
        ResultSet rs=null;
         List<Order> order=new ArrayList<Order>();
        try
            {
                Statement st=con.createStatement();
                 rs=st.executeQuery("Select Gname,Gprice from Order_details"); 
            }
            catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return rs;
    }

public ResultSet login_entries()
    {
        ResultSet rs=null;
         try
         {
            Statement st=con.createStatement();
			 rs=st.executeQuery("select username,password from login");  
         }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         return rs;
    }
    public void delete(String uname)
    {
        try
        {
            PreparedStatement st=con.prepareStatement("delete from login where username=?");
            st.setString(1,uname);
            st.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void insert(Order or)
    {
        try
        {
             PreparedStatement ps=con.prepareStatement("insert into order_details(Gname,Gprice) values(?,?)");
                ps.setString(1,or.getGname());
                 ps.setString(2,or.getGprice());
                  ps.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void delete_items(String gname)
    {
        try
        {
            PreparedStatement st=con.prepareStatement("delete from order_details where Gname=?");
            st.setString(1,gname);
            st.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
     public void update(Order or)
    {
        try
        {
            PreparedStatement ps=con.prepareStatement("update  order_details set Gprice=? where Gname=?");
                 ps.setString(1,or.getGprice());
                 ps.setString(2,or.getGname());
                  ps.executeUpdate();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
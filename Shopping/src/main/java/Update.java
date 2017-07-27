import java.io.*;  
import java.sql.*;  
import java.sql.Connection;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.annotation.*; 
import dao.Shopdao;
import javax.servlet.RequestDispatcher;
import order.Order;
@WebServlet("/update")
public class Update extends HttpServlet
{
    String gname,price;
    ShopMethod sp=new ShopMethod();
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
 {
            try
            {
             PrintWriter pw=res.getWriter();
            gname=req.getParameter("gname");
            price=req.getParameter("price1");
            Order or=new Order();
            or.setGname(gname);
             or.setGprice(price);
             sp.update(or);
             res.sendRedirect("/show");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
 
}
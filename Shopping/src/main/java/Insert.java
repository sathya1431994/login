import java.io.*;  
import java.sql.*;  
import java.sql.Connection;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.annotation.*; 
import dao.Shopdao;
import javax.servlet.RequestDispatcher;
import order.Order;
@WebServlet("/insert")
public class Insert extends HttpServlet
{
    String gname,price;
    ShopMethod sp=new ShopMethod();
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
 {
            try
            {
             PrintWriter pw=res.getWriter();
            gname=req.getParameter("gname");
            price=req.getParameter("price");
            Order or=new Order();
            or.setGname(gname);
             or.setGprice(price);
             sp.insert(or);
            ResultSet data1=sp.order();
            pw.println("<table border=3 align='center'>");
            pw.println("<tr><th>Games</th><th>Price</th><th>Delete</th><th>Modify</th></tr>");
            while(data1.next())
            {
                  String delete="<a href=delete_items?gname="+data1.getString(1)+">Delete</a>"+"</td><td>";
                  String edit="<a href=edit?gname="+data1.getString(1)+">Edit</a>"+"</td><td>";
                pw.println("<tr><td>"+data1.getString(1)+"</td>"+"<td>"+data1.getString(2)+"</td>"+"<td>"+delete+"</td>"+"<td>"+edit+"</td>"+"</td></tr>");
            }
            pw.println("</table>");
           res.sendRedirect("items.jsp");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
 
}
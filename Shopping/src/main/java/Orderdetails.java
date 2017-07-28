import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import dao.Shopdao.*;
import login.Login;
import order.Order;
import javax.servlet.annotation.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.sql.*;
@WebServlet("/order")
public class Orderdetails extends HttpServlet
{
      ShopMethod sp=new ShopMethod();
     public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
            Object session=req.getSession(false).getAttribute("uname");
            if(session==session)
            {
            try
            {
            PrintWriter pw=res.getWriter();
            ResultSet items=sp.order();
            String buy="<a href=mail?"+">Buy Now</a>"+"</td><td>";
            pw.println("<table border=3 align='center'>");
            pw.println("<tr><th>Games</th><th>Price</th><th>Buy</th></tr>");
            while(items.next())
            {
                pw.println("<tr><td>"+items.getString(1)+"</td>"+"<td>"+items.getString(2)+"</td>"+"<td>"+buy+"</td></tr>");
            }
            pw.println("</table>");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
            }
            else
            {
                res.sendRedirect("index.jsp");
            }
 }

}
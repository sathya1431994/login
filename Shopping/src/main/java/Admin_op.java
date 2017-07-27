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
@WebServlet("/admin_log")
public class Admin_op extends HttpServlet
{
      ShopMethod sp=new ShopMethod();
     public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
            try
            {
            PrintWriter pw=res.getWriter();
            ResultSet data=sp.login_entries();
            pw.println("<table border=3 align='center'>");
            pw.println("<tr><th>Username</th><th>Password</th><th>Action</th></tr>");
            while(data.next())
            {
                  String delete="<a href=delete?username="+data.getString(1)+">Delete</a>"+"</td><td>";
                pw.println("<tr><td>"+data.getString(1)+"</td>"+"<td>"+data.getString(2)+"</td>"+"<td>"+delete+"</td></tr>");
            }
            pw.println("</table>");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
 }

}

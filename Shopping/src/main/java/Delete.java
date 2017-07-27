import java.io.*;  
import java.sql.*;  
import java.sql.Connection;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import javax.servlet.annotation.*; 
import dao.Shopdao;
import javax.servlet.RequestDispatcher;
@WebServlet("/delete")
public class Delete extends HttpServlet
{
    ShopMethod sp=new ShopMethod();
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {  
            try
                {  
    PrintWriter pw=response.getWriter();
    response.setContentType("text/html");
    String name=request.getParameter("username");
    sp.delete(name);
   response.sendRedirect("/admin_log");
}
catch (Exception ex) 
{
    System.out.println(ex);
}  
}  

}

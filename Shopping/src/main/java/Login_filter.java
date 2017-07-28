/*import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebFilter("/Order.jsp")
public class Login_filter implements Filter
{
     public void init(FilterConfig config)
     {

     }

     public void doFilter(ServletRequest sr,ServletResponse ss,FilterChain chain)throws ServletException,IOException
     {
      String username=sr.getParameter("username");
      String password=sr.getParameter("password");
      if(username.equals("admin")&&password.equals("admin"))
      {
          chain.doFilter(sr,ss);
              }
              else
              {
                  RequestDispatcher rs=sr.getRequestDispatcher("index.jsp");
                  rs.forward(sr,ss);
              }
     }
     
      public void destroy()
     {

     }
}
*/
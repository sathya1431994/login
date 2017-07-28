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
import java.net.InetAddress;
import java.net.UnknownHostException;
@WebFilter("/admin_op.jsp")
public class Login1 implements Filter
{
    String uname,pass;
    String msg="Attempt to Login >>>";
    ShopMethod sp=new ShopMethod();
    File_log f=new File_log();
   
    public void init(FilterConfig config)
     {

     }
        public void doFilter(ServletRequest sr,ServletResponse ss,FilterChain chain)throws ServletException,IOException,UnknownHostException
        {
            try
            {
            InetAddress ip=InetAddress.getLocalHost();
            HttpServletRequest req=(HttpServletRequest) sr;
            PrintWriter pw=ss.getWriter();
            ss.setContentType("text/html");
            uname=sr.getParameter("username");
            pass=sr.getParameter("password"); 
            Long flag=(sp.login(uname,pass)).stream().filter(x->x.getUsername().equals(uname)).filter(v->v.getPassword().equals(pass)).collect(Collectors.counting());
            if(flag!=0 && uname.equals("admin") && pass.equals("admin"))
            {
                 HttpSession session=req.getSession();
                 session.setAttribute("uname",uname);
             chain.doFilter(sr,ss);
             f.action(uname,msg,ip.getHostAddress());
            }
            else if(flag!=0 && uname!="admin" && pass!="admin")
            {
                RequestDispatcher rd=sr.getRequestDispatcher("Order.jsp");
                 HttpSession session=req.getSession();
                 session.setAttribute("uname",uname);
                 rd.include(sr,ss);
                f.action(uname,msg,ip.getHostAddress());
            }
            else
            {
                pw.println("<h2>Invalid username or password</h2>");
                
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        }
        
      public void destroy()
     {

     }
}
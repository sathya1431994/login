import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
@WebServlet("/logout")
public class Logout extends HttpServlet
{
    String msg="Attempt to Logout >>>";
   
     File_log fl=new File_log();
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
       InetAddress ip=InetAddress.getLocalHost();
          PrintWriter pw=res.getWriter();
            req.getRequestDispatcher("index.jsp").include(req,res);
            HttpSession s1=req.getSession();
            Object ss=req.getSession().getAttribute("uname");
            fl.action(ss,msg,ip.getHostAddress());
            s1.invalidate();
            res.sendRedirect("index.jsp");
            pw.println("<h2>Logged out successfully</h2>");
    }
}
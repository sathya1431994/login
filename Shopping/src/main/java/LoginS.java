import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import dao.Shopdao.*;
import login.Login;
import javax.servlet.annotation.*;
@WebServlet("/login")
public class LoginS extends HttpServlet
{
    String uname,pass;
        public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
            uname=req.getParameter("username");
            pass=req.getParameter("password");
            ///List<Login> log_test=new ArrayList<Login>();
           // log_test.add(ShopMethod.login(uname,pass));
            PrintWriter pw=res.getWriter();
            pw.println(log_test);     

        }
}
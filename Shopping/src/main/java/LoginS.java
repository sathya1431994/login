import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import dao.Shopdao.*;
import login.Login;
import javax.servlet.annotation.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
@WebServlet("/login")
public class LoginS extends HttpServlet
{
    String uname,pass;
    ShopMethod sp=new ShopMethod();
        public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
            PrintWriter pw=res.getWriter();
            uname=req.getParameter("username");
            pass=req.getParameter("password");
            Long flag=(sp.login(uname,pass)).stream().filter(x->x.getUsername().equals(uname)).filter(v->v.getPassword().equals(pass)).collect(Collectors.counting());
            if(flag!=0)
            {
                HttpSession session=req.getSession();
                session.setAttribute("uname",uname);
                res.sendRedirect("index.jsp");
                pw.println("<h1>Login Successfully!!!</h1>");
            }
            else
            {
                pw.println("Invalid username or password");
            }
        }
}
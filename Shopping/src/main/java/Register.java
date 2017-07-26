import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
import dao.Shopdao.*;
import login.Login;
import javax.servlet.annotation.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
@WebServlet("/register")
public class Register extends HttpServlet
{
    String uname,pass,email;
        ShopMethod sp1=new ShopMethod();
        public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
        {
             PrintWriter pw=res.getWriter();
            uname=req.getParameter("username");
            pass=req.getParameter("password");
            email=req.getParameter("email");
            Login l1=new Login();
            l1.setUsername(uname);
             l1.setPassword(pass);
             l1.setEmail(email);
             sp1.register(l1);
            RequestDispatcher rd=req.getRequestDispatcher("/login"); 
             rd.forward(req, res);
         
  }
}
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet("/logout")
public class Logout extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
    {
          PrintWriter pw=res.getWriter();
            req.getRequestDispatcher("index.jsp").include(req,res);
            HttpSession s1=req.getSession();
            s1.invalidate();
            pw.println("<h2>Logged out successfully</h2>");
    }
}
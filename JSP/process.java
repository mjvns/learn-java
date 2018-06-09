import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/process")
public class process extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("firstname");
        PrintWriter pr = response.getWriter();
       // pr.println(s);
        System.out.println(s);
        request.setAttribute("Madhukar","This is the power of java");
       // response.sendRedirect("welcome.jsp");
        RequestDispatcher d = request.getRequestDispatcher("page.jsp");
        //d.forward(request,response);
        d.include(request,response);
    }
}

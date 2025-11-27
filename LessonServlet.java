package src;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LessonServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Lessons Page Placeholder</h1>");
    }
}

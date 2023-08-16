package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Display the form in the doGet method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>User Login Form</h2>");
        out.println("<form method='post' action='UserFormServlet'>");
        out.println("Username: <input type='text' name='username'><br>");
        out.println("Password: <input type='password' name='password'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Read the submitted form data in the doPost method
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Display the values back in the form
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>User Login Form</h2>");
        out.println("<form method='post' action='UserFormServlet'>");
        out.println("Username: <input type='text' name='username' value='" + username + "'><br>");
        out.println("Password: <input type='password' name='password' value='" + password + "'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("<h3>Submitted Username: " + username + "</h3>");
        out.println("<h3>Submitted Password: " + password + "</h3>");
        out.println("</body></html>");
    }
}


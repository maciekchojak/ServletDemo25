package com.sda;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(HelloServlet.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        String noteContent = request.getParameter("noteContent");

        //redirect
        response.sendRedirect("/aboutme");

        //forward
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/addnote");
        requestDispatcher.forward(request,response);

        logger.info("noteContent: " + noteContent);
    }

    // http://localhost:8081/hello?noteContent=zakupy
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Hello APP</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<p>Hello World</p>");

        writer.println("<form method='post' action='/hello'>");
        writer.println("<label for='note'>Note:</label>");
        writer.println("<input id='note' type='text' name='noteContent'/>");
        writer.println("<input type='submit' value='Add'/>");
        writer.println("</form>");

        writer.println("</body>");
        writer.println("</html>");
    }

}

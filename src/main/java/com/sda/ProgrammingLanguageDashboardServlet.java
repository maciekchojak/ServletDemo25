package com.sda;

import org.apache.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgrammingLanguageDashboardServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ProgrammingLanguageDashboardServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        logger.info("ProgrammingLanguageDashboardServlet started");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        logger.info("ProgrammingLanguageDashboardServlet started");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // kodowanie polskich znaków

        PrintWriter writer = response.getWriter();
        //wyśrodkowanie tabeli horyzontalnie
        writer.println("<table border='1' style='margin-left:auto; margin-right:auto; width:60%;'");

        writer.println("<tr>");
        writer.println("<th>Name</th>");
        writer.println("<th>Using</th>");
        writer.println("<th>Level</th>");
        writer.println("</tr>");

        writer.println("<tr>");
        writer.println("<td>Java</td>");
        writer.println("<td>WEB, Desktop, Mobile</td>");
        writer.println("<td>3/5</td>");
        writer.println("</tr>");


        writer.println("<tr>");
        writer.println("<td>PHP</td>");
        writer.println("<td>WEB</td>");
        writer.println("<td>2/5</td>");
        writer.println("</tr>");

        writer.println("<table>");
        writer.println("</table>");


    }
}

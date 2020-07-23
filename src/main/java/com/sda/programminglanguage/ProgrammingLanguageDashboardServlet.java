package com.sda.programminglanguage;

import org.apache.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

        List<ProgrammingLanguage> programmingLanguages = ProgrammingLanguageDataHolder.getInstance().getProgrammingLanguages();

        programmingLanguages.forEach(elem -> {
            writer.println("<tr>");
            writer.println("<td>"+elem.getName()+"</td>");
            writer.println("<td>"+elem.getUsing()+"</td>");
            writer.println("<td>"+elem.getLevel()+"</td>");
            writer.println("</tr>");
        });

        writer.println("<table>");
        writer.println("</table>");

    }
}

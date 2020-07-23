package com.sda.programminglanguage;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddProgrammingLanguageServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(AddProgrammingLanguageServlet.class.getName());

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h2>Add programming language</h2>");
        writer.println("<form method='post' action='/addLanguage'>");

        writer.println("<label for='name'>Programming language name</label>");
        writer.println("<input type='text' id='name' name='name' />");
        writer.println("<br/><br/>");

        writer.println("<label for='using'>Programming language using</label>");
        writer.println("<input type='text' id='using' name='using' />");
        writer.println("<br/><br/>");

        writer.println("<label for='level1'>Programming language level</label>");


        writer.println("  <input type=\"radio\" id=\"level1\" name=\"level\" value=\"1/5\">");
        writer.println("<label for='level1'>1/5</label>");

        writer.println("  <input type=\"radio\" id=\"level2\" name=\"level\" value=\"2/5\">");
        writer.println("<label for='level2'>2/5</label>");


        writer.println("  <input type=\"radio\" id=\"level3\" name=\"level\" value=\"3/5\">");
        writer.println("<label for='level3'>3/5</label>");


        writer.println("  <input type=\"radio\" id=\"level4\" name=\"level\" value=\"4/5\">");
        writer.println("<label for='level4'>4/5</label>");


        writer.println("  <input type=\"radio\" id=\"level5\" name=\"level\" value=\"5/5\">");
        writer.println("<label for='level5'>5/5</label>");

        writer.println("<br/><br/>");
        writer.println("<input type='submit' value='Add'/>");

        writer.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String using = request.getParameter("using");
        String level = request.getParameter("level");

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(name,using,level);
        ProgrammingLanguageDataHolder.getInstance().addProgrammingLanguage(programmingLanguage);

        logger.info(name +" "+using+" "+level);
        response.sendRedirect("/languages");
    }

}

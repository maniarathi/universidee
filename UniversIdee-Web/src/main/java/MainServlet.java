

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String PAGE_HEADER = "<html><head><title>Welcome to Universidee</title></head><body style=\"background-color:#f0f0f0;\">";
    static String PAGE_FOOTER = "</body></html>";

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            PrintWriter writer = response.getWriter();
            writer.println(PAGE_HEADER);
            writer.println("<table width=100% height:20px style=\"background-color:#0066cc\"><tr><td><h1 style=\"color:#f8f8f8; text-align:center; font-family:sans-serif;vertical-align:center\">UniversIdee</h1></td></tr></table>");
            writer.println("<br/><br/><br/>");
            writer.println("<table cellspacing=\"30\" style=\"font-family:serif;\"><tr><td><h4 style=\"color:#0066cc\">Sports</h4><p>There is a problem with the availability of Football.</p></td><td><h4 style=\"color:#0066cc\">Computer Science Department</h4><p>Another printer must be installed in DL172.</p></td></tr></table>");
            writer.println("<table cellspacing=\"30\" style=\"font-family:serif;\"><tr><td><h4 style=\"color:#0066cc\">Arts and Science Department</h4><p>There is a problem with water dispenser in the ground floor.</p></td><td><h4 style=\"color:#0066cc\">Electrical Department</h4><p>There is no WiFi signal in basement of Caldwell.</p></td></tr></table>");
            writer.println(PAGE_FOOTER);
            writer.close();
	}

}

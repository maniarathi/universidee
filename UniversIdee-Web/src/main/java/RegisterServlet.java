

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	static String PAGE_HEADER = "<html><head /><body>";
	static String PAGE_FOOTER = "</body></html>";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter writer = response.getWriter();
    	writer.println(PAGE_HEADER);
        writer.println("<h1>Register</h1>");
        writer.println("<form name='register' method='get'>");
        writer.println("First name: <input type='text' name='firstname'><br>");
        writer.println("Last name: <input type='text' name='lastname' /><br />");
        writer.println("Email: <input type='text' name='email' /><br />");
        writer.println("University: <select name='school'><option value='osu'>The Ohio State University</option><option value='michigan'>University of Michigan</option></select><br />");
        writer.println("Username: <input type='text' name='username' /><br />");
        writer.println("Password: <input type='password' name='password' /><br />");
        writer.println("<input type='submit' value='Register' /><br />");
        writer.println("</form>");
        writer.println(PAGE_FOOTER);
        writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static String PAGE_HEADER = "<html><head><title>Login to Universidee</title></head><body style=\"background-color:#f0f0f0;\">";
	static String PAGE_FOOTER = "</body></html>";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
    	writer.println(PAGE_HEADER);
        writer.println("<h1>Login</h1>");
        writer.println("<form name='login' method='get'>");
        writer.println("Username: <input type='text' name='username'/><br />");
        writer.println("Password: <input type='password' name='password'/><br />");
        writer.println("<input type='submit' value='Login'/><br />");
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

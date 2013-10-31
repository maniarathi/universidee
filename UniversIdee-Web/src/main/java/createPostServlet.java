package user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createPost")
public class createPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String PAGE_HEADER = "<html><head> <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"><title>user homepage</title></head><body><h1> Universidee </h1><h1><table><tr>";
	private String PAGE_FOOTER= " </tr></table></h1><h2 onload=\"focusIn();\"><form>content:<input type = \"text\" name = \"content\"><br>rating:<input type = \"rating\" name =\"rating\"></form><table><tr><td><button id=\"MyButton\" on click = \"submitPost\">submit</td></tr></table></h2></body></html>";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println(PAGE_HEADER);
		writer.println("<td>"+"Mengqi"+"</td><td>"+"Ohio Sate University"+"</td>");
		writer.println(PAGE_FOOTER);
	}


}

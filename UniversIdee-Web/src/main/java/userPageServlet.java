package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.Context;
import javax.naming.InitialContext;

import sessionBeans.commentAdded;
import sessionBeans.postAdded;


@WebServlet("/myPage")
public class userPage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	static String PAGE_HEADER = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"/Users/mengqizhou/Desktop/html/style.css\"><title>user homepage</title></head><body><h1> Universidee </h1><h1><table><tr>";
    static String PAGE_FOOTER="</tr></table></h2></body></html>";  
    static String Button = "<td><button id=\"MyButton\" on click = \"createPost\">post</button></td>";
    static String PAGE_MIDDER="</tr></table></h1><h2 onload=\"focusIn();\"><table><tr>";
	
    @EJB
    postAdded myPost;
    
    @EJB
    commentAdded myComment;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println(PAGE_HEADER);
		writer.println("<td>"+"Mengqi"+"</td>"+"<td>"+"Ohio State University"+"</td>");
		writer.println(Button);
		writer.println(PAGE_MIDDER);
		writer.println("<td> my posts</td></tr><tr>");
		for(List<String> post : myPost.postAdded(2)){
			
			writer.println("<td>content:"+post.get(0)+"</td>");
			writer.println("<td>rating:"+post.get(1)+"</td>");
			writer.println("<td>time:"+post.get(2)+"</td>");
			writer.println("<td>date:"+post.get(3)+"</td>");
		}
		writer.println("</tr><tr border=\"1\">");
		writer.println("<td>my comments</td><tr>");
		for (List<String> comment:myComment.commentAdded(2)){
			writer.println("<td>comment:"+comment.get(0)+"</td>");
			writer.println("<td>time:"+comment.get(1)+"</td>");
			writer.println("<td>date:"+comment.get(2)+"</td>");
			writer.println("<td>post :"+comment.get(3)+"</td>");			
		}
		writer.println(PAGE_FOOTER);
	}
}





import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Root
 */
@WebServlet({ "/Root", "/" })
public class Root extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Root() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * response.getWriter().append("<!DOCTYPE html>");
		 * response.getWriter().append("<html>"); response.getWriter().append("<head>");
		 * response.getWriter().append("<meta charset='EUC-KR'>");
		 * response.getWriter().append("<title>JSPEX01_root.servlet</title>");
		 * response.getWriter().append("</head>");
		 * response.getWriter().append("<body>");
		 * response.getWriter().append("<h2>hello, servlet</h2>");
		 * response.getWriter().append("<hr>"); 
		 * response.getWriter().append("ezen<br>");
		 * response.getWriter().append("<span style=\"color:red\">JSP</span>");
		 * response.getWriter().append("</body>");
		 * response.getWriter().append("</html>");
		 */
		
		response.getWriter().append("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
					+ "<meta charset='EUC-KR'>"
					+ "<title>jspex01</title>"
				+ "</head>"
				+ "<body>"
					+ "<h2>hello, servlet</h2>"
					+ "<hr>"
					+ "ezen<br>"
					+ "<span style=\"color:red\">JSP</span>"
				+ "</body>"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cal
 */
@WebServlet("/cal")
public class cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 파라메타로 넘어온 값들을 키값으로 각 변수에 넣는다.
		String str_X = request.getParameter("x");
		String str_Y = request.getParameter("y");
		String str_OP = request.getParameter("op");
		
		// 각 변수들에 저장된 값을 출력해본다.
		response.getWriter().append("x : " + str_X +"\n");
		response.getWriter().append("op : " + str_OP +"\n");
		response.getWriter().append("y : " + str_Y +"\n");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

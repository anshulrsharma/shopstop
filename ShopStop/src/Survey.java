

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Survey
 */
@WebServlet("/Survey")
public class Survey extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Survey() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String comments=request.getParameter("txtcomment");
		String items=request.getParameter("rbitems");
		String s=request.getParameter("survey");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Shop Stop</title></head>");
		out.println("<body bgcolor=aqua>");
		out.println("<h1>"+s+"</h1><br>");
		out.println("congratulations, you are qualified for lucky draw");
		out.println("<br>");
		out.println("your comments:"+comments);
		out.println("<br>");
		out.println("number of items purchased"+items);
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
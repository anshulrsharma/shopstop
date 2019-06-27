

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessLogin
 */
@WebServlet("/SessLogin")
public class SessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("userName");
			String password=request.getParameter("userPassword");
			HttpSession session=request.getSession();
			pw.print("Session id: "+session.getId());
			pw.print("Session id: "+session.getCreationTime());
			session.setAttribute("uname",name);
			session.setAttribute("upass",password);
			pw.print("<a href='SessWelcome'>View details </a>");
			pw.close();
			}
		catch (Exception e) {
			
			System.out.println(e);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

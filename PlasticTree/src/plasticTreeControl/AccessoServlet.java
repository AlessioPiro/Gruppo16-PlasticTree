package plasticTreeControl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import plasticTreeModel.Dao;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class AccessoServlet
 */
@WebServlet("/AccessoServlet")
public class AccessoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized(session) {
			String email = request.getParameter("email");
			String password = request.getParameter("psw");
			Dao dao = (Dao) session.getAttribute("dao");
			if(dao == null)
			{
				dao = new Dao();
				session.setAttribute("dao", dao);
			}
			Utente utente = dao.login(email, password);
			if(utente == null)
			{
				request.setAttribute("loginError", true);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			session.setAttribute("utente", utente);
			request.getRequestDispatcher("HomeServlet").forward(request, response);
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

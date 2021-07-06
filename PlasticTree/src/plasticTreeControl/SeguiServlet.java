package plasticTreeControl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import plasticTreeModel.Dao;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class SeguiServlet
 */
@WebServlet("/SeguiServlet")
public class SeguiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeguiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = (Dao)request.getSession().getAttribute("dao");
		Utente u= (Utente) request.getSession().getAttribute("utente");
		String id=request.getParameter("utenteSeguito");
		Utente u2= dao.getUtente(id);
		
		dao.seguiClick(u, u2);
		
		request.setAttribute("altroUtente", u2);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
	              "/altroUtente.jsp");
	      dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

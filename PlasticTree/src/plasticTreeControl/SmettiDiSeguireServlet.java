package plasticTreeControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import plasticTreeModel.Dao;
import plasticTreeModel.ObiettivoUtente;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class SmettiDiSeguireServlet
 */
@WebServlet("/SmettiDiSeguireServlet")
public class SmettiDiSeguireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SmettiDiSeguireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized(session) {
			String idUtenteCancellato = (String) request.getParameter("utenteCancellato");
			Dao dao = (Dao) session.getAttribute("dao");
			Utente utente = (Utente) session.getAttribute("utente");
			utente.removeFollower(idUtenteCancellato);
			ArrayList<Utente> listaSeguiti = utente.getFollower(); 
			request.setAttribute("listaSeguiti", listaSeguiti);
			request.setAttribute("utenteCancellato", dao.getUtente(idUtenteCancellato));
			RequestDispatcher rs = request.getRequestDispatcher("listaSeguiti.jsp");
			rs.forward(request, response);
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

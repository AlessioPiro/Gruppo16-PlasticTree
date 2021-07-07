package plasticTreeControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import plasticTreeModel.Dao;
import plasticTreeModel.Obiettivo;
import plasticTreeModel.ObiettivoUtente;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class RiscattaObiettivo
 */
@WebServlet("/RiscattaObiettivo")
public class RiscattaObiettivo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RiscattaObiettivo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized(session) {
			Dao dao = (Dao) session.getAttribute("dao");
			Utente utente = (Utente) session.getAttribute("utente");
			String idObiettivo = request.getParameter("id");
			dao.riscattaObiettivo(utente.getIdUtente(), idObiettivo);
			request.getRequestDispatcher("ObiettiviUtenteServlet").forward(request, response);
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

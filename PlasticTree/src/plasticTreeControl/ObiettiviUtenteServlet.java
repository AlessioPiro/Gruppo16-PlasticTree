package plasticTreeControl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import plasticTreeModel.*;

/**
 * Servlet implementation class ObiettiviUtenteServlet
 */
@WebServlet("/ObiettiviUtenteServlet")
public class ObiettiviUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObiettiviUtenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized(session) {
			if (session.getAttribute("dao") == null) //Il Dao va recuperato dalla sessione, questo è un codice per testare il sito non completo
			{
				Dao dao = new Dao(); 
				session.setAttribute("dao", dao); 
			}
			Dao dao = (Dao) session.getAttribute("dao");
			Utente utente = (Utente) session.getAttribute("utente");
			Utente prova = new Utente("U1", "Lorenzo", "Aiello", new Date(), "Via Padova 33, Avellino", "laiello@gmail.com", "12345678");
			ArrayList<ObiettivoUtente> obiettiviUtente = dao.getObiettiviUtente(prova); //prova va sostituito con utente
			ArrayList<Obiettivo> obiettivi = dao.getTuttiObiettivi();
			request.setAttribute("obiettiviUtente", obiettiviUtente);
			request.setAttribute("obiettivi", obiettivi);
			RequestDispatcher rs = request.getRequestDispatcher("obiettiviUtente.jsp");
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

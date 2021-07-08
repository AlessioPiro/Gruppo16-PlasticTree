package plasticTreeControl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import plasticTreeModel.Dao;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class ViewProfiloUtente
 */
@WebServlet("/ModificaProfiloUtenteServlet")
public class ModificaProfiloUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaProfiloUtenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utente u=(Utente) request.getSession().getAttribute("utente");
		Dao dao= (Dao) request.getSession().getAttribute("dao");
		
		String nome = request.getParameter("nome");
	    String cognome = request.getParameter("cognome");
	    String indirizzo = request.getParameter("indirizzo");
	    String email = request.getParameter("email");
	    String pwd = request.getParameter("psw");
	    String data = request.getParameter("data");
	      
	     Utente um=dao.modificaDati(nome, cognome, data, indirizzo, email, pwd, u);
	     request.getSession().setAttribute("utente", um);
	     request.setAttribute("confermaCond", true);
	     String s="no";
			request.setAttribute("profiloCond", s);
	      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
	              "/profiloUtente.jsp");
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

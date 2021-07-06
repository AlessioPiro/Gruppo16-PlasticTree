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
		
		String nome = u.getNome();
	      if (request.getParameter("nome") != null) {
	        nome = request.getParameter("nome");
	      }
	      String cognome = u.getCognome();
	      if (request.getParameter("cognome") != null) {
	        cognome = request.getParameter("cognome");
	      }
	      String indirizzo = u.getIndirizzo();
	      if (request.getParameter("indirizzo") != null) {
	        indirizzo = request.getParameter("indirizzo");
	      }
	      String email = u.getEmail();
	      if (request.getParameter("email") != null) {
	        email = request.getParameter("email");
	      }
	      String pwd = u.getPassword();
	      if (request.getParameter("psw") != null) {
	        pwd = request.getParameter("psw");
	      }
	      SimpleDateFormat htmlFormat = new SimpleDateFormat("yyyy-MM-dd");
	      Date birth=u.getNascita();
	      if (request.getParameter("data") != null) {
	      try {
	          birth=htmlFormat.parse(request.getParameter("data"));
	        } catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      
	      Utente um=dao.modificaDati(nome, cognome, birth.toString(), indirizzo, email, pwd, u);
	      request.getSession().setAttribute("utente", um);
	      
	      RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
	              "profiloUtente.jsp");
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

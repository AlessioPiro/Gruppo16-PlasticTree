package plasticTreeControl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import plasticTreeModel.Dao;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class AggiungiCreditoServlet
 */
@WebServlet("/AggiungiCreditoServlet")
public class AggiungiCreditoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AggiungiCreditoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = (Dao)request.getSession().getAttribute("dao");
		Utente u= (Utente) request.getSession().getAttribute("utente");
		String codice= request.getParameter("codice");
		
		if(codice==null) {
			request.setAttribute("importo", 0.0f);
			request.setAttribute("conferma", true);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
		              "/aggiungiCredito.jsp");
		      dispatcher.forward(request, response);
        }else {
		  boolean valid=dao.isValido(codice);
		  float importo=0.0f;
		  if(valid==true) {
			importo=dao.riscattaCodice(codice, u);
			request.setAttribute("importo", importo);
			request.setAttribute("conferma", true);
			dao.creaPostCodice(u, dao.getCodice(codice));
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
		              "/aggiungiCredito.jsp");
		      dispatcher.forward(request, response);
		}else {
			request.setAttribute("importo", 0.0f);
			request.setAttribute("conferma", true);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
		              "/aggiungiCredito.jsp");
		      dispatcher.forward(request, response);
          }
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

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
 * Servlet implementation class PaypalServlet
 */
@WebServlet("/PaypalServlet")
public class PaypalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaypalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = (Dao)request.getSession().getAttribute("dao");
		Utente u= (Utente) request.getSession().getAttribute("utente");
		float importo=Float.parseFloat( request.getParameter("importo"));
		
		if(request.getParameter("importo")!=null&&!request.getParameter("importo").equals("")) {
				if(dao.bonificoImportoCheck(importo, u)==true) {
					dao.riscuoti(importo, u);
					request.setAttribute("confermaPag", true);
					request.setAttribute("msgPag", "Pagamento Riuscito!");
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
				              "/portafoglio.jsp");
				      dispatcher.forward(request, response);
				}else {
					request.setAttribute("confermaPag", true);
					request.setAttribute("msgPag", "Bisogna avere almeno &euro;10.00 per prelevare!");
					RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
				              "/portafoglio.jsp");
				      dispatcher.forward(request, response);
				}
		}else {
			request.setAttribute("confermaPag", true);
			request.setAttribute("msgPag", "Inserisci valori corretti!");
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
		              "/portafoglio.jsp");
		      dispatcher.forward(request, response);
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

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
 * Servlet implementation class LikeServlet
 */
@WebServlet("/LikeServlet")
public class LikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Dao dao= (Dao)request.getSession().getAttribute("dao");
		Utente u=dao.getUtente( request.getParameter("utenteLike"));
		String id=request.getParameter("idPost");
		String pagina=request.getParameter("pagina");
		Utente uGuardato=dao.getUtente( request.getParameter("idUtenteGuardato"));
		
		dao.clickMiPiace(id, u);
		
		if(uGuardato != null)
		{
			request.setAttribute("altroUtente", uGuardato);
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
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

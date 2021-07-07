package plasticTreeControl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import plasticTreeModel.Dao;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class CommentiServlet
 */
@WebServlet("/CommentiServlet")
public class CommentiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = (Dao)request.getSession().getAttribute("dao");
		String idUtente= request.getParameter("idUtente");
		String idPost= request.getParameter("idPost");
		String commento=request.getParameter("commentiNew");
		ArrayList<String> commenti=new ArrayList<String>();
		boolean fine=false;
		while(fine==false) {
			if(commento.contains("-")) {
				commenti.add(commento.substring(0, commento.indexOf("-")));
				commento=commento.substring(commento.indexOf("-")+1);
			}else if(commento.length() > 0){
				commenti.add(commento);
				fine=true;
			}else if(commento.length() <= 0){
				fine=true;
			}
		}
		
		for(int i=0;i<commenti.size();i++) {
			dao.aggiungiCommento(commenti.get(i), dao.getUtente(idUtente), idPost);
		}
		
		Utente uGuardato=dao.getUtente( request.getParameter("idUtenteGuardato"));
		
		if(uGuardato != null)
		{
			request.setAttribute("altroUtente", uGuardato);
		}
		
		String pagina= request.getParameter("paginaPost");
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(
	              "/"+pagina+".jsp");
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

package plasticTreeControl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import plasticTreeModel.Dao;
import plasticTreeModel.Obiettivo;
import plasticTreeModel.ObiettivoUtente;
import plasticTreeModel.Utente;

/**
 * Servlet implementation class EffettuaRegistrazioneServlet
 */
@WebServlet("/EffettuaRegistrazioneServlet")
@MultipartConfig
public class EffettuaRegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EffettuaRegistrazioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		synchronized(session) {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String email = request.getParameter("email");
			String psw = request.getParameter("psw");
			String indirizzo = request.getParameter("indirizzo");
			String data = request.getParameter("data");
			
			Dao dao = (Dao) session.getAttribute("dao");
			if(dao == null)
			{
				dao = new Dao();
				session.setAttribute("dao", dao);
			}
			if(dao.isEmailDoppia(email))
			{
				request.setAttribute("registrationError", true);
				request.getRequestDispatcher("RegistrazioneServlet").forward(request, response);
				return;
			}
			Utente u = dao.registrazione(nome, cognome, data, indirizzo, email, psw);
			this.uploadImage(request, u.getIdUtente());
			session.setAttribute("utente", u);
			request.getRequestDispatcher("ProfiloUtenteServlet").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String uploadImage(
		HttpServletRequest request, String id) throws IOException, ServletException {
		 String imgPath = "";
		try
		{
			if (request.getPart("file") != null) {
			      Part filePart = request.getPart(
			          "file"); // Retrieves <input type="file" name="file">
			      String fileName = Paths.get(filePart.getSubmittedFileName())
			          .getFileName()
			          .toString(); // MSIE fix.
			      InputStream fileContent = filePart.getInputStream();

			      imgPath = id + ".jpg";

			      File uploads = new File(request.getServletContext().getRealPath("fotoUtente"));
			      File file = new File(uploads, imgPath);

			      Files.copy(fileContent, file.toPath());
			    }
		}
		catch (FileAlreadyExistsException e)
		{
			imgPath = id + ".jpg";
		}

	    return imgPath;
		  }

}

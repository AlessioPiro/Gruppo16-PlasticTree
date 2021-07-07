<%@ page language="java" import="plasticTreeControl.*, plasticTreeModel.*, java.util.*, java.math.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="Css/ricerca.css" type="text/css">
		<title>Ricerca - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<%!
			String idUtente, nome, cognome, citta, ricerca;
		%>
		<%
			ArrayList<Utente> listaUtenti = (ArrayList<Utente>) request.getAttribute("ricerca");
			if (listaUtenti == null)
			{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			ricerca = (String) request.getAttribute("termineDiRicerca");
		%>
		<div class="ricercaEScrittaContenitore">
			<h3 class="ricercaTesto">Risultati per <%=ricerca%></h3>
			<% 
				if(listaUtenti.size() == 0 || listaUtenti == null)
				{
			%>
			<div class="nessunRisultato">Non sono stati trovati risultati per questa ricerca.</div>
			<%
				}
			%>				
			<%
				if(listaUtenti.size() > 0)
				{
			%>
				<div class="ricercaContenitore">
			<%
					for(Utente u : listaUtenti)
					{
						idUtente = u.getIdUtente();
						nome = u.getNome();
						cognome = u.getCognome();
						citta = u.getIndirizzo();
						citta = citta.substring(citta.lastIndexOf(",") + 1);
			%>
				<form class="utente" name="userForm" action="AltroUtenteServlet" method="POST">
					<button class="pulsanteUtente">
						<img id="utenteFoto" class="utenteFoto" alt="<%=idUtente%>" src="fotoUtente/<%=idUtente%>.jpg">
						<div class="scritteContenitore">
							<p class="nomeUtente"><%=nome%> <%=cognome%></p>
							<p class="citta"><%=citta%></p>
						</div>
					</button>
					<input type="hidden" name="altroUtente" value="<%=idUtente%>">
				</form>
			<%
					}
				}
			%>
			</div>
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
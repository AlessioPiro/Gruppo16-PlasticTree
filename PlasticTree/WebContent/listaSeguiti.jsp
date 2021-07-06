<%@ page language="java" import="plasticTreeControl.*, plasticTreeModel.*, java.util.*, java.math.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="Css/listaSeguiti.css" type="text/css">
		<title>Seguiti - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<%!
			String idUtente, nome, cognome, citta; 
			Utente utenteCancellato;
		%>
		<%
			utenteCancellato = (Utente) request.getAttribute("utenteCancellato");
			ArrayList<Utente> listaUtenti = (ArrayList<Utente>) request.getAttribute("listaSeguiti");
			if(utenteCancellato != null)
			{
				String nomeCancellato = utenteCancellato.getNome();
				String cognomeCancellato = utenteCancellato.getCognome();
				String idCancellato = utenteCancellato.getIdUtente();
		%>	
			<div class="utenteCancellato">
				<p class="scrittaUtenteCancellato">Hai smesso di seguire <b><%=nomeCancellato%> <%=cognomeCancellato%></b>. E' stato un errore?</p>
				<form class="utenteForm" name="userRiseguiForm" action="SeguiDiNuovoServlet" method="POST">
					<input type="hidden" name="utenteCancellato" value="<%=idCancellato%>">
					<input type="submit" value="Segui di nuovo">
				</form>
			</div>
		<% 
			}
		%>
		<div class="seguitiEScrittaContenitore">
			<h3 class="seguitiTesto">Persone che segui</h3>
			<% 
				if(listaUtenti.size() == 0 || listaUtenti == null)
				{
			%>
			<div class="nessunRisultato">Non segui nessuno, sei un tipo solitario?</div>
			<%
				}
			%>				
			<%
				if(listaUtenti.size() > 0)
				{
			%>
				<div class="seguitiContenitore">
			<%
					for(Utente u : listaUtenti)
					{
						idUtente = u.getIdUtente();
						nome = u.getNome();
						cognome = u.getCognome();
						citta = u.getIndirizzo();
						citta = citta.substring(citta.lastIndexOf(",") + 1);
			%>
					<div class="utente">
						<img id="utenteFoto" class="utenteFoto" alt="<%=idUtente%>" src="fotoUtente/<%=idUtente%>.jpg">
						<div class="scritteContenitore">
							<p class="nomeUtente"><%=nome%> <%=cognome%></p>
							<p class="citta"><%=citta%></p>
						</div>
						<form class="utenteForm" name="userForm" action="SmettiDiSeguireServlet" method="POST">
							<input type="hidden" name="utenteCancellato" value="<%=idUtente%>">
							<input type="submit" value="Smetti di seguire">
						</form>
					</div>
			<%
					}
				}
			%>
			</div>
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
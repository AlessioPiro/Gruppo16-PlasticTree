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
			//ArrayList<Utente> listaUtenti = (ArrayList<Utente>) request.getAttribute("utenti");
			//ricerca = request.getAttribute("ricerca");
		%>
		<% 
			//Codice di Test
			ricerca = "Aiello";
			ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
			Utente test1 = new Utente("1", "Lorenzo", "Aiello", new Date(), "Via Padova 33, Avellino", "example@gmail.com", "12345678");
			Utente test2 = new Utente("2", "Patrizio", "Aiello", new Date(), "Via Padova 33, Padova", "example@gmail.com", "12345678");
			Utente test3 = new Utente("3", "Gennaro", "Aiello", new Date(), "Via Padova 33, Bologna", "example@gmail.com", "12345678");
			Utente test4 = new Utente("4", "Oronzo", "Aiello", new Date(), "Via Padova 33, Cesena", "example@gmail.com", "12345678");
			Utente test5 = new Utente("5", "Paolo", "Aiello", new Date(), "Via Padova 33, Napoli", "example@gmail.com", "12345678");
			listaUtenti.add(test1);
			listaUtenti.add(test2);
			listaUtenti.add(test3);
			listaUtenti.add(test4);
			listaUtenti.add(test5);
		%>
		<div class="ricercaEScrittaContenitore">
			<h3 class="ricercaTesto">Risultati per <%=ricerca%></h3>
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
						<img id="utenteFoto" class="utenteFoto" alt="<%=idUtente%>" src="fotoUtente/placeholderUtente.png">
						<div class="scritteContenitore">
							<p class="nomeUtente"><%=nome%> <%=cognome%></p>
							<p class="citta"><%=citta%></p>
						</div>
					</button>
				</form>
			<%
				}
			%>
			</div>
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
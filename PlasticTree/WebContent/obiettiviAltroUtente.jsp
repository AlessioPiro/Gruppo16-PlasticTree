<%@ page language="java" import="plasticTreeControl.*, plasticTreeModel.*, java.util.*, java.math.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<%!
		String id, titolo, descrizione, nomeUtente, cognomeUtente;
		float ricompensa;
		boolean raggiunto, riscattato;
	%>
	<%
		ArrayList<Obiettivo> obiettivi = (ArrayList<Obiettivo>) request.getAttribute("obiettivi");
		ArrayList<ObiettivoUtente> obiettiviUtente = (ArrayList<ObiettivoUtente>) request.getAttribute("obiettiviUtente");
		Utente altroUtente = (Utente) request.getAttribute("altroUtente");
		Utente u=(Utente) request.getSession().getAttribute("utente");
		if (u == null)
		{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		nomeUtente = altroUtente.getNome();
		cognomeUtente = altroUtente.getCognome();
	%>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="Css/obiettiviUtente.css" type="text/css">
		<title>Obiettivi di <%=nomeUtente%> <%=cognomeUtente%> - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		
		<div class="obiettiviEScrittaContenitore">
			<h3 class="obiettiviTesto">Obiettivi di <%=nomeUtente%> <%=cognomeUtente%></h3>
			<div class="obiettiviContenitore">
				<%
					int cont = 0;	
					for(Obiettivo o : obiettivi)
					{
						ObiettivoUtente ou = obiettiviUtente.get(cont);
						id = o.getIdObiettivo();
						titolo = o.getTitolo();
						descrizione = o.getDescrizione();
						ricompensa = o.getRicompensa();
						raggiunto = ou.isRaggiunto();
						riscattato = ou.isRiscattato();
						cont++;
				%>
				<%
					if (!riscattato)
					{
				%>
				<div class="obiettivo" id="obiettivoBloccato">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/<%=id%>.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%>0</p>
					</div>
					<div class="formRiscatta">
						<p class="scrittaRiscattato">Bloccato</p>
					</div>
				</div>
				<%
					}
					else
					{
				%>
				<div class="obiettivo" id="obiettivoRiscattato">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/<%=id%>.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%>0</p>
					</div>
					<div class="formRiscatta">
						<p class="scrittaRiscattato">Raggiunto</p>
					</div>
				</div>
				<% 
					}
				%>
			<%
				}
			%>
			</div>
		</div>
		
		<jsp:include page="footer.jsp"/>
	</body>
</html>
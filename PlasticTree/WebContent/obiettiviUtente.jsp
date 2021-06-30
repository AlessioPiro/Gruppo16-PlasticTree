<%@ page language="java" import="plasticTreeControl.*, plasticTreeModel.*, java.util.*, java.math.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="Css/obiettiviUtente.css" type="text/css">
		<title>Obiettivi - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<%!
			String id, titolo, descrizione;
			float ricompensa;
			boolean raggiunto, riscattato;
		%>
		<%
			ArrayList<Obiettivo> obiettivi = (ArrayList<Obiettivo>) request.getAttribute("obiettivi");
			ArrayList<ObiettivoUtente> obiettiviUtente = (ArrayList<ObiettivoUtente>) request.getAttribute("obiettiviUtente");
		%>
		<div class="obiettiviEScrittaContenitore">
			<h3 class="obiettiviTesto">Obiettivi</h3>
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
					if (raggiunto && !riscattato)
					{
				%>
				<div class="obiettivo" id="obiettivoRaggiunto">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/<%=id%>.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%>0</p>
					</div>
					<form class="formRiscatta" action="RiscattaObiettivo" method="POST" name="RiscattaObiettivo">
						<input class="pulsanteRiscattaRiscattabile" type="submit" value="Riscatta">
						<input type="hidden" name="id" value="<%=id%>">
					</form>
				</div>
				<%
					}
					else if (!raggiunto && !riscattato)
					{
				%>
				<div class="obiettivo" id="obiettivoBloccato">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/<%=id%>.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%>0</p>
					</div>
					<form class="formRiscatta" action="" method="POST" name="">
						<input class="pulsanteRiscattaBloccato" type="submit" value="Riscatta">
					</form>
				</div>
				<%
					}
					else if (riscattato)
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
						<p class="scrittaRiscattato">Riscattato</p>
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
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
			//ArrayList<Obiettivo> obiettivi = (ArrayList<Obiettivo>) request.getAttribute("obiettivi");
		%>
		<% 
			//Codice di Test
			ArrayList<Obiettivo> obiettivi = new ArrayList<Obiettivo>();
			Obiettivo test1 = new Obiettivo("1", "Primo Passo", "Inserisci il tuo primo codice.", 0, true, false);
			Obiettivo test2 = new Obiettivo("2", "Frutti del Riciclaggio", "Riscuoti per la prima volta.", 0, false, false);
			Obiettivo test3 = new Obiettivo("3", "Amici Verdi", "Segui piu' di dieci persone.", 0, true, true);
			Obiettivo test4 = new Obiettivo("4", "Bottiglia di Bronzo", "Ricicla 10 bottiglie di plastica.", 0, true, true);
			Obiettivo test5 = new Obiettivo("5", "Bottiglia d'Argento", "Bottiglia d'Argento.", 0, false, false);
			obiettivi.add(test1);
			obiettivi.add(test2);
			obiettivi.add(test3);
			obiettivi.add(test4);
			obiettivi.add(test5);
		%>
		<div class="obiettiviEScrittaContenitore">
			<h3 class="obiettiviTesto">Obiettivi</h3>
			<div class="obiettiviContenitore">
				<%
					for(Obiettivo o : obiettivi)
					{
						id = o.getIdObiettivo();
						titolo = o.getTitolo();
						descrizione = o.getDescrizione();
						ricompensa = o.getRicompensa();
						raggiunto = o.isRaggiunto();
						riscattato = o.isRiscattato();
				%>
				<%
					if (raggiunto && !riscattato)
					{
				%>
				<div class="obiettivo" id="obiettivoRaggiunto">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/1.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%></p>
					</div>
					<form class="formRiscatta" action="RiscattaObiettivo" method="POST" name="RiscattaObiettivo">
						<input class="pulsanteRiscattaRiscattabile" type="submit" value="Riscatta">
					</form>
				</div>
				<%
					}
					else if (!raggiunto && !riscattato)
					{
				%>
				<div class="obiettivo" id="obiettivoBloccato">
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/1.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%></p>
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
					<img class="obiettivoFoto" alt="" src="fotoObiettivi/1.png">
					<div class="scritteContenitore">
						<p class="titoloObiettivo"><%=titolo%></p>
						<p class="descrizioneObiettivo"><%=descrizione%></p>
						<p class="ricompensaObiettivo">Ricompensa: &euro;<%=ricompensa%></p>
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
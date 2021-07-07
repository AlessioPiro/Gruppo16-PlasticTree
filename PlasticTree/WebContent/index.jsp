<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="plasticTreeModel.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% 
	Utente u = (Utente) session.getAttribute("utente");
	if(u != null)
	{
		request.getRequestDispatcher("HomeServlet").forward(request, response);
	}
%>
<html>
	<head>
		<link rel="stylesheet" href="Css/login.css" type="text/css">
		<style> body{background-image: url("fotoSfondo/backgroundBody.png");}</style>
		<title>Plastic Tree</title>
	</head>
	<body>
		<div class="contenitoreScrittaPlasticTree">
			<img class="plasticTreeScritta" src="icone/scritta.png" />
		</div>
		<div class="contenitoreDescrizioni">
			<div class="contenitoreProblema">
				<div class="titoloETesto">
					<h1 class="titoloSezione">IL PROBLEMA</h1>
					<p class="testoSezione">Lo sapevi che ben 8 milioni di tonnellate di rifiuti di plastica all'anno finiscono negli oceani? Continuando su questa strada, il nostro pianeta si ammalera' e non ci sara' piu' nulla che potremo fare. MA ORA SIAMO ANCORA IN TEMPO! Iscriviti a Plastic Tree, condividi le tue attivita' ecologiche, instaura dei rapporti con altre persone che hanno a cuore il pianeta, osserva anche le loro attivita' e GUADAGNA SOLDI REALI buttando i rifiuti di plastica negli appositi contenitori della tua citta'! SALVA IL MONDO E RICEVI LA GIUSTA RICOMPENSA!</p>
				</div>
				<img class="immagineIllustrativa" alt="Problema" src="fotoSfondo/login1.jpg">
			</div>
			<div class="contenitoreFunziona">
				<div class="titoloETesto">
					<h1 class="titoloSezione">COME FUNZIONA</h1>
					<p class="testoSezione">Il sistema di Plastic Tree è molto semplice. Una volta che avrai accumulato abbastanza rifiuti di plastica, recati verso il PlasticATM della tua citta', inserisci al suo interno i tuoi rifiuti e segnati il codice che ti viene fornito alla fine dell'operazione. Poi torna sul nostro sito, inserisci il codice nella sezione "RICICLA" e ti verrà automaticamente accreditato l'importo equivalente sul tuo account. Una volta raggiunta la soglia minima (10 euro), potrai spostare comodamente il tuo credito da Plastic Tree sul tuo conto corrente o sul tuo account PayPal!</p>
				</div>
				<img class="immagineIllustrativa" alt="Funziona" src="fotoSfondo/login2.jpg">
			</div>
			<div class="contenitorePiuSiamo">
				<div class="titoloETesto">
					<h1 class="titoloSezione">PIU' SIAMO, MEGLIO E'</h1>
					<p class="testoSezione">Il tuo apporto e' fondamentale ma se vogliamo salvare il pianeta avremo bisogno dell'aiuto di piu' persone possibili. Plastic Tree ti permette di vedere le attivita' di altri utenti, di conoscere nuove persone della tua zona che hanno a cuore il pianeta e soprattutto di condividere le tue attivita' ovunque tu voglia. Chissa' che la tua dedizione non ispiri nuovi aspiranti eroi a salvare il pianeta!</p>
				</div>
				<img class="immagineIllustrativa" alt="PiuSiamo" src="fotoSfondo/login3.jpg">
			</div>
		</div>
		<div class="login">
			<h1 class="loginScritta">LOGIN</h1>
			<%
			if(request.getAttribute("loginError") != null)
			{
				boolean loginError = (boolean) request.getAttribute("loginError");
				if(loginError)
				{
		
			%>
				<p class="errore">Email e/o Password non corretti!</p><br>
			<% 
				}
			}
			%>
			<form class="formLogin" action="AccessoServlet">
				Email: <input type="email" name="email" placeholder="example@plastictree.com"><br>
				Password: <input type="password" name="psw" placeholder="Password"><br>
				<input type="submit" value="Accedi">
			</form>
		<a href="RegistrazioneServlet">Se non ti sei ancora registrato, clicca qui.</a>
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/profiloUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/placeholderUtente.png">
			<h2 class="nomeProfiloUtente">Java nome</h2>
		</div>
		<div class="informazioni">
			<h3>Informazioni</h3>
				<div>
					<form class="information-form" name="infForm" onsubmit="return validateForm()" action="nomeServlet" method="POST">
						Nome: <input type="text" name="nome" placeholder="Nome" value="nome">
						<div id="nameErr"></div><br>
						Cognome: <input type="text" name="cognome" placeholder="Cognome" value="cognome">
						<div id="surnameErr"></div><br>
						Nato il: <input type="text" name="data" placeholder="XX/XX/XXXX" value="GG/MM/AAAA">
						<div id="dataErr"></div><br> <!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						Indirizzo: <input type="text" name="indirizzo" placeholder="Via, n°, citta', provincia, CAP" value="indirizzo">
						<div id="addressErr"></div><br>
						Email: <input type="email" name="email" placeholder="mario.rossi@gmail.com" value="email">
						<div id="emailErr"></div><br>
						Password: <input type="password" name="psw" placeholder="min 7 caratteri ,MAX 14" value="passworD">
						<div id="passwordErr"></div><br>
						<!-- RIMUOVERE ERRORI DELLA CARTA IN JS -->
						<div class="button-container">
							<input type="submit" value="Salva modifiche">
						</div>
					</form>
				</div>
		</div>
		<div class="obiettivi">
			<h3>I miei obiettivi</h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
					<img class="obiettivo" alt="" src="fotoObiettivi/1.png">
					<img class="obiettivo" alt="" src="fotoObiettivi/1.png">
					<img class="obiettivo" alt="" src="fotoObiettivi/1.png">
					<img class="obiettivo" alt="" src="fotoObiettivi/1.png">
					<img class="obiettivo" alt="" src="fotoObiettivi/1.png">
				</div>
				<form action="" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
				</form>
			</div>
		</div>
		<div class="attivita">
			<h3>Attivita'</h3>
			<% //For %>
			<div class="post">
				<div class="creatorePost">
					<img class="postFotoUtente" src="fotoUtente/placeholderUtente.png">
					<h4 class="postNomeUtente">Nome Utente</h4>
					<img class="pulsanteCondivisione" alt="" src="icone/condividi.png">
				</div>
				<div class="contenutoPost">
					<p class="postTesto">Testo placeholder</p>
					<img class="postImmagine" alt="" src="fotoObiettivi/1.png">
					<div class="interazioneContainer">
						<div class="pulsantiContenitore">
							<div class="miPiaceContenitore">
								<div class="numeroMiPiaceContenitore">
									<p class="numeroMiPiace">1</p>
									<img class="cuore" src="icone/cuore.png">
								</div>
								<form action="" method="POST" name="">
									<input class="miPiace" type="submit" value="Mi piace">
								</form>
							</div>
							<form action="" method="POST" name="">
								<input class="commenti" type="submit" value="Commenti">
							</form>
						</div>
						<p class="data">DD/MM/AAAA</p>
					</div>
				
				</div>
			</div>
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
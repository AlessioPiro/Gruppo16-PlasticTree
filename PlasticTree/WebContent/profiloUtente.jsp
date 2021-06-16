<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div id="fotoENome">
		
			<h2>Java nome</h2>
		</div>
		<div id="informazioni">
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
		<div id="obiettivi">
			<!-- Obiettivi con JS -->
		</div>
		<div id="attivita">
	
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
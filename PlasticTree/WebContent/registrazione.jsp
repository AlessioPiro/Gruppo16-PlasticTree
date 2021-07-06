<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style> body{background-image: url("fotoSfondo/backgroundBody.png");}</style>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Css/registrazione.css" type="text/css">
<title>Registrazione - Plastic Tree</title>
</head>
<body>
<%
	if(request.getAttribute("registrationError") != null && (boolean)request.getAttribute("registrationError") == true)
	{
%>
	<script>window.alert("Email gia' in uso.");</script>
<%
	}
%>
	<div class="contenitoreScrittaPlasticTree">
		<img class="plasticTreeScritta" src="icone/scritta.png" />
	</div>
	<section class="main-section">
		<h1>Registrazione</h1>
		<div>
			<form class="registration-form" name="regForm" onsubmit="return validateForm()" action="EffettuaRegistrazioneServlet" method="POST" enctype="multipart/form-data">
				Foto Profilo: <input type="file" name="file" id="file" accept= " .jpg"><br>
				Nome: <input type="text" name="nome" placeholder="Nome">
				<div id="nameErr"></div><br>
				Cognome: <input type="text" name="cognome" placeholder="Cognome">
				<div id="surnameErr"></div><br>
				Nato il: <input type="date" name="data" placeholder="Giorno/Mese/Anno">
				<div id="dataErr"></div><br>
				Indirizzo: <input type="text" name="indirizzo" placeholder="Via, Citta'">
				<div id="addressErr"></div><br>
				Email: <input type="email" name="email" placeholder="email@valore.it">
				<div id="emailErr"></div><br>
				Password: <input type="password" name="psw" placeholder="Password">
				<div id="passwordErr"></div><br>
				<div class="button-container">
					<input type="submit" value="Registrati">
				</div>
			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp"/>
	<script src="JS/RegistrationValidation.js" type="text/javascript"></script>
</body>
</html>
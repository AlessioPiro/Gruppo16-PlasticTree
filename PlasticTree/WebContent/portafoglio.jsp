<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="plasticTreeModel.Utente" %> 
    <% Utente u=(Utente) request.getSession().getAttribute("utente"); 
    float credit=00.0f;
    if(u!=null){
    	credit=u.getCredito();
    }
    boolean confermaPag=false;
   String msg="";
   if(request.getAttribute("confermaPag")!=null){
   	confermaPag=(boolean) request.getAttribute("confermaPag");
   	msg=(String) request.getAttribute("msgPag");
   	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Css/portafoglio.css" type="text/css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="JS/portafoglio.js"></script>
<title>Portafoglio</title>
</head>
<body <%if(confermaPag==true){ %> onload="conferma('<%=msg%>')"<%} %>>
<jsp:include page="header.jsp"/>
<div class="creditoDiv">
    <div class="creditoName">Credito</div>
    <div class="creditoImport"><p class="creditoText"<%if(credit<10.0f){%>style="color:#FF0000"<%}else{%>style="color:#66ff00"<%} %>>&euro;<%=credit %>0</p></div>
    <div class="creditoInfo">Il tuo credito deve essere uguale o superiore a &euro;10,00 per riscuotere!</div>
</div>
<div class="bonificoDiv">
                    <form class="bonifico-form" name="bonificoForm" onsubmit="return validateForm()" action="PortafoglioServlet" method="POST">
						Nome: <input type="text" name="nome" placeholder="Nome" value="">
						<div id="nameErr"></div><br>
						Cognome: <input type="text" name="cognome" placeholder="Cognome" value="">
						<div id="surnameErr"></div><br>
						IBAN: <input type="text" name="iban" placeholder="XX-XX-X-XXXXX-XXXXX-XXXXXXXX" value="">
						<div id="ibanErr"></div><br> <!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						Importo: <input type="number" name="importo" placeholder="xx.xx&euro;" min="1" step="0.01" value="">
						<div id="importoErr"></div><br>
						Password: <input type="password" name="psw" placeholder="***********" value="">
						<div id="passwordErr"></div><br>
						<!-- RIMUOVERE ERRORI DELLA CARTA IN JS -->
						<%if (credit < 10)
						{
						%>
						<div class="button-container">
						    <img src="icone/cartalogo.png" alt="cartalogo" class="cartalogo_img">
							<input class="pulsanteBloccato" type="submit" value="Riscuoti" disabled style="background-color: #ccc;">
						</div>
						<%
						} else {
						%>
						<div class="button-container">
						    <img src="icone/cartalogo.png" alt="cartalogo" class="cartalogo_img">
							<input class="pulsanteLibero" type="submit" value="Riscuoti">
						</div>
						<% 
						}
						%>
					</form>
</div>
<div class="paypalDiv">
     <form class="paypal-form" name="paypalForm" action="PaypalServlet" onsubmit="return validateForm2()" method="POST">
			Importo: <input type="number" name="importoPaypal" placeholder="xx.xx&euro;" min="1" step="0.01" value="" required>
			<input class="paypal" type="image" src="icone/paypallogo.jpg">
			<br><div id="importoPayErr"></div><br>
	</form>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
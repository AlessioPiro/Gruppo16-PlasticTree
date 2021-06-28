<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="plasticTreeModel.Utente" %> 
    <% Utente u=(Utente) request.getSession().getAttribute("role"); 
    float credit=00.0f;
    if(u!=null){
    	credit=u.getCredito();
    }%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Css/portafoglio.css" type="text/css">
<title>Portafoglio</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="creditoDiv">
    <div class="creditoName"><h2>Credito</h2></div>
    <div class="creditoImport"><h2 class="creditoText"<%if(credit<10.0f){%>style="color:#FF0000"<%}else{%>style="color:#66ff00"<%} %>>&euro;<%=credit %> </h2></div>
    <div class="creditoInfo"><h4>Il tuo credito deve essere uguale o superiore a &euro;10,00 per riscuotere! </h4></div>
</div>
<div class="bonificoDiv">
                    <form class="bonifico-form" name="bonificoForm" onsubmit="return validateForm()" action="PortafoglioServlet" method="POST">
						Nome: <input type="text" name="nome" placeholder="Nome" value="">
						<div id="nameErr"></div><br>
						Cognome: <input type="text" name="cognome" placeholder="Cognome" value="" required>
						<div id="surnameErr"></div><br>
						IBAN: <input type="text" name="iban" placeholder="XX-XX-X-XXXXX-XXXXX-XXXXXXXX" value="" required>
						<div id="dataErr"></div><br> <!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						Importo: <input type="number" name="importo" placeholder="xx.xx&euro;" min="1" step="0.01" value="" required>
						<div id="addressErr"></div><br>
						Password: <input type="password" name="psw" placeholder="***********" value="">
						<div id="passwordErr"></div><br>
						<!-- RIMUOVERE ERRORI DELLA CARTA IN JS -->
						<div class="button-container">
						    <img src="icone/cartalogo.png" alt="cartalogo" class="cartalogo_img">
							<input type="submit" value="Riscuoti">
						</div>
					</form>
</div>
<div class="paypalDiv">
     <form class="paypal-form" name="paypalForm"action="PaypalServlet" method="POST">
			Importo: <input type="number" name="importo" placeholder="xx.xx&euro;" min="1" step="0.01" value="" required>
			<input class="paypal" type="image" src="icone/paypallogo.jpg">
	</form>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
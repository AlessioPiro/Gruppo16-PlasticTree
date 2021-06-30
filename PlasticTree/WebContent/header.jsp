<%@ page language="java" import="java.util.*, java.math.*, plasticTreeModel.*;" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<%!
	float creditoUtente;
%>
<%
	creditoUtente = 20;
	//Utente utente = (Utente) session.getAttribute("utente");
	//Utente utente = new Utente("U1", "Lorenzo", "Aiello", new Date(), "Via Padova 33, Avellino", "laiello@gmail.com", "12345678");
	//creditoUtente = utente.getCredito();
%>
<head> 
<link rel="stylesheet" href="Css/header.css" type="text/css">
</head>
<body>
	<header class="header">
		<a href="index.jsp"><img src="icone/logo.png" alt="logo" class="header_logo_img"></a>
		<h3 class="header_logo_text">Credito: &euro;<%=creditoUtente%></h3>
		<span class="ricerca">
		<form class="search-form" action="DisplaySearch" method="POST" name="Search">
			<input class="input_search" type="search" name="s" placeholder="Ricerca">
			<input type="image" src="icone/ricerca.png" alt="Submit" class="icon">
		</form>
		</span>
	</header>
	<section class="header_menu">
	<nav>
		<ul>
			<li class="header_menu_item" id="creditoDesktop"><a href="ServletProv">Aggiungi Credito</a></li>
			<li class="header_menu_item" id="creditoMobile"><a href="ServletProv">Codice</a></li>
			<li class="header_menu_item"><a href="ServletProv">Portafoglio</a></li>
			<li class="header_menu_item"><a href="ServletProv">Account</a></li>
			<li class="header_menu_item"><a href="ObiettiviUtenteServlet">Obiettivi</a></li>
			<li class="header_menu_item"><a href="Logout">Logout</a></li>
		</ul>
	</nav>
	</section>
</body>
</html>
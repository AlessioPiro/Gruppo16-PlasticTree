<%@ page language="java" import="java.util.*, java.math.*, plasticTreeModel.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<%!
	float creditoUtente;
%>
<%
	Utente utente = (Utente) session.getAttribute("utente");
	creditoUtente = utente.getCredito();
%>
<head> 
<link rel="stylesheet" href="Css/header.css" type="text/css">
</head>
<body>
	<header class="header">
		<a href="index.jsp"><img src="icone/logo.png" alt="logo" class="header_logo_img"></a>
		<h3 class="header_logo_text">Credito: &euro;<%=creditoUtente%>0</h3>
		<span class="ricerca">
		<form class="search-form" action="RicercaServlet" method="POST" name="Search">
			<input class="input_search" type="search" name="ricerca" placeholder="Ricerca">
			<input type="image" src="icone/ricerca.png" alt="Submit" class="icon">
		</form>
		</span>
	</header>
	<section class="header_menu">
	<nav>
		<ul>
			<li class="header_menu_item" id="creditoDesktop"><a href="aggiungiCredito.jsp">Aggiungi Credito</a></li>
			<li class="header_menu_item" id="creditoMobile"><a href="aggiungiCredito.jsp">Codice</a></li>
			<li class="header_menu_item"><a href="ApriPortafoglioServlet">Portafoglio</a></li>
			<li class="header_menu_item"><a href="ProfiloUtenteServlet">Account</a></li>
			<li class="header_menu_item"><a href="ObiettiviUtenteServlet">Obiettivi</a></li>
			<li class="header_menu_item"><a href="LoginServlet">Logout</a></li>
		</ul>
	</nav>
	</section>
</body>
</html>
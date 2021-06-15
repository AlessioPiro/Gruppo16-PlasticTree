<%@ page language="java" import="java.util.*, java.math.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<%!
	float creditoUtente;
%>
<%
	creditoUtente = new BigDecimal(20.00).setScale(2, BigDecimal.ROUND_UP).floatValue();
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
			<li class="header_menu_item"><a href="ServletProv">Aggiungi Credito</a></li>
			<li class="header_menu_item"><a href="ServletProv">Portafoglio</a></li>
			<li class="header_menu_item"><a href="ServletProv">Account</a></li>
			<li class="header_menu_item"><a href="ServletProv">Obiettivi</a></li>
			<li class="header_menu_item"><a href="Logout">Logout</a></li>
		</ul>
	</nav>
	</section>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="plasticTreeModel.Utente" %> 
<%@page import="plasticTreeModel.Post" %> 
<%@ page import="java.util.*" %>  
<% Utente u=(Utente) request.getSession().getAttribute("role"); 
   boolean altri=(boolean) request.getSession().getAttribute("role");
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/altroUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/placeholderUtente.png">
			<h2 class="nomeProfiloUtente"><%=u.getNome() %> <%=u.getCognome() %></h2>
		</div>
		<div class="informazioni">
			<h3 class="informazioniTesto">Informazioni</h3>
				<div class="informationFormContenitore">
					<form class="information-form" name="infForm" onsubmit="return validateForm()" action="nomeServlet" method="POST">
						
						Nato il: <p class=info_utente><%=u.getNascita() %></p>
						<div id="dataErr"></div><br> <!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						Indirizzo: <p class=info_utente><%=u.getIndirizzo() %></p>
						<div id="addressErr"></div>
					</form>
				</div>
		</div>
		<div class="obiettivi">
			<h3 class="obiettiviTesto">Obbiettivi completati da <%=u.getNome() %></h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
				  <%for(int i=0;i<5;i++){
					  if(i<u.getObiettivi().size()){
						  String s= u.getObiettivi().get(i).getIdObiettivo();
						  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png"><%
					  }
					  if(altri==true){
						  int nextl=5;
						  for(int y=nextl;y<u.getObiettivi().size();y=y+5){
							  for(int z=0;z<5;z++){
								  if(i<u.getObiettivi().size()){
									  String s= u.getObiettivi().get(i).getIdObiettivo();
									  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png"><%
								  }
							  }
						  }
						}
					  }%>
					
				</div>
				<%if(altri==false && u.getObiettivi().size()>5){ %>
				<form action="ObiettiviAltroUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
					<input class="altriOb" name="altriOb" type="hidden" value="aumenta">
				</form>
				<%} %>
				<%if(altri==true){ %>
				<form action="ObiettiviAltroUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
					<input class="altriOb" name="altriOb" type="hidden" value="diminuisci">
				</form>
				<%} %>
			</div>
		</div>
		<div class="attivita">
			<h3 class="attivitaTesto">Attivita'</h3>
			<div class="insiemePost">
			<% ArrayList<Post> posts= u.getPost();
			   for(int j=0;j<u.getObiettivi().size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<div class="creatorePost">
						<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.png">
						<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						<input class="pulsanteCondivisione" type="image" src="icone/condividi.png">
						
					</div>
					<div class="contenutoPost">
						<p class="postTesto"><%=post.getTesto() %></p>
						<img class="postImmagine" alt="" src="fotoObiettivi/<%=post.getIdPost() %>.png">
						<div class="interazioneContainer">
							<div class="pulsantiContenitore">
							   <%boolean mioLike=false;
							   for(int x=0;x<post.getLike().size();x++){
								   Utente utenteP=post.getLike().get(x);
								   if(utenteP.getEmail().equals(u.getEmail())){
									   mioLike=true;
								   }
							   } %>
								<div class="miPiaceContenitore"<%if(mioLike==true){%> style="background-color:#FF0000; display: flex; flex-direction: column; margin-bottom: 4px; margin-right: 10px;" <%} %>>
									<div class="numeroMiPiaceContenitore">
										<p class="numeroMiPiace"><%=post.getLike().size() %></p>
										<img class="cuore" src="icone/cuore.png">
									</div>
									<form action="LikeServlet" method="POST" name="">
										<input class="miPiace" type="submit" value="Mi piace">
										<input class="utenteLike" name="utenteLike" type="hidden" value="<%=u%> ">
										<input class="idPost" name="idPost" type="hidden" value="<%=j%> ">
									</form>
								</div>
								<form action="" method="POST" name="">
									<input class="commenti" type="submit" value="Commenti">
								</form>
							</div>
							<p class="data"><%=post.getData() %></p>
						</div>
					</div>
				</div>
				<%} %>
			</div>
			
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
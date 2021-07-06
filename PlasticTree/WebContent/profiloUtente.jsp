<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="plasticTreeModel.Utente" %> 
<%@page import="plasticTreeModel.ObiettivoUtente" %> 
<%@page import="plasticTreeModel.Post" %> 
<%@page import="plasticTreeModel.Dao" %> 
<%@ page import="java.util.*" %>  
<% Utente u=(Utente) request.getSession().getAttribute("utente");
   Dao dao= (Dao) request.getSession().getAttribute("dao");
   if(dao==null){dao=new Dao();} 
    if(u==null){u=dao.getUtente("U1");}%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/profiloUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body>
	  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
      <script src="JS/profiloUtente.js"></script>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/<%=u.getIdUtente() %>.png" >
			<h2 class="nomeProfiloUtente"><%=u.getNome() %> <%=u.getCognome() %></h2>
		</div>
		<div class="informazioni">
			<h3 class="informazioniTesto">Informazioni</h3>
				<div class="informationFormContenitore">
					<form class="information-form" name="infForm" onsubmit="return validateForm()" action="ModificaProfiloUtenteServlet" method="POST">
						Nome: <input type="text" name="nome" placeholder="<%=u.getNome() %>" value="">
						<div id="nameErr"></div><br>
						Cognome: <input type="text" name="cognome" placeholder="<%=u.getCognome() %>" value="">
						<div id="surnameErr"></div><br>
						Nato il: <input type="text" name="data" placeholder="<%=u.getNascita().getDate() %>/<%=u.getNascita().getMonth()+1 %>/<%=u.getNascita().getYear()+1900 %>" value="">
						<div id="dataErr"></div><br> <!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						Indirizzo: <input type="text" name="indirizzo" placeholder="<%=u.getIndirizzo() %>" value="">
						<div id="addressErr"></div><br>
						Email: <input type="email" name="email" placeholder="<%=u.getEmail() %>" value="">
						<div id="emailErr"></div><br>
						Password: <input type="password" name="psw" placeholder="***********" value="">
						<div id="passwordErr"></div><br>
						<!-- RIMUOVERE ERRORI DELLA CARTA IN JS -->
						<div class="button-container">
							<input type="submit" value="Salva modifiche">
						</div>
					</form>
				</div>
		</div>
		<div class="obiettivi">
			<h3 class="obiettiviTesto">I miei obiettivi</h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
				  <%ArrayList<ObiettivoUtente> ob=dao.getObiettiviUtente(u);
				     int end=5;
				     for(int i=0;i<end;i++){
					  if(i<ob.size()){
						  if(ob.get(i).isRaggiunto()==true){
						  String s= ob.get(i).getIdObiettivo();
						  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png">
						  <%}else{end++;}
					  }
				  }%>
					
				</div>
				<form action="ObiettiviUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
					<input  name="utente" type="hidden" value="<%=u.getIdUtente() %> ">
				</form>
			</div>
			
		</div>
		<div class="attivita">
			<h3 class="attivitaTesto">Attivita'</h3>
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostUtente(u);
			   for(int j=0;j<posts.size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<div class="creatorePost">
						<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.png">
						<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						<input class="pulsanteCondivisione" type="image" src="icone/condividi.png">
						
					</div>
					<div class="contenutoPost">
						<p class="postTesto"><%=post.getTesto() %></p>
						<%String foto=post.getObiettivoPost();
						  if(foto.equals("")){
							  foto="nofoto";
						  }
						  %>
						<img class="postImmagine" alt="" src="fotoObiettivi/<%=foto %>.png">
						<div class="interazioneContainer">
							<div class="pulsantiContenitore">
							   <%boolean mioLike=false;
							   for(int x=0;x<post.getLike().size();x++){
								   Utente utenteP=post.getLike().get(x);
								   if(utenteP.getEmail().equals(u.getEmail())){
									   mioLike=true;
								   }
							   } %>
								<div class="miPiaceContenitore">
									<div class="numeroMiPiaceContenitore"<%if(mioLike==true){%> style="background-color:#FF0000;" <%} %>>
										<p class="numeroMiPiace"><%=post.getLike().size() %></p>
										<img class="cuore" src="icone/cuore.png">
									</div>
									<form action="LikeServlet" method="POST" name="">
										<input class="miPiace" type="submit" value="Mi piace" <%if(mioLike==true){%> style="background-color:#FF0000;" <%} %>>
										<input class="utenteLike" name="utenteLike" type="hidden" value="<%=u.getIdUtente() %> ">
										<input class="idPost" name="idPost" type="hidden" value="<%=post.getIdPost() %> ">
										<input class="pagina" name="pagina" type="hidden" value="profiloUtente.jsp">
									</form>
								</div>
								
									<input class="commenti" type="submit" value="Commenti" onclick="confirm('brand')">
								
							</div>
							<p class="data">[<%=post.getData().getDate() %>/<%=post.getData().getMonth()+1 %>/<%=post.getData().getYear()+1900 %>]</p>
						</div>
					</div>
				</div>
				<%} %>
			</div>
			
		</div>
		<jsp:include page="footer.jsp"/>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="plasticTreeModel.Utente" %> 
    <%@page import="plasticTreeModel.ObiettivoUtente" %> 
<%@page import="plasticTreeModel.Post" %> 
<%@page import="plasticTreeModel.Dao" %> 
<%@ page import="java.util.*" %>  
<% Utente u=(Utente) request.getSession().getAttribute("utente"); 
   Utente guardato=(Utente) request.getAttribute("altroUtente"); 
   Dao dao= (Dao) request.getSession().getAttribute("dao");
   if(dao==null){dao=new Dao();}
   if(u==null){u=dao.getUtente("U1");}
%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="Css/altroUtente.css" type="text/css">
	<title>Profilo - Plastic Tree</title>
	</head>
	<body>
	    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script src="JS/altroUtente.js"></script>
		<jsp:include page="header.jsp"/>
		<div class="fotoENome">
			<img class="fotoProfiloUtente" alt="" src="fotoUtente/<%=guardato.getIdUtente() %>.png">
			<h2 class="nomeProfiloUtente"><%=guardato.getNome() %> <%=guardato.getCognome() %></h2>
		</div>
		<div class="informazioni">
			<h3 class="informazioniTesto">Informazioni</h3>
				<div class="informationFormContenitore">
						<div class=infoUtente>Nato il: <%=guardato.getNascita().getDate() %>/<%=guardato.getNascita().getMonth()+1 %>/<%=guardato.getNascita().getYear()+1900 %></div>
						<div id="dataErr"></div><br><!-- DA AGGIUNGERE AL POSTO DI USERNAME IN JS -->
						<div class=infoUtente>Indirizzo: <%=guardato.getIndirizzo() %></div>
						<div id="addressErr"></div>
				</div>
		</div>
		<div class="obiettivi">
			<h3 class="obiettiviTesto">Obbiettivi completati da <%=guardato.getNome() %></h3>
			<div class="obiettiviContenitore">
				<div class="immaginiObiettiviContenitore">
				  <%int end=5;
				  ArrayList<ObiettivoUtente> ob=dao.getObiettiviUtente(guardato);
				     for(int i=0;i<5;i++){
					  if(i<ob.size()){
						  if(ob.get(i).isRaggiunto()==true){
						  String s= ob.get(i).getIdObiettivo();
						  %><img class="obiettivo" alt="" src="fotoObiettivi/<%=s%>.png" onerror="icone/nophoto.jpg">
						  <%}else{end++;}
					  }
					  }%>
					
				</div>
				
				<form action="ObiettiviAltroUtenteServlet" method="POST" name="">
					<input class="mostraAltroPulsante" type="submit" value="Mostra altro">
					<input  name="utente" type="hidden" value="<%=guardato.getIdUtente() %> ">
				</form>
			</div>
		</div>
		<div class="attivita">
			<h3 class="attivitaTesto">Attivita'</h3>
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostUtente(guardato);
			   for(int j=0;j<posts.size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<div class="creatorePost">
						<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.png" onerror="icone/nophoto.jpg">
						<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						<input class="pulsanteCondivisione" type="image" src="icone/condividi.png">
						
					</div>
					<div class="contenutoPost">
						<p class="postTesto"><%=post.getTesto() %></p>
						<img class="postImmagine" alt="" src="fotoObiettivi/<%=post.getIdPost() %>.png" onerror="icone/nophoto.jpg">
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
										<input class="utenteLike" name="utenteLike" type="hidden" value="<%=u.getIdUtente() %> ">
										<input class="idPost" name="idPost" type="hidden" value="<%=post.getIdPost() %> ">
										<input class="pagina" name="pagina" type="hidden" value="altroUtente.jsp">
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
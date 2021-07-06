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
	<link rel="stylesheet" href="Css/index.css" type="text/css">
	<title>Home - Plastic Tree</title>
	</head>
	<body>
	  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
      <script src="JS/profiloUtente.js"></script>
		<jsp:include page="header.jsp"/>
		<div class="help">
		<div class="wrapper">
  <!--<div class="container">

    <div class='nested-accordion'>
      <h3>Ordini e preventivi</h3>
      <div class='comment'>
        <div class='nested-accordion'>
          <h3>Come posso effettuare un ordine?</h3>
          <div class='comment'>Per effettuare un ordine basta scegliere l'auto che più si preferisce presente sulla
            piattaforma e
            richiedere un preventivo indicando
            quali optional (per contratto o auto) si preferiscono. Una volta effettuata la richiesta di preventivo e
            che quest'ultimo venga stipulato
            da un nostro consulente specializzato sarà possibile confermarlo. Una volta confermato il preventivo, il
            sistema creerà automaticamente
            un ordine il quale potrà essere confermato.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>In quanto tempo riceverò il mio preventivo?</h3>
          <div class='comment'>I nostri consulenti lavorano appositamente per permettere agli utenti che intendono
            adoperare la nostra
            piattaforma di usufruire di tutte
            le funzionalità da loro dipendenti nel minor tempo possibile. Natualmente il tempo necessario per la
            stipulazione di un preventivo è variabile,
            ma normalmente si aggira tra le 24 e le 48 ore.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Come posso accedere alla lista dei miei ordini?</h3>
          <div class='comment'>Accedi al tuo account e clicca su "ordini e preventivi": qui potrai vedere i dati
            relativi
            a tutte le
            richieste di preventivo e gli ordini da te
            effettuati in passato e a quelli in corso. Se vuoi invece controllare maggiori informazioni
            sull'ordine/preventivo, clicca su “visualizza”.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Effettuate consegne all'estero?</h3>
          <div class='comment'>No, per ora ci limitiamo a spedire ordini solamente in Italia.</div>
        </div>
      </div>
    </div>
  </div>
  <div class="push"></div>
</div>
<script>
  $('.nested-accordion').find('.comment').slideDown();
  $('.nested-accordion').find('h3').click(function() {
    $(this).next('.comment').slideToggle(100);
    $(this).toggleClass('selected');
  });
  $('.nested-accordion').find('h3').each(function() {
    $(this).next('.comment').slideToggle(100);
    $(this).toggleClass('selected');
  });
</script>-->
		<img class="helpImg" alt="" src="icone/helpLogo.png" onclick="faq('message')">
		</div>
		<div class="attivita">
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostHome(u);
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
										<input class="miPiace" type="submit" value="Mi piace" <%if(mioLike==true){%> style="background-color:#FF0000; " <%} %>>
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
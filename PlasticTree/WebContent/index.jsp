<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="plasticTreeModel.Utente" %>
<%@page import="plasticTreeModel.Commento" %>  
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
      <script src="JS/index.js"></script>
		<jsp:include page="header.jsp"/>
		
      <div class="help" id="help"  style="background-image: url('icone/sfondoHome.png');">
        <div class="helpMsg" id="helpMsg">Hai bisogno di aiuto? cliccami e chiedi!</div>
		<img class="helpImg" alt="" src="icone/helpLogo.png"  onmouseover="over()" onmouseout="out()" onclick="faq()" >
      </div>
      <div class="wrapper" id="wrapper" style="background-image: url('icone/sfondoHome.png');">
  <div class="container">
  <button class="buttonClose" onclick="closeFaq('msg')">- F.A.Q.</button>
    <div class='nested-accordion'>
      <h3>Ricicla e guadagna</h3>
      <div class='comment'>
        <div class='nested-accordion'>
          <h3>Come posso guadagnare riciclando?</h3>
          <div class='comment'>Il meccanismo &egrave; semplice, raccogli la plastica da riciclare, inseriscila negli appositi bidoni,
            i plasticATM,
            ti verr&agrave; fornito un codice da inserire sulla piattaforma,
            inserisci il codice ed automaticamente ti sar&agrave; incrementato il credito del relativo importo,
            pi&ugrave; ricicli pi&ugrave; guadagni!
            pi&ugrave; guadagni e contribuisci pi&ugrave; premi ti verranno assegnati!
            Dai incominciamo?
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>In quanto tempo ricever&oacute; il mio credito?</h3>
          <div class='comment'>I nostri plasticATM e la nostra piattaforma &egrave; sempre disponibile h24
            appena inserisci il codice
            ti verr&agrave; immediatamente accreditato l'importo relativo sulla piattaforma
            senza attese o inconvenienti.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Come posso vedere quanto ho accumulato?</h3>
          <div class='comment'>Accedi al tuo account e clicca su "portafoglio": qui potrai vedere i dati
            relativi
            al tuo credito accumulato
            ed inoltre potrai riscuoterlo in qualunque momento
            sia su un conto di tua scelta sia tramite paypal.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Come posso tracciare il mio lavoro di riciclaggio?</h3>
          <div class='comment'>Accedi al tuo account e clicca sul tuo nome utente: qui potrai vedere i dati
          relativi al tuo profilo
          ed inoltre vedere gli obbiettivi raggiunti ed i post pubblicati
          attraverso gli obbiettivi raggiunti si determina il tuo livello di riciclaggio.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Dove inserisco il codice ricevuto dai plasticATM?</h3>
          <div class='comment'>Accedi al tuo account e clicca su "Aggiungi credito": qui troverai un form
          dove potrai inserire il codice
          e confermando aggiungere automaticamente il credito.
          </div>
        </div>
        <div class='nested-accordion'>
          <h3>Cos'&egrave; un plasticATM e dove lo trovo?</h3>
          <div class='comment'>Il PlasticATM &egrave; un bidone speciale dove &egrave; possibile inserire rifiuti di plastica
          il dispositivo ne calcoler&agrave; il quantitativo e ti restituir&agrave; un codice 
          che corrisponde al relativo guadagno.<br>
          I PlasticATM sono installati in diversi luoghi pubblici come stazioni o aereoporti 
          nei maggiori comuni italiani come in accordo con le autorità locali.
          </div>
        </div>
      </div>
        <div class='nested-accordion'>
          <h3>Maggiori domande</h3>
          <div class='comment'>
            <div class='nested-accordion'>
              <h3>Quando sar&agrave; effettuato l'addebito sulla mia carta di credito?</h3>
              <div class='comment'>L'importo relativo alla riscossione effettuata verr&agrave; accreditato sulla tua carta di
                credito
                instantaneamente 
                tramite un bonifico bancario. <br>
                ATTENZIONE: Porre accortenza e controllare pi&ugrave; volte l'iban del conto inserito
                altrimenti i soldi potrebbero non arrivare mai 
                o essere spediti su un conto di propriet&agrave; ignota!!!
              </div>
            </div>
            <div class='nested-accordion'>
              <h3>Sto provando a riscuotore ma non me lo consente come mai?</h3>
              <div class='comment'>Molto probabilmente la causa principale &egrave; che non hai raggiunto la quota minima,
              per riscuotere &egrave; necessare accumulare un credito minimo di &euro;10.00 
              altrimenti il sistema non consente di proseguire;
              Un'altra causa &egrave; l'errata compilazione del form, quindi ricontrollare i dati inseriti prima di riprovare.
              </div>
            </div>
            <div class='nested-accordion'>
              <h3>Dove posso vedere o riscattare gli obiettivi?</h3>
              <div class='comment'>Accedi al tuo account e clicca su "Obiettivi": qui potrai vedere tutti gli obiettivi
              quelli gi&agrave; riscattati, quelli ancora non completati e quelli da riscattare;
               premendo sul pulsante in focus "Riscattta" puoi riscattare l'obbiettivo e ricevere il compenso in cambio.
              </div>
            </div>
            <div class='nested-accordion'>
              <h3>Ho inserito il codice ma non mi carica nulla come mai?</h3>
              <div class='comment'>Controllare di non aver inserito un codice gi&agrave; precedentemente inserito o di aver 
              sbagliato una cifra.
              </div>
            </div>
            <div class='nested-accordion'>
              <h3>Come posso pubblicare un post?</h3>
              <div class='comment'>I post vengono creati automaticamente dalla piattaforma al completamento di uno o pi&ugrave; obiettivi.</div>
            </div>
            <div class='nested-accordion'>
              <h3>Come saranno trattati i miei dati?</h3>
              <div class='comment'>PlaticTree garantisce la massima riservatezza sulle informazioni che hai rilasciato al
                momento della
                registrazione: sono infatti
                inviate in una connessione protetta con tecnologia SSL. <br> La sicurezza del sito &egrave; garantita e
                certificata da Verisign societ&agrave; leader
                mondiale tra i fornitori di servizi per la sicurezza online. Le informazioni facoltative che richiediamo
                all'atto della registrazione sono
                utilizzate per migliorare il servizio e offrirti promozioni basate sui tuoi interessi.
              </div>
            </div>
            <div class='nested-accordion'>
              <h3>I miei amici cosa vedranno?</h3>
              <div class='comment'>I tuoi amici possono vedere i tuoi obiettivi e post
                nonche i tuoi progressi
                potranno vedere la tua foto profilo e alcuni dati
                come anno di nascita e dove vivi.
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="push"></div>
		<div class="attivita" id="attivita">
			<div class="insiemePost">
			<% ArrayList<Post> posts= dao.getPostHome(u);
			   for(int j=0;j<posts.size();j++){
			       Post post=posts.get(j); %>
			    
				<div class="post">
					<div class="creatorePost">
						<img class="postFotoUtente" src="fotoUtente/<%=post.getUtente().getIdUtente() %>.png">
						<h3 class="postNomeUtente"><%=post.getUtente().getNome() %> <%=post.getUtente().getCognome() %></h3>
						
					</div>
					<div class="contenutoPost">
						<p class="postTesto"><%=post.getTesto() %></p>
						<%String foto=post.getObiettivoPost();
						  if(foto.equals("")){
							  foto="noObbiettivo";
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
								
									<%ArrayList<Commento> c=dao.getCommentiPost(post.getIdPost());%>
								
								<datalist id="C<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getTesto() %>" id="<%=c.get(i).getTesto() %>">
                                     <%} %>
                                 </datalist>
                                 <datalist id="U<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getUtente().getNome() %> <%=c.get(i).getUtente().getCognome() %>" id="<%=c.get(i).getUtente().getNome() %> <%=c.get(i).getUtente().getCognome() %>">
                                     <%} %>
                                 </datalist>
                                 <datalist id="F<%=post.getIdPost() %>">
								  <%for(int i=0;i<c.size();i++){ %>
                                   <option value="<%=c.get(i).getUtente().getIdUtente() %>" id="<%=c.get(i).getUtente().getIdUtente() %>">
                                     <%} %>
                                 </datalist>
								
									<div class="commenti"><input type="submit" value="Commenti" onclick="messageInfo('<%=u.getIdUtente() %>', '<%=post.getIdPost() %>')"></div>
								
							</div>
							<p class="data">[<%=post.getData().getDate() %>/<%=post.getData().getMonth()+1 %>/<%=post.getData().getYear()+1900 %>]</p>
						</div>
					</div>
				</div>
				<%} %>
			</div>
			
		</div>
		<jsp:include page="footer.jsp"/>
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
</script>
</body>
</html>
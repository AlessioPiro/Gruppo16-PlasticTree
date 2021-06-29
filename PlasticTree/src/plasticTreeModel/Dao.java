package plasticTreeModel;

import java.text.*;
import java.util.*;

public class Dao {
	
	public Dao ()
	{
		//Database
		
			ArrayList<Utente> utenti = new ArrayList<Utente>();
			SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
			
			//DEFINIZIONE DATE
			//Date utenti
			Date utenteData1, utenteData2, utenteData3, utenteData4, utenteData5, utenteData6, utenteData7, utenteData8, utenteData9, utenteData10, utenteData11, utenteData12, utenteData13, utenteData14, utenteData15;
			utenteData1 = utenteData2 = utenteData3 = utenteData4 = utenteData5 = utenteData6 = utenteData7 = utenteData8 = utenteData9 = utenteData10 = utenteData11 = utenteData12 = utenteData13 = utenteData14 = utenteData15 = null;
			try
			{
				utenteData1 = parser.parse("1999-04-05");
				utenteData2 = parser.parse("1995-03-11");
				utenteData3 = parser.parse("1994-03-09");
				utenteData4 = parser.parse("1999-12-12");
				utenteData5 = parser.parse("1999-11-21");
				utenteData6 = parser.parse("1993-12-11");
				utenteData7 = parser.parse("1960-12-25");
				utenteData8 = parser.parse("1968-11-09");
				utenteData9 = parser.parse("1995-03-02");
				utenteData10 = parser.parse("2001-04-03");
				utenteData11 = parser.parse("1999-07-07");
				utenteData12 = parser.parse("1993-06-23");
				utenteData13 = parser.parse("1988-04-30");
				utenteData14 = parser.parse("1978-05-06");
				utenteData15 = parser.parse("1999-08-05");
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
			
			//Date post
			Date postData1, postData2, postData3, postData4, postData5, postData6, postData7, postData8, postData9, postData10, postData11, postData12, postData13, postData14, postData15;
			postData1 = postData2 = postData3 = postData4 = postData5 = postData6 = postData7 = postData8 = postData9 = postData10 = postData11 = postData12 = postData13 = postData14 = postData15;
			try
			{
				postData1 = parser.parse("2021-05-05");
				postData2 = parser.parse("2021-06-11");
				postData3 = parser.parse("2021-05-09");
				postData4 = parser.parse("2021-06-12");
				postData5 = parser.parse("2021-05-21");
				postData6 = parser.parse("2021-07-11");
				postData7 = parser.parse("2021-06-25");
				postData8 = parser.parse("2021-07-09");
				postData9 = parser.parse("2021-06-02");
				postData10 = parser.parse("2021-05-03");
				postData11 = parser.parse("2021-06-07");
				postData12 = parser.parse("2021-06-23");
				postData13 = parser.parse("2021-05-30");
				postData14 = parser.parse("2021-07-06");
				postData15 = parser.parse("2021-06-05");
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
			
			//Date commenti
			
			//Creazione utenti
			Utente u1 = new Utente("U1", "Lorenzo", "Aiello", utenteData1, "Via Padova 33, Avellino", "laiello@gmail.com", "12345678");
			Utente u2 = new Utente("U2", "Patrizio", "Parroco", utenteData2, "Via Roma 10, Padova", "pparroco@gmail.com", "12345678");
			Utente u3 = new Utente("U3", "Gennaro", "Aiello", utenteData3, "Via Milano 9, Bologna", "gaiello@gmail.com", "12345678");
			Utente u4 = new Utente("U4", "Oronzo", "Cana", utenteData4, "Via Italia 15, Cesena", "ocana@gmail.com", "12345678");
			Utente u5 = new Utente("U5", "Franco", "Maritozzi", utenteData5, "Via Francesco 123, Napoli", "fmaritozzi@gmail.com", "12345678");
			Utente u6 = new Utente("U6", "Paola", "Aiello", utenteData6, "Via Gianni 54, Salerno", "paiello@gmail.com", "12345678");
			Utente u7 = new Utente("U7", "Francesco", "Costa", utenteData7, "Via Bologna 35, Milano", "fcosta@gmail.com", "12345678");
			Utente u8 = new Utente("U8", "Carla", "Ancelotti", utenteData8, "Via Sicilia 31, Napoli", "cancelotti@gmail.com", "12345678");
			Utente u9 = new Utente("U9", "Donato", "Di Donato", utenteData9, "Via Padova 66, Benevento", "cancelotti@gmail.com", "12345678");
			Utente u10 = new Utente("U10", "Marco", "Casco", utenteData10, "Via Benevento 75, Caserta", "mcasco@gmail.com", "12345678");
			Utente u11 = new Utente("U11", "Lorenzo", "Ostuni", utenteData11, "Via Poste 17, Torino", "lostuni@gmail.com", "12345678");
			Utente u12 = new Utente("U12", "Lorenzo", "Maglia", utenteData12, "Via Trento 105, Roma", "lmaglia@gmail.com", "12345678");
			Utente u13 = new Utente("U13", "Giovanni", "Lorenzo", utenteData13, "Via Gaetano 103, Napoli", "glorenzo@gmail.com", "12345678");
			Utente u14 = new Utente("U14", "Ida", "Ancelotti", utenteData14, "Via Toledo 13, Napoli", "iancelotti@gmail.com", "12345678");
			Utente u15 = new Utente("U15", "Ester", "Penna", utenteData15, "Via Busta 79, Catania", "epenna@gmail.com", "12345678");
			utenti.add(u1);
			utenti.add(u2);
			utenti.add(u3);
			utenti.add(u4);
			utenti.add(u5);
			utenti.add(u6);
			utenti.add(u7);
			utenti.add(u8);
			utenti.add(u9);
			utenti.add(u10);
			utenti.add(u11);
			utenti.add(u12);
			utenti.add(u13);
			utenti.add(u14);
			utenti.add(u15);
			
			//Creazione obiettivi
			ArrayList<Obiettivo> obiettivi = new ArrayList<Obiettivo>();
			Obiettivo o1 = new Obiettivo("O1", "Primo Passo", "Inserisci il tuo primo codice.", (float) 0.50);
			Obiettivo o2 = new Obiettivo("O2", "Frutti del Riciclaggio", "Riscuoti per la prima volta.", (float) 0.20);
			Obiettivo o3 = new Obiettivo("O3", "Conoscenti Verdi", "Segui piu' di 10 persone.", (float) 0.10);
			Obiettivo o4 = new Obiettivo("O4", "Bottiglia di Bronzo", "Inserisci 10 codici.", (float) 0.10);
			Obiettivo o5 = new Obiettivo("O5", "Bottiglia d'Argento", "Inserisci 50 codici.", (float) 0.20);
			Obiettivo o6 = new Obiettivo("O6", "Bottiglia d'Oro", "Inserisci 200 codici.", (float) 0.50);
			Obiettivo o7 = new Obiettivo("O7", "Amici Verdi", "Segui piu' di 50 persone.", (float) 0.20);
			Obiettivo o8 = new Obiettivo("O8", "Fratelli Verdi", "Segui piu' di 200 persone.", (float) 0.20);
			Obiettivo o9 = new Obiettivo("O9", "Eremita", "Commenta 10 volte.", (float) 0.10);
			Obiettivo o10 = new Obiettivo("O10", "Introverso", "Commenta 50 volte.", (float) 0.20);
			Obiettivo o11 = new Obiettivo("O11", "Estroverso", "Commenta 200 volte.", (float) 0.50);
			Obiettivo o12 = new Obiettivo("O12", "Platino", "Raggiungi tutti gli obiettivi.", (float) 0.50);
			Obiettivo o13 = new Obiettivo("O13", "Prime Esperienze", "Pubblica 10 post.", (float) 0.10);
			Obiettivo o14 = new Obiettivo("O14", "Utente Navigato", "Pubblica 50 post.", (float) 0.20);
			Obiettivo o15 = new Obiettivo("O15", "Influencer", "Pubblica 200 post.", (float) 0.50);
			obiettivi.add(o1);
			obiettivi.add(o2);
			obiettivi.add(o3);
			obiettivi.add(o4);
			obiettivi.add(o5);
			obiettivi.add(o6);
			obiettivi.add(o7);
			obiettivi.add(o8);
			obiettivi.add(o9);
			obiettivi.add(o10);
			obiettivi.add(o11);
			obiettivi.add(o12);
			obiettivi.add(o13);
			obiettivi.add(o14);
			obiettivi.add(o15);
			
			//Creazione Post
			Post p1 = new Post("P1", "");
			
	}
	
	
	
	

}

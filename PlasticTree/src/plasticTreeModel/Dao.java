package plasticTreeModel;

import java.text.*;
import java.util.*;

public class Dao {
	
	public Dao()
	{
		//Database
			
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
			postData1 = postData2 = postData3 = postData4 = postData5 = postData6 = postData7 = postData8 = postData9 = postData10 = postData11 = postData12 = postData13 = postData14 = postData15 = null;
			try
			{
				postData1 = parser.parse("2021-05-05");
				postData2 = parser.parse("2021-05-11");
				postData3 = parser.parse("2021-05-13");
				postData4 = parser.parse("2021-05-14");
				postData5 = parser.parse("2021-05-17");
				postData6 = parser.parse("2021-05-19");
				postData7 = parser.parse("2021-06-01");
				postData8 = parser.parse("2021-06-04");
				postData9 = parser.parse("2021-06-06");
				postData10 = parser.parse("2021-06-08");
				postData11 = parser.parse("2021-06-13");
				postData12 = parser.parse("2021-06-21");
				postData13 = parser.parse("2021-06-28");
				postData14 = parser.parse("2021-07-01");
				postData15 = parser.parse("2021-07-03");
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
			
			//Date commenti
			
			Date commentoData1, commentoData2, commentoData3, commentoData4, commentoData5, commentoData6, commentoData7, commentoData8, commentoData9, commentoData10, commentoData11, commentoData12, commentoData13, commentoData14, commentoData15;
			commentoData1 = commentoData2 = commentoData3 = commentoData4 = commentoData5 = commentoData6 = commentoData7 = commentoData8 = commentoData9 = commentoData10 = commentoData11 = commentoData12 = commentoData13 = commentoData14 = commentoData15 = null;
			try
			{
				commentoData1 = parser.parse("2021-05-05");
				commentoData2 = parser.parse("2021-05-11");
				commentoData3 = parser.parse("2021-05-13");
				commentoData4 = parser.parse("2021-05-14");
				commentoData5 = parser.parse("2021-05-17");
				commentoData6 = parser.parse("2021-05-19");
				commentoData7 = parser.parse("2021-06-01");
				commentoData8 = parser.parse("2021-06-04");
				commentoData9 = parser.parse("2021-06-06");
				commentoData10 = parser.parse("2021-06-08");
				commentoData11 = parser.parse("2021-06-13");
				commentoData12 = parser.parse("2021-06-21");
				commentoData13 = parser.parse("2021-06-28");
				commentoData14 = parser.parse("2021-07-01");
				commentoData15 = parser.parse("2021-07-03");
			}
			catch(ParseException e)
			{
				e.printStackTrace();
			}
			
			
			//UTENTI
			
			//Creazione liste di follower
			ArrayList<Utente> followerU1, followerU2, followerU3, followerU4, followerU5, followerU6, followerU7, followerU8, followerU9, followerU10, followerU11, followerU12, followerU13, followerU14, followerU15;
			followerU1 = new ArrayList<Utente>();
			followerU2 = new ArrayList<Utente>();
			followerU3 = new ArrayList<Utente>();
			followerU4 = new ArrayList<Utente>();
			followerU5 = new ArrayList<Utente>();
			followerU6 = new ArrayList<Utente>();
			followerU7 = new ArrayList<Utente>();
			followerU8 = new ArrayList<Utente>();
			followerU9 = new ArrayList<Utente>();
			followerU10 = new ArrayList<Utente>();
			followerU11 = new ArrayList<Utente>();
			followerU12 = new ArrayList<Utente>();
			followerU13 = new ArrayList<Utente>();
			followerU14 = new ArrayList<Utente>();
			followerU15 = new ArrayList<Utente>();
			
			//Creazione utenti
			Utente u1 = new Utente("U1", "Lorenzo", "Aiello", utenteData1, "Via Padova 33, Avellino", "laiello@gmail.com", "12345678", 10, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u2 = new Utente("U2", "Patrizio", "Parroco", utenteData2, "Via Roma 10, Padova", "pparroco@gmail.com", "12345678", 5, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u3 = new Utente("U3", "Gennaro", "Aiello", utenteData3, "Via Milano 9, Bologna", "gaiello@gmail.com", "12345678", 20, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u4 = new Utente("U4", "Oronzo", "Cana", utenteData4, "Via Italia 15, Cesena", "ocana@gmail.com", "12345678", 1, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u5 = new Utente("U5", "Franco", "Maritozzi", utenteData5, "Via Francesco 123, Napoli", "fmaritozzi@gmail.com", "12345678", 6, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u6 = new Utente("U6", "Paola", "Aiello", utenteData6, "Via Gianni 54, Salerno", "paiello@gmail.com", "12345678", 5, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u7 = new Utente("U7", "Francesco", "Costa", utenteData7, "Via Bologna 35, Milano", "fcosta@gmail.com", "12345678", 6, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u8 = new Utente("U8", "Carla", "Ancelotti", utenteData8, "Via Sicilia 31, Napoli", "cancelotti@gmail.com", "12345678", 9, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u9 = new Utente("U9", "Donato", "Di Donato", utenteData9, "Via Padova 66, Benevento", "ddidonato@gmail.com", "12345678", 12, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u10 = new Utente("U10", "Marco", "Casco", utenteData10, "Via Benevento 75, Caserta", "mcasco@gmail.com", "12345678", 0, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u11 = new Utente("U11", "Lorenzo", "Ostuni", utenteData11, "Via Poste 17, Torino", "lostuni@gmail.com", "12345678", 0, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u12 = new Utente("U12", "Lorenzo", "Maglia", utenteData12, "Via Trento 105, Roma", "lmaglia@gmail.com", "12345678", 5, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u13 = new Utente("U13", "Giovanni", "Lorenzo", utenteData13, "Via Gaetano 103, Napoli", "glorenzo@gmail.com", "12345678", 2, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u14 = new Utente("U14", "Ida", "Ancelotti", utenteData14, "Via Toledo 13, Napoli", "iancelotti@gmail.com", "12345678", 3, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			Utente u15 = new Utente("U15", "Ester", "Penna", utenteData15, "Via Busta 79, Catania", "epenna@gmail.com", "12345678", 4, new ArrayList<Utente>(), new ArrayList<ObiettivoUtente>());
			utenti.add(u1); utenti.add(u2); utenti.add(u3); utenti.add(u4); utenti.add(u5); utenti.add(u6); utenti.add(u7); utenti.add(u8); utenti.add(u9); utenti.add(u10); utenti.add(u11); utenti.add(u12); utenti.add(u13); utenti.add(u14); utenti.add(u15);
			
			//Riempimento della lista dei follower
			followerU1.add(u3); followerU1.add(u7); followerU1.add(u9); followerU1.add(u11); followerU1.add(u14);
			followerU2.add(u1); followerU2.add(u4); followerU2.add(u5); followerU2.add(u6); followerU2.add(u11); followerU2.add(u14); followerU2.add(u15);
			followerU3.add(u2); followerU3.add(u4); followerU3.add(u6); followerU3.add(u7); followerU3.add(u8); followerU3.add(u9);
			followerU4.add(u2); followerU4.add(u5); followerU4.add(u6);
			followerU5.add(u1); followerU5.add(u3); followerU5.add(u12); followerU5.add(u13); followerU5.add(u15);
			followerU6.add(u1); followerU6.add(u2); followerU6.add(u3); followerU6.add(u4); followerU6.add(u5); followerU6.add(u7); followerU6.add(u8); followerU6.add(u9); followerU6.add(u13); followerU6.add(u15);
			followerU7.add(u3); followerU7.add(u5); followerU7.add(u6); followerU7.add(u8); followerU7.add(u9); followerU7.add(u10); followerU7.add(u12); followerU7.add(u14);
			followerU8.add(u1); followerU8.add(u4); followerU8.add(u6); followerU8.add(u9); followerU8.add(u12); followerU8.add(u14);
			followerU9.add(u2); followerU9.add(u4); followerU9.add(u7); followerU9.add(u11); followerU9.add(u12);
			followerU10.add(u4); followerU10.add(u6); followerU10.add(u7); followerU10.add(u8); followerU10.add(u11);
			followerU11.add(u6); followerU11.add(u8);
			followerU12.add(u1); followerU12.add(u3); followerU12.add(u5); followerU12.add(u6); followerU12.add(u7); followerU12.add(u10); followerU12.add(u14);
			followerU13.add(u3); followerU13.add(u6); followerU13.add(u7); followerU13.add(u11); followerU13.add(u14); followerU13.add(u15);
			followerU14.add(u2); followerU14.add(u3); followerU14.add(u5); followerU14.add(u7);
			followerU15.add(u1); followerU15.add(u3); followerU15.add(u4); followerU15.add(u5); followerU15.add(u6); followerU15.add(u8); followerU15.add(u9); followerU15.add(u10); followerU15.add(u12); followerU15.add(u13); followerU15.add(u14);
			
			//Aggiunta dei follower agli utenti
			utenti.get(0).setFollower(followerU1);
			utenti.get(1).setFollower(followerU2);
			utenti.get(2).setFollower(followerU3);
			utenti.get(3).setFollower(followerU4);
			utenti.get(4).setFollower(followerU5);
			utenti.get(5).setFollower(followerU6);
			utenti.get(6).setFollower(followerU7);
			utenti.get(7).setFollower(followerU8);
			utenti.get(8).setFollower(followerU9);
			utenti.get(9).setFollower(followerU10);
			utenti.get(10).setFollower(followerU11);
			utenti.get(11).setFollower(followerU12);
			utenti.get(12).setFollower(followerU13);
			utenti.get(13).setFollower(followerU14);
			utenti.get(14).setFollower(followerU15);
			
			
			//OBIETTIVI
			
			//Creazione obiettivi
			Obiettivo o1 = new Obiettivo("O1", "Primo Passo", "Inserisci il tuo primo codice.", (float) 0.50);
			Obiettivo o2 = new Obiettivo("O2", "Frutti del Riciclaggio", "Riscuoti per la prima volta.", (float) 0.20);
			Obiettivo o3 = new Obiettivo("O3", "Bottiglia di Bronzo", "Inserisci 10 codici.", (float) 0.10);
			Obiettivo o4 = new Obiettivo("O4", "Bottiglia d'Argento", "Inserisci 50 codici.", (float) 0.20);
			Obiettivo o5 = new Obiettivo("O5", "Bottiglia d'Oro", "Inserisci 200 codici.", (float) 0.50);
			Obiettivo o6 = new Obiettivo("O6", "Conoscenti Verdi", "Segui 10 persone.", (float) 0.10);
			Obiettivo o7 = new Obiettivo("O7", "Amici Verdi", "Segui di 50 persone.", (float) 0.20);
			Obiettivo o8 = new Obiettivo("O8", "Fratelli Verdi", "Segui di 200 persone.", (float) 0.20);
			Obiettivo o9 = new Obiettivo("O9", "Eremita", "Commenta 10 volte.", (float) 0.10);
			Obiettivo o10 = new Obiettivo("O10", "Introverso", "Commenta 50 volte.", (float) 0.20);
			Obiettivo o11 = new Obiettivo("O11", "Estroverso", "Commenta 200 volte.", (float) 0.50);
			Obiettivo o12 = new Obiettivo("O12", "Prime Esperienze", "Pubblica 10 post.", (float) 0.10);
			Obiettivo o13 = new Obiettivo("O13", "Utente Navigato", "Pubblica 50 post.", (float) 0.20);
			Obiettivo o14 = new Obiettivo("O14", "Influencer", "Pubblica 200 post.", (float) 0.50);
			Obiettivo o15 = new Obiettivo("O15", "Platino", "Raggiungi tutti gli obiettivi.", (float) 0.50);
			obiettivi.add(o1); obiettivi.add(o2); obiettivi.add(o3); obiettivi.add(o4); obiettivi.add(o5); obiettivi.add(o6); obiettivi.add(o7); obiettivi.add(o8); obiettivi.add(o9); obiettivi.add(o10); obiettivi.add(o11); obiettivi.add(o12); obiettivi.add(o13); obiettivi.add(o14); obiettivi.add(o15);
			
			//Obiettivi degli utenti
			//Utente 1
			ObiettivoUtente ou1 = new ObiettivoUtente("O1", "U1", true, true);
			ObiettivoUtente ou2 = new ObiettivoUtente("O2", "U1", true, false);
			ObiettivoUtente ou3 = new ObiettivoUtente("O3", "U1", false, false);
			ObiettivoUtente ou4 = new ObiettivoUtente("O4", "U1", false, false);
			ObiettivoUtente ou5 = new ObiettivoUtente("O5", "U1", false, false);
			ObiettivoUtente ou6 = new ObiettivoUtente("O6", "U1", false, false);
			ObiettivoUtente ou7 = new ObiettivoUtente("O7", "U1", false, false);
			ObiettivoUtente ou8 = new ObiettivoUtente("O8", "U1", false, false);
			ObiettivoUtente ou9 = new ObiettivoUtente("O9", "U1", false, false);
			ObiettivoUtente ou10 = new ObiettivoUtente("O10", "U1", false, false);
			ObiettivoUtente ou11 = new ObiettivoUtente("O11", "U1", false, false);
			ObiettivoUtente ou12 = new ObiettivoUtente("O12", "U1", false, false);
			ObiettivoUtente ou13 = new ObiettivoUtente("O13", "U1", false, false);
			ObiettivoUtente ou14 = new ObiettivoUtente("O14", "U1", false, false);
			ObiettivoUtente ou15 = new ObiettivoUtente("O15", "U1", false, false);
			
			//Utente 2
			ObiettivoUtente ou16 = new ObiettivoUtente("O1", "U2", true, true);
			ObiettivoUtente ou17 = new ObiettivoUtente("O2", "U2", true, false);
			ObiettivoUtente ou18 = new ObiettivoUtente("O3", "U2", false, false);
			ObiettivoUtente ou19 = new ObiettivoUtente("O4", "U2", false, false);
			ObiettivoUtente ou20 = new ObiettivoUtente("O5", "U2", false, false);
			ObiettivoUtente ou21 = new ObiettivoUtente("O6", "U2", false, false);
			ObiettivoUtente ou22 = new ObiettivoUtente("O7", "U2", false, false);
			ObiettivoUtente ou23 = new ObiettivoUtente("O8", "U2", false, false);
			ObiettivoUtente ou24 = new ObiettivoUtente("O9", "U2", false, false);
			ObiettivoUtente ou25 = new ObiettivoUtente("O10", "U2", false, false);
			ObiettivoUtente ou26 = new ObiettivoUtente("O11", "U2", false, false);
			ObiettivoUtente ou27 = new ObiettivoUtente("O12", "U2", false, false);
			ObiettivoUtente ou28 = new ObiettivoUtente("O13", "U2", false, false);
			ObiettivoUtente ou29 = new ObiettivoUtente("O14", "U2", false, false);
			ObiettivoUtente ou30 = new ObiettivoUtente("O15", "U2", false, false);

			//Utente 3
			ObiettivoUtente ou31 = new ObiettivoUtente("O1", "U3", false, true);
			ObiettivoUtente ou32 = new ObiettivoUtente("O2", "U3", false, false);
			ObiettivoUtente ou33 = new ObiettivoUtente("O3", "U3", false, false);
			ObiettivoUtente ou34 = new ObiettivoUtente("O4", "U3", false, false);
			ObiettivoUtente ou35 = new ObiettivoUtente("O5", "U3", false, false);
			ObiettivoUtente ou36 = new ObiettivoUtente("O6", "U3", false, false);
			ObiettivoUtente ou37 = new ObiettivoUtente("O7", "U3", false, false);
			ObiettivoUtente ou38 = new ObiettivoUtente("O8", "U3", false, false);
			ObiettivoUtente ou39 = new ObiettivoUtente("O9", "U3", true, true);
			ObiettivoUtente ou40 = new ObiettivoUtente("O10", "U3", false, false);
			ObiettivoUtente ou41 = new ObiettivoUtente("O11", "U3", false, false);
			ObiettivoUtente ou42 = new ObiettivoUtente("O12", "U3", false, false);
			ObiettivoUtente ou43 = new ObiettivoUtente("O13", "U3", false, false);
			ObiettivoUtente ou44 = new ObiettivoUtente("O14", "U3", false, false);
			ObiettivoUtente ou45 = new ObiettivoUtente("O15", "U3", false, false);
			
			//Utente 4
			ObiettivoUtente ou46 = new ObiettivoUtente("O1", "U4", true, true);
			ObiettivoUtente ou47 = new ObiettivoUtente("O2", "U4", true, false);
			ObiettivoUtente ou48 = new ObiettivoUtente("O3", "U4", false, false);
			ObiettivoUtente ou49 = new ObiettivoUtente("O4", "U4", false, false);
			ObiettivoUtente ou50 = new ObiettivoUtente("O5", "U4", false, false);
			ObiettivoUtente ou51 = new ObiettivoUtente("O6", "U4", false, false);
			ObiettivoUtente ou52 = new ObiettivoUtente("O7", "U4", false, false);
			ObiettivoUtente ou53 = new ObiettivoUtente("O8", "U4", false, false);
			ObiettivoUtente ou54 = new ObiettivoUtente("O9", "U4", false, false);
			ObiettivoUtente ou55 = new ObiettivoUtente("O10", "U4", false, false);
			ObiettivoUtente ou56 = new ObiettivoUtente("O11", "U4", false, false);
			ObiettivoUtente ou57 = new ObiettivoUtente("O12", "U4", false, false);
			ObiettivoUtente ou58 = new ObiettivoUtente("O13", "U4", false, false);
			ObiettivoUtente ou59 = new ObiettivoUtente("O14", "U4", false, false);
			ObiettivoUtente ou60 = new ObiettivoUtente("O15", "U4", false, false);
			
			//Utente 5
			ObiettivoUtente ou61 = new ObiettivoUtente("O1", "U5", true, true);
			ObiettivoUtente ou62 = new ObiettivoUtente("O2", "U5", true, false);
			ObiettivoUtente ou63 = new ObiettivoUtente("O3", "U5", false, false);
			ObiettivoUtente ou64 = new ObiettivoUtente("O4", "U5", false, false);
			ObiettivoUtente ou65 = new ObiettivoUtente("O5", "U5", false, false);
			ObiettivoUtente ou66 = new ObiettivoUtente("O6", "U5", false, false);
			ObiettivoUtente ou67 = new ObiettivoUtente("O7", "U5", false, false);
			ObiettivoUtente ou68 = new ObiettivoUtente("O8", "U5", false, false);
			ObiettivoUtente ou69 = new ObiettivoUtente("O9", "U5", false, false);
			ObiettivoUtente ou70 = new ObiettivoUtente("O10", "U5", false, false);
			ObiettivoUtente ou71 = new ObiettivoUtente("O11", "U5", false, false);
			ObiettivoUtente ou72 = new ObiettivoUtente("O12", "U5", false, false);
			ObiettivoUtente ou73 = new ObiettivoUtente("O13", "U5", false, false);
			ObiettivoUtente ou74 = new ObiettivoUtente("O14", "U5", false, false);
			ObiettivoUtente ou75 = new ObiettivoUtente("O15", "U5", false, false);
			
			//Utente 6
			ObiettivoUtente ou76 = new ObiettivoUtente("O1", "U6", true, false);
			ObiettivoUtente ou77 = new ObiettivoUtente("O2", "U6", false, false);
			ObiettivoUtente ou78 = new ObiettivoUtente("O3", "U6", true, true);
			ObiettivoUtente ou79 = new ObiettivoUtente("O4", "U6", false, false);
			ObiettivoUtente ou80 = new ObiettivoUtente("O5", "U6", false, false);
			ObiettivoUtente ou81 = new ObiettivoUtente("O6", "U6", false, false);
			ObiettivoUtente ou82 = new ObiettivoUtente("O7", "U6", false, false);
			ObiettivoUtente ou83 = new ObiettivoUtente("O8", "U6", false, false);
			ObiettivoUtente ou84 = new ObiettivoUtente("O9", "U6", false, false);
			ObiettivoUtente ou85 = new ObiettivoUtente("O10", "U6", false, false);
			ObiettivoUtente ou86 = new ObiettivoUtente("O11", "U6", false, false);
			ObiettivoUtente ou87 = new ObiettivoUtente("O12", "U6", false, false);
			ObiettivoUtente ou88 = new ObiettivoUtente("O13", "U6", false, false);
			ObiettivoUtente ou89 = new ObiettivoUtente("O14", "U6", false, false);
			ObiettivoUtente ou90 = new ObiettivoUtente("O15", "U6", false, false);
			
			//Utente 7
			ObiettivoUtente ou91 = new ObiettivoUtente("O1", "U7", true, true);
			ObiettivoUtente ou92 = new ObiettivoUtente("O2", "U7", true, false);
			ObiettivoUtente ou93 = new ObiettivoUtente("O3", "U7", false, false);
			ObiettivoUtente ou94 = new ObiettivoUtente("O4", "U7", false, false);
			ObiettivoUtente ou95 = new ObiettivoUtente("O5", "U7", false, false);
			ObiettivoUtente ou96 = new ObiettivoUtente("O6", "U7", false, false);
			ObiettivoUtente ou97 = new ObiettivoUtente("O7", "U7", false, false);
			ObiettivoUtente ou98 = new ObiettivoUtente("O8", "U7", false, false);
			ObiettivoUtente ou99 = new ObiettivoUtente("O9", "U7", false, false);
			ObiettivoUtente ou100 = new ObiettivoUtente("O10", "U7", false, false);
			ObiettivoUtente ou101 = new ObiettivoUtente("O11", "U7", false, false);
			ObiettivoUtente ou102 = new ObiettivoUtente("O12", "U7", false, false);
			ObiettivoUtente ou103 = new ObiettivoUtente("O13", "U7", false, false);
			ObiettivoUtente ou104 = new ObiettivoUtente("O14", "U7", false, false);
			ObiettivoUtente ou105 = new ObiettivoUtente("O15", "U7", false, false);
			
			//Utente 8
			ObiettivoUtente ou106 = new ObiettivoUtente("O1", "U8", false, false);
			ObiettivoUtente ou107 = new ObiettivoUtente("O2", "U8", false, false);
			ObiettivoUtente ou108 = new ObiettivoUtente("O3", "U8", false, false);
			ObiettivoUtente ou109 = new ObiettivoUtente("O4", "U8", false, false);
			ObiettivoUtente ou110 = new ObiettivoUtente("O5", "U8", false, false);
			ObiettivoUtente ou111 = new ObiettivoUtente("O6", "U8", false, false);
			ObiettivoUtente ou112 = new ObiettivoUtente("O7", "U8", false, false);
			ObiettivoUtente ou113 = new ObiettivoUtente("O8", "U8", false, false);
			ObiettivoUtente ou114 = new ObiettivoUtente("O9", "U8", false, false);
			ObiettivoUtente ou115 = new ObiettivoUtente("O10", "U8", false, false);
			ObiettivoUtente ou116 = new ObiettivoUtente("O11", "U8", false, false);
			ObiettivoUtente ou117 = new ObiettivoUtente("O12", "U8", false, false);
			ObiettivoUtente ou118 = new ObiettivoUtente("O13", "U8", false, false);
			ObiettivoUtente ou119 = new ObiettivoUtente("O14", "U8", false, false);
			ObiettivoUtente ou120 = new ObiettivoUtente("O15", "U8", false, false);
			
			//Utente 9
			ObiettivoUtente ou121 = new ObiettivoUtente("O1", "U9", true, true);
			ObiettivoUtente ou122 = new ObiettivoUtente("O2", "U9", true, false);
			ObiettivoUtente ou123 = new ObiettivoUtente("O3", "U9", false, false);
			ObiettivoUtente ou124 = new ObiettivoUtente("O4", "U9", false, false);
			ObiettivoUtente ou125 = new ObiettivoUtente("O5", "U9", false, false);
			ObiettivoUtente ou126 = new ObiettivoUtente("O6", "U9", false, false);
			ObiettivoUtente ou127 = new ObiettivoUtente("O7", "U9", false, false);
			ObiettivoUtente ou128 = new ObiettivoUtente("O8", "U9", false, false);
			ObiettivoUtente ou129 = new ObiettivoUtente("O9", "U9", true, true);
			ObiettivoUtente ou130 = new ObiettivoUtente("O10", "U9", false, false);
			ObiettivoUtente ou131 = new ObiettivoUtente("O11", "U9", false, false);
			ObiettivoUtente ou132 = new ObiettivoUtente("O12", "U9", false, false);
			ObiettivoUtente ou133 = new ObiettivoUtente("O13", "U9", false, false);
			ObiettivoUtente ou134 = new ObiettivoUtente("O14", "U9", false, false);
			ObiettivoUtente ou135 = new ObiettivoUtente("O15", "U9", false, false);
			
			//Utente 10
			ObiettivoUtente ou136 = new ObiettivoUtente("O1", "U10", true, true);
			ObiettivoUtente ou137 = new ObiettivoUtente("O2", "U10", true, false);
			ObiettivoUtente ou138 = new ObiettivoUtente("O3", "U10", false, false);
			ObiettivoUtente ou139 = new ObiettivoUtente("O4", "U10", false, false);
			ObiettivoUtente ou140 = new ObiettivoUtente("O5", "U10", false, false);
			ObiettivoUtente ou141 = new ObiettivoUtente("O6", "U10", false, false);
			ObiettivoUtente ou142 = new ObiettivoUtente("O7", "U10", false, false);
			ObiettivoUtente ou143 = new ObiettivoUtente("O8", "U10", false, false);
			ObiettivoUtente ou144 = new ObiettivoUtente("O9", "U10", false, false);
			ObiettivoUtente ou145 = new ObiettivoUtente("O10", "U10", false, false);
			ObiettivoUtente ou146 = new ObiettivoUtente("O11", "U10", false, false);
			ObiettivoUtente ou147 = new ObiettivoUtente("O12", "U10", false, false);
			ObiettivoUtente ou148 = new ObiettivoUtente("O13", "U10", false, false);
			ObiettivoUtente ou149 = new ObiettivoUtente("O14", "U10", false, false);
			ObiettivoUtente ou150 = new ObiettivoUtente("O15", "U10", false, false);
			
			//Utente 11
			ObiettivoUtente ou151 = new ObiettivoUtente("O1", "U11", true, true);
			ObiettivoUtente ou152 = new ObiettivoUtente("O2", "U11", true, false);
			ObiettivoUtente ou153 = new ObiettivoUtente("O3", "U11", false, false);
			ObiettivoUtente ou154 = new ObiettivoUtente("O4", "U11", false, false);
			ObiettivoUtente ou155 = new ObiettivoUtente("O5", "U11", false, false);
			ObiettivoUtente ou156 = new ObiettivoUtente("O6", "U11", false, false);
			ObiettivoUtente ou157 = new ObiettivoUtente("O7", "U11", false, false);
			ObiettivoUtente ou158 = new ObiettivoUtente("O8", "U11", false, false);
			ObiettivoUtente ou159 = new ObiettivoUtente("O9", "U11", false, false);
			ObiettivoUtente ou160 = new ObiettivoUtente("O10", "U11", false, false);
			ObiettivoUtente ou161 = new ObiettivoUtente("O11", "U11", false, false);
			ObiettivoUtente ou162 = new ObiettivoUtente("O12", "U11", false, false);
			ObiettivoUtente ou163 = new ObiettivoUtente("O13", "U11", false, false);
			ObiettivoUtente ou164 = new ObiettivoUtente("O14", "U11", false, false);
			ObiettivoUtente ou165 = new ObiettivoUtente("O15", "U11", false, false);
			
			//Utente 12
			ObiettivoUtente ou166 = new ObiettivoUtente("O1", "U12", true, true);
			ObiettivoUtente ou167 = new ObiettivoUtente("O2", "U12", true, false);
			ObiettivoUtente ou168 = new ObiettivoUtente("O3", "U12", false, false);
			ObiettivoUtente ou169 = new ObiettivoUtente("O4", "U12", false, false);
			ObiettivoUtente ou170 = new ObiettivoUtente("O5", "U12", false, false);
			ObiettivoUtente ou171 = new ObiettivoUtente("O6", "U12", false, false);
			ObiettivoUtente ou172 = new ObiettivoUtente("O7", "U12", false, false);
			ObiettivoUtente ou173 = new ObiettivoUtente("O8", "U12", false, false);
			ObiettivoUtente ou174 = new ObiettivoUtente("O9", "U12", false, false);
			ObiettivoUtente ou175 = new ObiettivoUtente("O10", "U12", false, false);
			ObiettivoUtente ou176 = new ObiettivoUtente("O11", "U12", false, false);
			ObiettivoUtente ou177 = new ObiettivoUtente("O12", "U12", false, false);
			ObiettivoUtente ou178 = new ObiettivoUtente("O13", "U12", false, false);
			ObiettivoUtente ou179 = new ObiettivoUtente("O14", "U12", false, false);
			ObiettivoUtente ou180 = new ObiettivoUtente("O15", "U12", false, false);
			
			//Utente 13
			ObiettivoUtente ou181 = new ObiettivoUtente("O1", "U13", true, true);
			ObiettivoUtente ou182 = new ObiettivoUtente("O2", "U13", true, false);
			ObiettivoUtente ou183 = new ObiettivoUtente("O3", "U13", false, false);
			ObiettivoUtente ou184 = new ObiettivoUtente("O4", "U13", false, false);
			ObiettivoUtente ou185 = new ObiettivoUtente("O5", "U13", false, false);
			ObiettivoUtente ou186 = new ObiettivoUtente("O6", "U13", false, false);
			ObiettivoUtente ou187 = new ObiettivoUtente("O7", "U13", false, false);
			ObiettivoUtente ou188 = new ObiettivoUtente("O8", "U13", false, false);
			ObiettivoUtente ou189 = new ObiettivoUtente("O9", "U13", false, false);
			ObiettivoUtente ou190 = new ObiettivoUtente("O10", "U13", false, false);
			ObiettivoUtente ou191 = new ObiettivoUtente("O11", "U13", false, false);
			ObiettivoUtente ou192 = new ObiettivoUtente("O12", "U13", false, false);
			ObiettivoUtente ou193 = new ObiettivoUtente("O13", "U13", false, false);
			ObiettivoUtente ou194 = new ObiettivoUtente("O14", "U13", false, false);
			ObiettivoUtente ou195 = new ObiettivoUtente("O15", "U13", false, false);
			
			//Utente 14
			ObiettivoUtente ou196 = new ObiettivoUtente("O1", "U14", true, true);
			ObiettivoUtente ou197 = new ObiettivoUtente("O2", "U14", true, false);
			ObiettivoUtente ou198 = new ObiettivoUtente("O3", "U14", false, false);
			ObiettivoUtente ou199 = new ObiettivoUtente("O4", "U14", false, false);
			ObiettivoUtente ou200 = new ObiettivoUtente("O5", "U14", false, false);
			ObiettivoUtente ou201 = new ObiettivoUtente("O6", "U14", false, false);
			ObiettivoUtente ou202 = new ObiettivoUtente("O7", "U14", false, false);
			ObiettivoUtente ou203 = new ObiettivoUtente("O8", "U14", false, false);
			ObiettivoUtente ou204 = new ObiettivoUtente("O9", "U14", false, false);
			ObiettivoUtente ou205 = new ObiettivoUtente("O10", "U14", false, false);
			ObiettivoUtente ou206 = new ObiettivoUtente("O11", "U14", false, false);
			ObiettivoUtente ou207 = new ObiettivoUtente("O12", "U14", false, false);
			ObiettivoUtente ou208 = new ObiettivoUtente("O13", "U14", false, false);
			ObiettivoUtente ou209 = new ObiettivoUtente("O14", "U14", false, false);
			ObiettivoUtente ou210 = new ObiettivoUtente("O15", "U14", false, false);
			
			//Utente 15
			ObiettivoUtente ou211 = new ObiettivoUtente("O1", "U15", true, false);
			ObiettivoUtente ou212 = new ObiettivoUtente("O2", "U15", false, false);
			ObiettivoUtente ou213 = new ObiettivoUtente("O3", "U15", true, true);
			ObiettivoUtente ou214 = new ObiettivoUtente("O4", "U15", false, false);
			ObiettivoUtente ou215 = new ObiettivoUtente("O5", "U15", false, false);
			ObiettivoUtente ou216 = new ObiettivoUtente("O6", "U15", false, false);
			ObiettivoUtente ou217 = new ObiettivoUtente("O7", "U15", false, false);
			ObiettivoUtente ou218 = new ObiettivoUtente("O8", "U15", false, false);
			ObiettivoUtente ou219 = new ObiettivoUtente("O9", "U15", false, false);
			ObiettivoUtente ou220 = new ObiettivoUtente("O10", "U15", false, false);
			ObiettivoUtente ou221 = new ObiettivoUtente("O11", "U15", false, false);
			ObiettivoUtente ou222 = new ObiettivoUtente("O12", "U15", false, false);
			ObiettivoUtente ou223 = new ObiettivoUtente("O13", "U15", false, false);
			ObiettivoUtente ou224 = new ObiettivoUtente("O14", "U15", false, false);
			ObiettivoUtente ou225 = new ObiettivoUtente("O15", "U15", false, false);
			
			obiettiviUtente.add(ou1); obiettiviUtente.add(ou2); obiettiviUtente.add(ou3); obiettiviUtente.add(ou4); obiettiviUtente.add(ou5); obiettiviUtente.add(ou6); obiettiviUtente.add(ou7); obiettiviUtente.add(ou8); obiettiviUtente.add(ou9); obiettiviUtente.add(ou10); obiettiviUtente.add(ou11); obiettiviUtente.add(ou12); obiettiviUtente.add(ou13); obiettiviUtente.add(ou14); obiettiviUtente.add(ou15); obiettiviUtente.add(ou16); obiettiviUtente.add(ou17); obiettiviUtente.add(ou18); obiettiviUtente.add(ou19); obiettiviUtente.add(ou20); obiettiviUtente.add(ou21); obiettiviUtente.add(ou22); obiettiviUtente.add(ou23); obiettiviUtente.add(ou24); obiettiviUtente.add(ou25); obiettiviUtente.add(ou26); obiettiviUtente.add(ou27); obiettiviUtente.add(ou28); obiettiviUtente.add(ou29); obiettiviUtente.add(ou30);
			obiettiviUtente.add(ou31); obiettiviUtente.add(ou32); obiettiviUtente.add(ou33); obiettiviUtente.add(ou34); obiettiviUtente.add(ou35); obiettiviUtente.add(ou36); obiettiviUtente.add(ou37); obiettiviUtente.add(ou38); obiettiviUtente.add(ou39); obiettiviUtente.add(ou40); obiettiviUtente.add(ou41); obiettiviUtente.add(ou42); obiettiviUtente.add(ou43); obiettiviUtente.add(ou44); obiettiviUtente.add(ou45); obiettiviUtente.add(ou46); obiettiviUtente.add(ou47); obiettiviUtente.add(ou48); obiettiviUtente.add(ou49); obiettiviUtente.add(ou50); obiettiviUtente.add(ou51); obiettiviUtente.add(ou52); obiettiviUtente.add(ou53); obiettiviUtente.add(ou54); obiettiviUtente.add(ou55); obiettiviUtente.add(ou56); obiettiviUtente.add(ou57); obiettiviUtente.add(ou58); obiettiviUtente.add(ou59); obiettiviUtente.add(ou60);
			obiettiviUtente.add(ou61); obiettiviUtente.add(ou62); obiettiviUtente.add(ou63); obiettiviUtente.add(ou64); obiettiviUtente.add(ou65); obiettiviUtente.add(ou66); obiettiviUtente.add(ou67); obiettiviUtente.add(ou68); obiettiviUtente.add(ou69); obiettiviUtente.add(ou70); obiettiviUtente.add(ou71); obiettiviUtente.add(ou72); obiettiviUtente.add(ou73); obiettiviUtente.add(ou74); obiettiviUtente.add(ou75); obiettiviUtente.add(ou76); obiettiviUtente.add(ou77); obiettiviUtente.add(ou78); obiettiviUtente.add(ou79); obiettiviUtente.add(ou80); obiettiviUtente.add(ou81); obiettiviUtente.add(ou82); obiettiviUtente.add(ou83); obiettiviUtente.add(ou84); obiettiviUtente.add(ou85); obiettiviUtente.add(ou86); obiettiviUtente.add(ou87); obiettiviUtente.add(ou88); obiettiviUtente.add(ou89); obiettiviUtente.add(ou90);
			obiettiviUtente.add(ou91); obiettiviUtente.add(ou92); obiettiviUtente.add(ou93); obiettiviUtente.add(ou94); obiettiviUtente.add(ou95); obiettiviUtente.add(ou96); obiettiviUtente.add(ou97); obiettiviUtente.add(ou98); obiettiviUtente.add(ou99); obiettiviUtente.add(ou100); obiettiviUtente.add(ou101); obiettiviUtente.add(ou102); obiettiviUtente.add(ou103); obiettiviUtente.add(ou104); obiettiviUtente.add(ou105); obiettiviUtente.add(ou106); obiettiviUtente.add(ou107); obiettiviUtente.add(ou108); obiettiviUtente.add(ou109); obiettiviUtente.add(ou110); obiettiviUtente.add(ou111); obiettiviUtente.add(ou112); obiettiviUtente.add(ou113); obiettiviUtente.add(ou114); obiettiviUtente.add(ou115); obiettiviUtente.add(ou116); obiettiviUtente.add(ou117); obiettiviUtente.add(ou118); obiettiviUtente.add(ou119); obiettiviUtente.add(ou120);
			obiettiviUtente.add(ou121); obiettiviUtente.add(ou122); obiettiviUtente.add(ou123); obiettiviUtente.add(ou124); obiettiviUtente.add(ou125); obiettiviUtente.add(ou126); obiettiviUtente.add(ou127); obiettiviUtente.add(ou128); obiettiviUtente.add(ou129); obiettiviUtente.add(ou130); obiettiviUtente.add(ou131); obiettiviUtente.add(ou132); obiettiviUtente.add(ou133); obiettiviUtente.add(ou134); obiettiviUtente.add(ou135); obiettiviUtente.add(ou136); obiettiviUtente.add(ou137); obiettiviUtente.add(ou138); obiettiviUtente.add(ou139); obiettiviUtente.add(ou140); obiettiviUtente.add(ou141); obiettiviUtente.add(ou142); obiettiviUtente.add(ou143); obiettiviUtente.add(ou144); obiettiviUtente.add(ou145); obiettiviUtente.add(ou146); obiettiviUtente.add(ou147); obiettiviUtente.add(ou148); obiettiviUtente.add(ou149); obiettiviUtente.add(ou150);
			obiettiviUtente.add(ou151); obiettiviUtente.add(ou152); obiettiviUtente.add(ou153); obiettiviUtente.add(ou154); obiettiviUtente.add(ou155); obiettiviUtente.add(ou156); obiettiviUtente.add(ou157); obiettiviUtente.add(ou158); obiettiviUtente.add(ou159); obiettiviUtente.add(ou160); obiettiviUtente.add(ou161); obiettiviUtente.add(ou162); obiettiviUtente.add(ou163); obiettiviUtente.add(ou164); obiettiviUtente.add(ou165); obiettiviUtente.add(ou166); obiettiviUtente.add(ou167); obiettiviUtente.add(ou168); obiettiviUtente.add(ou169); obiettiviUtente.add(ou170); obiettiviUtente.add(ou171); obiettiviUtente.add(ou172); obiettiviUtente.add(ou173); obiettiviUtente.add(ou174); obiettiviUtente.add(ou175); obiettiviUtente.add(ou176); obiettiviUtente.add(ou177); obiettiviUtente.add(ou178); obiettiviUtente.add(ou179); obiettiviUtente.add(ou180);
			obiettiviUtente.add(ou181); obiettiviUtente.add(ou182); obiettiviUtente.add(ou183); obiettiviUtente.add(ou184); obiettiviUtente.add(ou185); obiettiviUtente.add(ou186); obiettiviUtente.add(ou187); obiettiviUtente.add(ou188); obiettiviUtente.add(ou189); obiettiviUtente.add(ou190); obiettiviUtente.add(ou191); obiettiviUtente.add(ou192); obiettiviUtente.add(ou193); obiettiviUtente.add(ou194); obiettiviUtente.add(ou195); obiettiviUtente.add(ou196); obiettiviUtente.add(ou197); obiettiviUtente.add(ou198); obiettiviUtente.add(ou199); obiettiviUtente.add(ou200); obiettiviUtente.add(ou201); obiettiviUtente.add(ou202); obiettiviUtente.add(ou203); obiettiviUtente.add(ou204); obiettiviUtente.add(ou205); obiettiviUtente.add(ou206); obiettiviUtente.add(ou207); obiettiviUtente.add(ou208); obiettiviUtente.add(ou209); obiettiviUtente.add(ou210);
			obiettiviUtente.add(ou211); obiettiviUtente.add(ou212); obiettiviUtente.add(ou213); obiettiviUtente.add(ou214); obiettiviUtente.add(ou215); obiettiviUtente.add(ou216); obiettiviUtente.add(ou217); obiettiviUtente.add(ou218); obiettiviUtente.add(ou219); obiettiviUtente.add(ou220); obiettiviUtente.add(ou221); obiettiviUtente.add(ou222); obiettiviUtente.add(ou223); obiettiviUtente.add(ou224); obiettiviUtente.add(ou225);

			
			
			//POST
			
			//Lista di like per post
			ArrayList<Utente> likePost1, likePost2, likePost3, likePost4, likePost5, likePost6, likePost7, likePost8, likePost9, likePost10, likePost11, likePost12, likePost13, likePost14, likePost15, likePost16, likePost17, likePost18, likePost19, likePost20, likePost21, likePost22, likePost23, likePost24, likePost25, likePost26, likePost27, likePost28;
			likePost1 = new ArrayList<Utente>(); likePost2 = new ArrayList<Utente>(); likePost3 = new ArrayList<Utente>(); likePost4 = new ArrayList<Utente>(); likePost5 = new ArrayList<Utente>(); likePost6 = new ArrayList<Utente>(); likePost7 = new ArrayList<Utente>(); likePost8 = new ArrayList<Utente>(); likePost9 = new ArrayList<Utente>(); likePost10 = new ArrayList<Utente>(); likePost11 = new ArrayList<Utente>(); likePost12 = new ArrayList<Utente>(); likePost13 = new ArrayList<Utente>(); likePost14 = new ArrayList<Utente>(); likePost15 = new ArrayList<Utente>(); likePost16 = new ArrayList<Utente>(); likePost17 = new ArrayList<Utente>(); likePost18 = new ArrayList<Utente>(); likePost19 = new ArrayList<Utente>(); likePost20 = new ArrayList<Utente>();
			likePost21 = new ArrayList<Utente>(); likePost22 = new ArrayList<Utente>(); likePost23 = new ArrayList<Utente>(); likePost24 = new ArrayList<Utente>(); likePost25 = new ArrayList<Utente>(); likePost26 = new ArrayList<Utente>(); likePost27 = new ArrayList<Utente>(); likePost28 = new ArrayList<Utente>();
			likePost1.add(u2); likePost1.add(u5); likePost1.add(u6);
			likePost2.add(u5);
			likePost3.add(u4); likePost3.add(u8); likePost3.add(u10);
			likePost4.add(u2); likePost4.add(u3); likePost4.add(u7);
			likePost5.add(u8);
			likePost6.add(u5); likePost6.add(u9);
			likePost7.add(u4); likePost7.add(u7); likePost7.add(u10); likePost7.add(u12); likePost7.add(u15);
			likePost8.add(u11); likePost8.add(u13);
			likePost9.add(u2); likePost9.add(u3); likePost9.add(u2);
			likePost10.add(u7);
			
			likePost12.add(u6); likePost12.add(u12); likePost12.add(u15);
			likePost13.add(u1); likePost13.add(u2);
			likePost14.add(u15);
			likePost15.add(u3); likePost15.add(u8);
			likePost16.add(u2); likePost16.add(u5); likePost16.add(u6);
			likePost17.add(u4);
			likePost18.add(u11); likePost18.add(u12); likePost18.add(u15);
			likePost19.add(u6);
			likePost20.add(u3); likePost20.add(u6);

			likePost22.add(u12); likePost22.add(u14);
			likePost23.add(u2); likePost23.add(u5); likePost23.add(u6); likePost23.add(u9); likePost23.add(u12);
			likePost24.add(u12);
			likePost25.add(u2); likePost25.add(u13);
			likePost26.add(u5); likePost26.add(u8); likePost26.add(u13);
			likePost27.add(u14);
			likePost28.add(u11); likePost28.add(u12); likePost28.add(u14);
			
			//Creazione Post
			Post p1 = new Post("P1", "Lorenzo ha dato un piccolo contributo all'ambiente, guadagnando 0.20 euro", u1, postData1, likePost1);
			Post p2 = new Post("P2", "Lorenzo ha raggiunto l'obiettivo: Primo Passo", u1, postData1, likePost2);
			Post p3 = new Post("P3", "Patrizio ha dato un grande contributo all'ambiente, guadagnando 0.60 euro", u2, postData2, likePost3);
			Post p4 = new Post("P4", "Patrizio ha raggiunto l'obiettivo: Primo Passo", u2, postData2, likePost4);
			Post p5 = new Post("P5", "Patrizio ha dato un piccolo contributo all'ambiente, guadagnando 0.30 euro", u2, postData3, likePost5);
			Post p6 = new Post("P6", "Gennaro ha raggiunto l'obiettivo: Eremita", u3, postData3, likePost6);
			Post p7 = new Post("P7", "Oronzo ha dato un enorme contributo all'ambiente, guadagnando 1.20 euro", u4, postData4, likePost7);
			Post p8 = new Post("P8", "Oronzo ha raggiunto l'obiettivo: Primo Passo", u4, postData4, likePost8);
			Post p9 = new Post("P9", "Franco ha dato un piccolo contributo all'ambiente, guadagnando 0.30 euro", u5, postData5, likePost9);
			Post p10 = new Post("P10", "Franco ha raggiunto l'obiettivo: Primo Passo", u5, postData5, likePost10);
			Post p11 = new Post("P11", "Paola ha raggiunto l'obiettivo: Conoscenti Verdi", u6, postData7, likePost11);
			Post p12 = new Post("P12", "Francesco ha dato un piccolo contributo all'ambiente, guadagnando 0.30 euro", u7, postData6, likePost12);
			Post p13 = new Post("P13", "Francesco ha raggiunto l'obiettivo: Primo Passo", u7, postData6, likePost13);
			Post p14 = new Post("P14", "Donato ha dato un enorme contributo all'ambiente, guadagnando 1.30 euro", u9, postData8, likePost14);
			Post p15 = new Post("P15", "Donato ha raggiunto l'obiettivo: Primo Passo", u9, postData8, likePost15);
			Post p16 = new Post("P16", "Donato ha raggiunto l'obiettivo: Eremita", u9, postData10, likePost16);
			Post p17 = new Post("P17", "Marco ha dato un grande contributo all'ambiente, guadagnando 0.60 euro", u10, postData12, likePost17);
			Post p18 = new Post("P18", "Marco ha raggiunto l'obiettivo: Primo Passo", u10, postData12, likePost18);
			Post p19 = new Post("P19", "Lorenzo ha dato un piccolo contributo all'ambiente, guadagnando 0.30 euro", u11, postData5, likePost19);
			Post p20 = new Post("P20", "Lorenzo ha raggiunto l'obiettivo: Primo Passo", u11, postData5, likePost20);
			Post p21 = new Post("P21", "Lorenzo ha dato un enorme contributo all'ambiente, guadagnando 1.60 euro", u11, postData14, likePost21);
			Post p22 = new Post("P22", "Lorenzo ha dato un piccolo contributo all'ambiente, guadagnando 0.30 euro", u12, postData15, likePost22);
			Post p23 = new Post("P23", "Lorenzo ha raggiunto l'obiettivo: Primo Passo", u12, postData15, likePost23);
			Post p24 = new Post("P24", "Giovanni ha dato un enorme contributo all'ambiente, guadagnando 1.60 euro", u13, postData12, likePost24);
			Post p25 = new Post("P25", "Giovanni ha raggiunto l'obiettivo: Primo Passo", u13, postData12, likePost25);
			Post p26 = new Post("P26", "Ida ha dato un grande contributo all'ambiente, guadagnando 0.60 euro", u14, postData10, likePost26);
			Post p27 = new Post("P27", "Ida ha raggiunto l'obiettivo: Primo Passo", u14, postData10, likePost27);
			Post p28 = new Post("P28", "Ester ha raggiunto l'obiettivo: Conoscenti Verdi", u15, postData4, likePost28);
			posts.add(p1); posts.add(p2); posts.add(p3); posts.add(p4); posts.add(p5); posts.add(p6); posts.add(p7); posts.add(p8); posts.add(p9); posts.add(p10); posts.add(p11); posts.add(p12); posts.add(p13); posts.add(p14); posts.add(p15); posts.add(p16);posts.add(p17); posts.add(p18); posts.add(p19); posts.add(p20); posts.add(p21); posts.add(p22); posts.add(p23); posts.add(p24); posts.add(p25); posts.add(p26); posts.add(p27); posts.add(p28); 
			
			//COMMENTI
			
			//Creazione commento
			Commento c1 = new Commento("Grande!", commentoData4, u5, "P1");
			Commento c2 = new Commento("Ciao caro", commentoData5, u7, "P1");
			Commento c3 = new Commento("Ottimo!", commentoData6, u9, "P1");
			Commento c4 = new Commento("Bravo!", commentoData5, u1, "P3");
			Commento c5 = new Commento("Ciao", commentoData7, u5, "P6");
			Commento c6 = new Commento("Non male", commentoData11, u2, "P6");
			Commento c7 = new Commento("Ottimo", commentoData12, u9, "P10");
			Commento c8 = new Commento("Buonasera", commentoData13, u11, "P10");
			Commento c9 = new Commento("Bravissimo", commentoData14, u14, "P10");
			Commento c10 = new Commento("Che risultato!", commentoData15, u12, "P12");
			Commento c11 = new Commento("Wow", commentoData3, u11, "P15");
			Commento c12 = new Commento("Incredibile", commentoData2, u10, "P15");
			Commento c13 = new Commento("Ciao", commentoData5, u7, "P18");
			Commento c14 = new Commento("Ehi!", commentoData7, u5, "P18");
			Commento c15 = new Commento("Ciao, non pensavo di trovarti qui.", commentoData9, u4, "P20");
			Commento c16 = new Commento("Wow", commentoData11, u3, "P22");
			Commento c17 = new Commento("Ottimo", commentoData13, u6, "P25");
			Commento c18 = new Commento("Che bello vederti qui", commentoData11, u7, "P25");
			Commento c19 = new Commento("Per l'ambiente!", commentoData1, u5, "P27");
			Commento c20 = new Commento("Ciao", commentoData7, u3, "P28");
			Commento c21 = new Commento("Non male", commentoData6, u12, "P28");
			Commento c22 = new Commento("Grande", commentoData8, u13, "P28");
			commenti.add(c1); commenti.add(c2); commenti.add(c3); commenti.add(c4); commenti.add(c5); commenti.add(c6); commenti.add(c7); commenti.add(c8); commenti.add(c9); commenti.add(c10); commenti.add(c11); commenti.add(c12); commenti.add(c13); commenti.add(c14);commenti.add(c15); commenti.add(c16); commenti.add(c17); commenti.add(c18); commenti.add(c19); commenti.add(c20); commenti.add(c21); commenti.add(c22); 
			
			//CODICI
			
			//Creazione codici validi
			Codice cod1 = new Codice("11111111", (float) 0.50, false);
			Codice cod2 = new Codice("22222222", (float) 0.30, false);
			Codice cod3 = new Codice("33333333", (float) 0.20, false);
			Codice cod4 = new Codice("44444444", (float) 2.50, false);
			Codice cod5 = new Codice("55555555", (float) 1.30, false);
			Codice cod6 = new Codice("66666666", (float) 0.20, false);
			Codice cod7 = new Codice("77777777", (float) 3.50, false);
			Codice cod8 = new Codice("88888888", (float) 0.90, false);
			Codice cod9 = new Codice("99999999", (float) 0.10, false);
			Codice cod10 = new Codice("12345678", (float) 0.70, false);
			codici.add(cod1); codici.add(cod2); codici.add(cod3);codici.add(cod4); codici.add(cod5); codici.add(cod6); codici.add(cod7); codici.add(cod8); codici.add(cod9); codici.add(cod10);
	}
	
	
	//METODI
	
	//Metodi Utente
	
	public ArrayList<Utente> getTuttiUtenti() //Restituisce tutti gli utenti
	{
		return utenti;
	}
	
	public Utente getUtente(String id) //Restituisce un utente dato l'id
	{
		Utente utente = null;
		ArrayList<Utente> utenti = this.getTuttiUtenti();
		for (Utente u : utenti)
		{
			if (u.getIdUtente().equals(id))
			{
				utente = u;
			}
		}
		return utente;
	}
	
	public Utente login(String email, String password) //Restituisce un utente se l'email e la password combaciano altrimenti restituisce null
	{
		Utente utente = null;
		ArrayList<Utente> utenti = this.getTuttiUtenti();
		for (Utente u : utenti)
		{
			if (u.getEmail().equals(email) && u.getPassword().equals(password))
			{
				utente = u;
			}
		}
		return utente;
	}
	
	public boolean isEmailDoppia(String email) //Controlla se l'email è gia' stata usata
	{
		ArrayList<Utente> utenti = this.getTuttiUtenti();
		for (Utente u : utenti)
		{
			if (u.getEmail().equals(email))
			{
				return true;
			}
		}
		return false;
	}
	
	public Utente registrazione(String nome, String cognome, String data, String indirizzo, String email, String password) //Effettua la registrazione di un nuovo utente
	{
		Utente utente = null;
		ArrayList<Utente> utenti = this.getTuttiUtenti();
		int idTop = -1;
		for (Utente u : utenti)
		{
			String tempId = u.getIdUtente().substring(1);
			int tempIdNum = Integer.parseInt(tempId);
			if (idTop < 0 || tempIdNum > idTop)
			{
				idTop = tempIdNum;
			}
		}
		int nuovoId = idTop + 1;
		String id = "U" + nuovoId;
		Date dataRegistrazione = null;
		try
		{
			dataRegistrazione = parser.parse(data);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		utente = new Utente(id, nome, cognome, dataRegistrazione, indirizzo, email, password);
		utenti.add(utente);
		
		ObiettivoUtente ou1 = new ObiettivoUtente("O1", id, false, false);
		ObiettivoUtente ou2 = new ObiettivoUtente("O2", id, false, false);
		ObiettivoUtente ou3 = new ObiettivoUtente("O3", id, false, false);
		ObiettivoUtente ou4 = new ObiettivoUtente("O4", id, false, false);
		ObiettivoUtente ou5 = new ObiettivoUtente("O5", id, false, false);
		ObiettivoUtente ou6 = new ObiettivoUtente("O6", id, false, false);
		ObiettivoUtente ou7 = new ObiettivoUtente("O7", id, false, false);
		ObiettivoUtente ou8 = new ObiettivoUtente("O8", id, false, false);
		ObiettivoUtente ou9 = new ObiettivoUtente("O9", id, false, false);
		ObiettivoUtente ou10 = new ObiettivoUtente("O10", id, false, false);
		ObiettivoUtente ou11 = new ObiettivoUtente("O11", id, false, false);
		ObiettivoUtente ou12 = new ObiettivoUtente("O12", id, false, false);
		ObiettivoUtente ou13 = new ObiettivoUtente("O13", id, false, false);
		ObiettivoUtente ou14 = new ObiettivoUtente("O14", id, false, false);
		ObiettivoUtente ou15 = new ObiettivoUtente("O15", id, false, false);
		obiettiviUtente.add(ou1); obiettiviUtente.add(ou2); obiettiviUtente.add(ou3); obiettiviUtente.add(ou4); obiettiviUtente.add(ou5);
		obiettiviUtente.add(ou6); obiettiviUtente.add(ou7); obiettiviUtente.add(ou8); obiettiviUtente.add(ou9); obiettiviUtente.add(ou10);
		obiettiviUtente.add(ou11); obiettiviUtente.add(ou12); obiettiviUtente.add(ou13); obiettiviUtente.add(ou14); obiettiviUtente.add(ou15);
		
		return utente;
	}
	
	public boolean bonificoPasswordCheck(String password, Utente utente) //Dato un utente e una password, controlla se le password coincidono. Utile per il controllo nel bonifico
	{
		if (utente.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	public boolean bonificoImportoCheck(float importo, Utente utente)//Dato un utente e un importo, verifica se l'importo è riscuotibile
	{
		if (importo > 9.99 && importo <= utente.getCredito())
		{
			return true;
		}
		return false;
	}
	
	public void riscuoti(float importo, Utente utente) //Riscossione di un importo
	{
		utente.setCredito(utente.getCredito() - importo);
		
		//Sblocco obiettivo O2
		ObiettivoUtente o2 = this.getObiettivoUtente("O2", utente);
		if(!o2.isRaggiunto())
		{
			this.sbloccaObiettivo(utente.getIdUtente(), "O2");
		}
	}
	
	public Utente modificaDati(String nome, String cognome, String data, String indirizzo, String email, String password, Utente utente) //Modifica i dati dell'utente
	{
		ArrayList<Utente> utenti = this.getTuttiUtenti();
		Date dataModificata = null;
		try
		{
			dataModificata = parser.parse(data);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		utente.setNome(nome);
		utente.setCognome(cognome);
		utente.setNascita(dataModificata);
		utente.setIndirizzo(indirizzo);
		utente.setEmail(email);
		utente.setPassword(password);
		utenti.add(utente);
		return utente;
	}
	
	public ArrayList<Utente> ricerca(String ricerca, Utente utente) //Restituisce la lista di ricercati
	{
		ArrayList<Utente> ricercati = new ArrayList<Utente>();
		ricerca = ricerca.toLowerCase();
		for (Utente u : this.getTuttiUtenti())
		{
			String nomeCognome = u.getNome() + " " + u.getCognome();
			String cognomeNome = u.getCognome() + " " + u.getNome();
			if (u.getNome().toLowerCase().contains(ricerca) || u.getCognome().toLowerCase().contains(ricerca) || nomeCognome.toLowerCase().contains(ricerca) || cognomeNome.toLowerCase().contains(ricerca))
			{
				ricercati.add(u);
			}
		}
		if(ricercati != null)
		{
			/*Iterator<Utente> iter = ricercati.iterator();

			while (iter.hasNext()) {
			    Utente u = iter.next();

			    if (u.getIdUtente().equals(utente.getIdUtente()))
			        iter.remove();
			}*/
			ArrayList<Utente> daRimuovere = new ArrayList<Utente>();
			for(Utente u : ricercati)
			{
				if(u.getIdUtente().equals(utente.getIdUtente()))
				{
					daRimuovere.add(u);
				}
			}
			ricercati.removeAll(daRimuovere);
		}
		return ricercati;
	}
	
	public boolean isSeguito(Utente utenteProtagonista, Utente utenteDaSeguire) {  //verifica se la persona data come secondo parametro è già seguita da quella data come primo parametro
		for(Utente u : utenteProtagonista.getFollower())
		{
			if (u.getIdUtente().equals(utenteDaSeguire.getIdUtente()))
			{
				return true;
			}
		}
		return false;
	}
	
	public void seguiClick(Utente utenteProtagonista, Utente utenteDaSeguire) //Se la persona è già seguita, viene tolta dalla lista dei seguiti, altrimenti viene aggiunta alla lista dei seguiti
	{
		System.out.println(utenteDaSeguire);
		for(Utente u : utenteProtagonista.getFollower())
		{
			if (u.getIdUtente().equals(utenteDaSeguire.getIdUtente()))
			{
				utenteProtagonista.getFollower().remove(u);
				return;
			}
		}
		utenteProtagonista.getFollower().add(utenteDaSeguire);
		
		//Sblocco obiettivo O6
		ObiettivoUtente o6 = this.getObiettivoUtente("O6", utenteProtagonista);
		if(!o6.isRaggiunto())
		{
			if(utenteProtagonista.getFollower().size() > 9)
			{
				this.sbloccaObiettivo(utenteProtagonista.getIdUtente(), "O6");
			}			
		}
		
		//Sblocco obiettivo O7
		ObiettivoUtente o7 = this.getObiettivoUtente("O7", utenteProtagonista);
		if(!o7.isRaggiunto())
		{
			if(utenteProtagonista.getFollower().size() > 49)
			{
				this.sbloccaObiettivo(utenteProtagonista.getIdUtente(), "O7");
			}			
		}
		
		//Sblocco obiettivo O8
		ObiettivoUtente o8 = this.getObiettivoUtente("O8", utenteProtagonista);
		if(!o8.isRaggiunto())
		{
			if(utenteProtagonista.getFollower().size() > 299)
			{
				this.sbloccaObiettivo(utenteProtagonista.getIdUtente(), "O8");
			}			
		}
				
		return;
	}
	
	//Metodi Obiettivo
	
	public ArrayList<Obiettivo> getTuttiObiettivi() //Restituisce tutti gli obiettivi
	{
		return obiettivi;
	}
	
	public Obiettivo getObiettivo(String id) //Restituisce un obiettivo
	{
		ArrayList<Obiettivo> obiettivi = this.getTuttiObiettivi();
		for (Obiettivo o : obiettivi)
		{
			if(o.getIdObiettivo().equals(id))
			{
				return o;
			}
		}
		return null;
	}
	
	public String getIdObiettivo(String nome) //Restituisce l'id dell'obiettivo prendendo il nome in input
	{
		ArrayList<Obiettivo> obiettivi = this.getTuttiObiettivi();
		for (Obiettivo o : obiettivi)
		{
			if(nome.contains(o.getTitolo()))
			{
				return o.getIdObiettivo();
			}
		}
		return null;
	}
	
	//Metodi ObiettivoUtente
	
	public ArrayList<ObiettivoUtente> getTuttiObiettiviUtente() //Restituisce tutti gli obiettivi utente
	{
		return obiettiviUtente;
	}
	
	public ArrayList<ObiettivoUtente> getObiettiviUtente(Utente u) //Restituisce gli obiettivi di un utente prendendo l'oggetto Utente
	{
		ArrayList<ObiettivoUtente> obiettiviUtenteSpecifico = new ArrayList<ObiettivoUtente>();
		ArrayList<ObiettivoUtente> tuttiObiettiviUtente = this.getTuttiObiettiviUtente();
		String idUtente = u.getIdUtente();
		for(ObiettivoUtente uo: tuttiObiettiviUtente)
		{
			if(uo.getIdUtente().equals(idUtente))
			{
				obiettiviUtenteSpecifico.add(uo);
			}
		}
		
		return obiettiviUtenteSpecifico;
	}
	
	public ArrayList<ObiettivoUtente> getObiettiviUtente(String idUtente) //Restituisce gli obiettivi di un utente prendendo l'id dell'utente
	{
		ArrayList<ObiettivoUtente> obiettiviUtenteSpecifico = new ArrayList<ObiettivoUtente>();
		ArrayList<ObiettivoUtente> tuttiObiettiviUtente = this.getTuttiObiettiviUtente();
		for(ObiettivoUtente uo: tuttiObiettiviUtente)
		{
			if(uo.getIdUtente().equals(idUtente))
			{
				obiettiviUtenteSpecifico.add(uo);
			}
		}
		
		return obiettiviUtenteSpecifico;
	}
	
	public ObiettivoUtente getObiettivoUtente(String obiettivo, Utente utente)
	{
		for(ObiettivoUtente ou : this.getObiettiviUtente(utente))
		{
			if(obiettivo.equals(ou.getIdObiettivo()))
			{
				return ou;
			}
		}
		return null;
	}
	
	public void sbloccaObiettivo(String utente, String obiettivo) //Un obiettivo bloccato diventa raggiunto
	{
		ArrayList<ObiettivoUtente> obiettivi = this.getObiettiviUtente(utente);
		for(ObiettivoUtente ou: obiettivi)
		{
			if(ou.getIdObiettivo().equals(obiettivo))
			{
				ou.setRaggiunto(true);
			}
		}
	}
	
	public float riscattaObiettivo(String utente, String obiettivo) //Setta "riscattato" di un obiettivoUtente a True e restituisce la ricompensa
	{
		ArrayList<ObiettivoUtente> obiettivi = this.getObiettiviUtente(utente);
		float ricompensa = -1;
		for(ObiettivoUtente ou : obiettivi)
		{
			if(ou.getIdObiettivo().equals(obiettivo))
			{
				ou.setRiscattato(true);
				Obiettivo obiettivoOggetto = this.getObiettivo(obiettivo);
				Utente utenteOggetto = this.getUtente(utente);
				utenteOggetto.setCredito(utenteOggetto.getCredito() + obiettivoOggetto.getRicompensa());
				ricompensa = obiettivoOggetto.getRicompensa();
				this.creaPostObiettivo(this.getUtente(utente), this.getObiettivo(obiettivo));
				
				//Sblocco obiettivo 15
				ObiettivoUtente o15 = this.getObiettivoUtente("O15", this.getUtente(utente));
				if(!o15.isRaggiunto())
				{
					int cont = 0;
					for(ObiettivoUtente ob : this.getObiettiviUtente(utente))
					{
						if (ob.isRiscattato())
							cont++;
					}
					if(cont > this.getTuttiObiettivi().size() - 2)
					{
						this.sbloccaObiettivo(utente, "O15");
					}
				}
				
				return ricompensa;
			}
		}
		return ricompensa;
	}
	
	//Metodi Post
	
	public ArrayList<Post> getTuttiPost() //Restituisce tutti i post
	{
		return posts;
	}
	
	public ArrayList<Post> getPostUtente(Utente utente) //Restituisce tutti i post di un utente
	{
		ArrayList<Post> tuttiPost = this.getTuttiPost();
		ArrayList<Post> postUtente = new ArrayList<Post>();
		for (Post p : tuttiPost)
		{
			if(utente.getIdUtente().equals(p.getUtente().getIdUtente()))
			{
				postUtente.add(p);
			}
		}
	
		return postUtente;
	}
	
	public ArrayList<Post> getPostHome(Utente utente) //Restituisce tutti i post di chi e' seguito da un utente
	{
		ArrayList<Post> tuttiPost = this.getTuttiPost();
		ArrayList<Post> postHome = new ArrayList<Post>();
		ArrayList<Utente> follow = utente.getFollower();
		for (Post p : tuttiPost)
		{
			for(Utente u : follow)
			{
				if(p.getUtente().getIdUtente().equals(u.getIdUtente()))
				{
					postHome.add(p);
				}
			}
		}
		return postHome;
	}
	
	public Post getPost(String idPost) //Restituisce un post dato il suo id
	{
		ArrayList<Post> tuttiPost = this.getTuttiPost();
		for (Post p : tuttiPost)
		{
			if(p.getIdPost().equals(idPost))
			{
				return p;
			}
		}
		return null;
	}
	
	public void clickMiPiace(String idPost, Utente utente) //Se l'utente è già presente nella lista dei mi piace, questo viene rimosso, altrimenti viene aggiunto
	{
		Post p = this.getPost(idPost);
		for(Utente u : p.getLike())
		{
			if(u.getIdUtente().equals(utente.getIdUtente()))
			{
				p.getLike().remove(u);
				return;
			}
		}
		p.getLike().add(utente);
		return;
	}
	
	public Post creaPostObiettivo(Utente utente, Obiettivo obiettivo) //Creazione Post alla riscossione di un obiettivo
	{
		Post post = null;
		ArrayList<Post> posts = this.getTuttiPost();
		int idTop = -1;
		for (Post p : posts)
		{
			String tempId = p.getIdPost().substring(1);
			int tempIdNum = Integer.parseInt(tempId);
			if (idTop < 0 || tempIdNum > idTop)
			{
				idTop = tempIdNum;
			}
		}
		int nuovoId = idTop + 1;
		String id = "P" + nuovoId;
		String testo = utente.getNome() + " ha raggiunto l'obiettivo: " + obiettivo.getTitolo();
		post = new Post(id, testo, utente);
		this.getTuttiPost().add(0, post);
		
		//Sblocco 013
		ObiettivoUtente o13 = this.getObiettivoUtente("O13", utente);
		if(!o13.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 9)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O13");
			}
		}
		
		//Sblocco 014
		ObiettivoUtente o14 = this.getObiettivoUtente("O14", utente);
		if(!o14.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 49)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O14");
			}
		}
		
		//Sblocco 015
		ObiettivoUtente o15 = this.getObiettivoUtente("O15", utente);
		if(!o15.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 199)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O15");
			}
		}
		
		return post;
	}
	
	public Post creaPostCodice(Utente utente, Codice codice) //Creazione Post all'inserimento di un codice
	{
		Post post = null;
		ArrayList<Post> posts = this.getTuttiPost();
		int idTop = -1;
		for (Post p : posts)
		{
			String tempId = p.getIdPost().substring(1);
			int tempIdNum = Integer.parseInt(tempId);
			if (idTop < 0 || tempIdNum > idTop)
			{
				idTop = tempIdNum;
			}
		}
		int nuovoId = idTop + 1;
		String id = "P" + nuovoId;
		String contributo = "";
		if (codice.getImporto() < 0.50)
			contributo = "piccolo";
		else if(codice.getImporto() >= 0.50 && codice.getImporto() < 1)
			contributo = "grande";
		else
			contributo = "enorme";
		String testo = utente.getNome() + " ha dato un " + contributo + " contributo per la salvaguardia dell'ambiente, guadagnando " + codice.getImporto() + "0 euro";
		post = new Post(id, testo, utente);
		this.getTuttiPost().add(0, post);
		
		//Sblocco 012
		ObiettivoUtente o12 = this.getObiettivoUtente("O12", utente);
		if(!o12.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 9)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O12");
			}
		}
		
		//Sblocco 013
		ObiettivoUtente o13 = this.getObiettivoUtente("O13", utente);
		if(!o13.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 49)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O13");
			}
		}
		
		//Sblocco 014
		ObiettivoUtente o14 = this.getObiettivoUtente("O14", utente);
		if(!o14.isRaggiunto())
		{
			if(this.getPostUtente(utente).size() > 199)
			{
				this.sbloccaObiettivo(utente.getIdUtente(), "O14");
			}
		}
		
		return post;
	}
	
	//Metodi Commenti
	
	public ArrayList<Commento> getTuttiCommenti() //Restituisce tutti i commenti
	{
		return commenti;
	}
	
	public ArrayList<Commento> getCommentiPost(String idPost) //Restituisce tutti i commenti di un post
	{
		Post post = this.getPost(idPost);
		ArrayList<Commento> tuttiCommenti = this.getTuttiCommenti();
		ArrayList<Commento> commentiPost = new ArrayList<Commento>();
		for (Commento c : tuttiCommenti)
		{
			if(c.getPost().equals(idPost))
			{
				commentiPost.add(c);
			}
		}
		return commentiPost;
	}
	
	public ArrayList<Commento> getCommentiUtente(String idUtente) //Restituisce tutti i commenti di una persona
	{
		Utente utente = this.getUtente(idUtente);
		ArrayList<Commento> tuttiCommenti = this.getTuttiCommenti();
		ArrayList<Commento> commentiUtente = new ArrayList<Commento>();
		for (Commento c : tuttiCommenti)
		{
			if(c.getUtente().getIdUtente().equals(idUtente))
			{
				commentiUtente.add(c);
			}
		}
		return commentiUtente;
	}
	
	public void aggiungiCommento(String testo, Utente utente, String post) //Aggiunge un commento
	{
		Commento c = new Commento(testo, utente, post);
		this.getTuttiCommenti().add(c);
		
		//Sblocco obiettivo 09
		ObiettivoUtente o9 = this.getObiettivoUtente("O9", utente);
		if(!o9.isRaggiunto())
		{
			if(this.getCommentiUtente(utente.getIdUtente()).size() > 9)
				this.sbloccaObiettivo(utente.getIdUtente(), "O9");
		}
		
		//Sblocco obiettivo 10
		ObiettivoUtente o10 = this.getObiettivoUtente("O10", utente);
		if(!o10.isRaggiunto())
		{
			if(this.getCommentiUtente(utente.getIdUtente()).size() > 49)
				this.sbloccaObiettivo(utente.getIdUtente(), "O10");
		}
				
		//Sblocco obiettivo 11
		ObiettivoUtente o11 = this.getObiettivoUtente("O11", utente);
		if(!o11.isRaggiunto())
		{
			if(this.getCommentiUtente(utente.getIdUtente()).size() > 199)
				this.sbloccaObiettivo(utente.getIdUtente(), "O11");
		}
		
	}
	
	//Metodi Codice
	
	public ArrayList<Codice> getTuttiCodici()
	{
		return codici;
	}
	
	public ArrayList<Codice> getTuttiCodiciValidi() //Restituisce tutti i codici ancora validi
	{
		ArrayList<Codice> tuttiCodici = this.getTuttiCodici();
		ArrayList<Codice> codiciValidi = new ArrayList<Codice>();
		for(Codice cod : tuttiCodici)
		{
			if (!cod.isRiscattato())
			{
				codiciValidi.add(cod);
			}
		}
		return codiciValidi;
	}
	
	public Codice getCodice(String inputCod) //Restituisce un determinato codice. Se non viene trovato, restituisce null
	{
		ArrayList<Codice> tuttiCodici = this.getTuttiCodici();
		for(Codice cod : tuttiCodici)
		{
			if (cod.getCodice().equals(inputCod))
			{
				return cod;
			}
		}
		return null;
	}
	
	public boolean isValido(String c) //Controlla se il codice immesso è valido. ATTENZIONE: NON EFFETTUA IL RISCATTO, CONTROLLA SOLO LA SUA VALIDITA'
	{
		ArrayList<Codice> codiciValidi = this.getTuttiCodiciValidi();
		for(Codice cod : codiciValidi)
		{
			if (c.equals(cod.getCodice()))
			{
				return true;
			}
		}
		return false;
	}
	
	public float riscattaCodice(String c, Utente utente) //Riscatta il codice e controlla l'obiettivo O1
	{
		if(!this.isValido(c))
		{
			return -1;
		}
		Codice cod = this.getCodice(c);
		cod.setRiscattato(true);
		utente.setCounterCodici(utente.getCounterCodici() + 1);
		this.getUtente(utente.getIdUtente()).setCredito(this.getUtente(utente.getIdUtente()).getCredito()+cod.getImporto());
		
		//Sblocco obiettivo O1
		ObiettivoUtente o1 = this.getObiettivoUtente("O1", utente);
		if(!o1.isRaggiunto())
		{
			this.sbloccaObiettivo(utente.getIdUtente(), "O1");
		}
		
		//Sblocco obiettivo O3
		ObiettivoUtente o3 = this.getObiettivoUtente("O3", utente);
		if(!o3.isRaggiunto())
		{
			if(utente.getCounterCodici() > 9)
				this.sbloccaObiettivo(utente.getIdUtente(), "O3");
		}
		
		//Sblocco obiettivo O4
		ObiettivoUtente o4 = this.getObiettivoUtente("O4", utente);
		if(!o4.isRaggiunto())
		{
			if(utente.getCounterCodici() > 49)
				this.sbloccaObiettivo(utente.getIdUtente(), "O4");
		}
		
		//Sblocco obiettivo O5
		ObiettivoUtente o5 = this.getObiettivoUtente("O5", utente);
		if(!o5.isRaggiunto())
		{
			if(utente.getCounterCodici() > 199)
				this.sbloccaObiettivo(utente.getIdUtente(), "O5");
		}
		
		return cod.getImporto();
	}
	
	
	//Variabili
	
	ArrayList<Utente> utenti = new ArrayList<Utente>();
	ArrayList<Obiettivo> obiettivi = new ArrayList<Obiettivo>();
	ArrayList<ObiettivoUtente> obiettiviUtente = new ArrayList<ObiettivoUtente>();
	ArrayList<Post> posts = new ArrayList<Post>();
	ArrayList<Commento> commenti = new ArrayList<Commento>();
	ArrayList<Codice> codici = new ArrayList<Codice>();
	SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat parserModificaDati = new SimpleDateFormat("dd/MM/yyyy");
	

}

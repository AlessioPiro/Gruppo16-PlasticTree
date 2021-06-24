package plasticTreeModel;

public class Commento {
	
	public Commento (String inputTesto, Utente inputUtente)
	{
		testo = inputTesto;
		utente = inputUtente;
	}
	
	public String getTesto()
	{
		return testo;
	}
	
	public Utente getUtente()
	{
		return utente;
	}
	
	public void setTesto(String inputTesto)
	{
		testo = inputTesto;
	}
	
	public void setUtente(Utente inputUtente)
	{
		utente = inputUtente;
	}
	
	private String testo;
	private Utente utente;
}

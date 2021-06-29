package plasticTreeModel;

import java.util.*;

public class Commento {
	
	public Commento (String inputTesto, Date inputData, Utente inputUtente, String inputPost)
	{
		testo = inputTesto;
		utente = inputUtente;
		post = inputPost;
		data = inputData;
	}
	
	public Commento (String inputTesto, Utente inputUtente, String inputPost)
	{
		testo = inputTesto;
		utente = inputUtente;
		post = inputPost;
		data = new Date();
	}
	
	public String getTesto()
	{
		return testo;
	}
	
	public Date getData()
	{
		return data;
	}
	
	public Utente getUtente()
	{
		return utente;
	}
	
	public String getPost()
	{
		return post;
	}
	
	public void setTesto(String inputTesto)
	{
		testo = inputTesto;
	}
	
	public void setData(Date inputData)
	{
		data = inputData;
	}
	
	public void setUtente(Utente inputUtente)
	{
		utente = inputUtente;
	}
	
	public void setPost(String inputPost)
	{
		post = inputPost;
	}
	
	
	private String testo;
	private Date data;
	private Utente utente;
	private String post;
}

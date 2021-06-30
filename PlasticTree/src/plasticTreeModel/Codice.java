package plasticTreeModel;

public class Codice {
	
	public Codice(String codice, float importo, boolean riscattato) {
		this.codice = codice;
		this.importo = importo;
		this.riscattato = riscattato;
	}
	
	public Codice(String codice, float importo) {
		this.codice = codice;
		this.importo = importo;
		this.riscattato = false;
	}
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public float getImporto() {
		return importo;
	}
	public void setImporto(long importo) {
		this.importo = importo;
	}
	public boolean isRiscattato() {
		return riscattato;
	}
	public void setRiscattato(boolean riscattato) {
		this.riscattato = riscattato;
	}
	
	private String codice;
	private float importo;
	private boolean riscattato;
	
	
}

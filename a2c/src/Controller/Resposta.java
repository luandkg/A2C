package Controller;

public class Resposta {

	private boolean istatus = false;
	private String ifrase = "";

	public Resposta(boolean status, String frase) {
		this.istatus = status;
		this.ifrase = frase;
	}

	public boolean getStatus() {
		return this.istatus;
	}

	public String getFrase() {
		return this.ifrase;
	}

}

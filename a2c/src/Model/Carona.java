package Model;

public class Carona {

	private int cid = 0;
	private int usuarioid = 0;
	private String horario = "";
	private String origem = "";
	private String destino = "";
	private String modelo = "";
	private float preco = (float) 0.0;

	private int vagas = 0;

	public int getCID() {
		return this.cid;
	}

	public void setCID(int valor) {
		this.cid = valor;
	}

	public void setUsuarioID(int valor) {
		this.usuarioid = valor;
	}

	public int getUsuarioID() {
		return this.usuarioid;
	}

	public void setHorario(String valor) {
		this.horario = valor;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setOrigem(String valor) {
		this.origem = valor;
	}

	public String getOrigem() {
		return this.origem;
	}

	public void setDestino(String valor) {
		this.destino = valor;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setModelo(String valor) {
		this.modelo = valor;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setVagas(int valor) {
		this.vagas = valor;
	}

	public int getVagas() {
		return this.vagas;
	}
	
	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float valor) {
		this.preco = valor;
	}
	

}

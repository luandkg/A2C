package Model;

public class MetodoPagamento {

	private int mpid = 0;
	private int usuarioid = 0;

	private String metodo = "";
	private String cartao = "";

	public int getMPID() {
		return this.mpid;
	}

	public void setMPID(int valor) {
		this.mpid = valor;
	}

	public void setUsuarioID(int valor) {
		this.usuarioid = valor;
	}

	public int getUsuarioID() {
		return this.usuarioid;
	}

	public void setMetodo(String valor) {
		this.metodo = valor;
	}

	public String getMetodo() {
		return this.metodo.toUpperCase();
	}

	public void setCartao(String valor) {
		this.cartao = valor;
	}

	public String getCartao() {
		return this.cartao;
	}

}

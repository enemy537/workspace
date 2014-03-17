package pilha.encadeada;

public class No {
	private String valor;
	private No prox;
	public No(String valor) {
		this.valor = valor;
		this.prox = null;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
}

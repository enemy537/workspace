package lista.encadeada;

public class No {
	private String valor;
	private No proximo;
	
	public No(String valor){
		this.valor = valor;
		proximo = null;
	}
	public void setProximo(No valor){
		proximo = valor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
}

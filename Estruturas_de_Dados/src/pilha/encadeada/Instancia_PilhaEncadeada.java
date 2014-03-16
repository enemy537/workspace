package pilha.encadeada;

import lista.encadeada.No;

public class Instancia_PilhaEncadeada {
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		for(int i = 0; i < 101; i++){
			pilha.inserir(new No(i+""));
		}
		System.out.println(pilha);
	}
}

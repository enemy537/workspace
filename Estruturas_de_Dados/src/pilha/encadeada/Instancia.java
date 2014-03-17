package pilha.encadeada;

public class Instancia {
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		
		for(int i=0;i<10;i++){
			pilha.inserir(new No(i+" "));
		}
		
		System.out.println(pilha);
		
		pilha.remover();
		System.out.println(pilha);
	}
}

package pilha.array;

public class Instancia_pilha {
	public static void main(String[] args) {
		Pilha pilha = new Pilha(6);
		for(int i = 0; i < 7; i++){
			pilha.inserir(i);
		}
		System.out.println(pilha);
		for(int i = 6; i >= 0; i--){
			pilha.remover();
		}
		System.out.println(pilha);
	}
}

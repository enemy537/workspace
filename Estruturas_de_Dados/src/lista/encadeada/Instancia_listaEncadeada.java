package lista.encadeada;

public class Instancia_listaEncadeada {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		for(int i =0;i <= 1000;i++){
			lista.inserir(new No(i+""));
		}
		
//		System.out.println(lista);
//		lista.remover();
//		for(int i = 101; i > 0; i--){
//			lista.remover();
//		}
		System.out.println(lista);
	}
}

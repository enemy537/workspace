package lista.array;

public class Instancia_Lista {
	public static void main(String[] args) {
		Lista lista = new Lista(5);
		
		lista.inserir(42);
		lista.inserir(42);
		lista.inserir(42);
		
		System.out.println(lista);
		
		lista.remover();
		
		System.out.println(lista);
		
		lista.inserir(42);
		lista.inserir(42);
		lista.inserir(42);
		
		System.out.println(lista);
	}
}

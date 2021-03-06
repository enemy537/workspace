package lista.encadeada;

import javax.swing.JOptionPane;

public class ListaEncadeada {
	private No inicio;
	private No aux;
	private int tamanho;
	
	public ListaEncadeada(){
		inicio = null;
		tamanho = 0;
	}
	public boolean isVazia(){
		if(inicio == null){
			return true;
		}
		return false;
	}
	public void inserir(No valor){
		if(!isVazia()){
			aux = inicio;
			while(aux.getProximo() != null){
				aux = aux.getProximo();
			}
			aux.setProximo(valor);
		}
		else{
			inicio = valor;
		}	
		tamanho++;
	}
	public void remover(){
		if(!isVazia()){
			inicio = inicio.getProximo();
			tamanho--;
		}
		else{
			JOptionPane.showMessageDialog(null, "lista vazia","alerta",JOptionPane.ERROR_MESSAGE);
		}
	}
	@Override
	public String toString() {
		String auxString = new String();
		aux = inicio;
		
		for(int i = tamanho; i > 0;i--){
			auxString += aux.getValor() +" ";
			aux = aux.getProximo();
		}
		return "ListaEncadeada ["+auxString+"]";
	}
	
}

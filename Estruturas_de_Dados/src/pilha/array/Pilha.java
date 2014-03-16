package pilha.array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pilha {
	private Integer[] corpo;
	private Integer topo;
	private int tamanho;
	
	public Pilha(int corpo){
		this.corpo = new Integer[corpo];
		this.tamanho = corpo;
		this.topo = 0;
	}
	
	public boolean isCheia(){
		if(topo == tamanho){
			return true;
		}
		return false;
	}
	public boolean isVazia(){
		if(topo == 0){
			return true;
		}
		return false;
	}
	public void inserir(int valor){
		if(!isCheia()){
			corpo[topo] = valor;
			topo++;
		}
		else{
			JOptionPane.showMessageDialog(null, "pilha cheia","alerta!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void remover(){
		if(!isVazia()){
			corpo[topo - 1] = null;
			topo--;
		}
		else{
			JOptionPane.showMessageDialog(null, "pilha vazia","alerta!",JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public String toString() {
		return "Pilha [corpo=" + Arrays.toString(corpo) + "]";
	}
}

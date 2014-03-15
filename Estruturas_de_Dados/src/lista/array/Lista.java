package lista.array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lista {
	private Integer[] corpo;
	private Integer inicio;
	private Integer fim;
	private int tamanho;
	private int numElemt;
	
	public Lista(int corpo){
		this.corpo = new Integer[corpo];
		this.inicio = 0;
		this.fim = 0;
		this.tamanho = corpo;
		this.numElemt = 0;
	}
	
	public boolean isCheia(){
		if(numElemt == tamanho){
			return true;
		}
		return false;
	}
	public boolean isVazia(){
		if(numElemt == 0){
			return true;
		}
		return false;
	}
	public void inserir(int valor){
		if(!isCheia()){
			corpo[inicio] = valor;
			inicio = (inicio + 1)%tamanho;
			numElemt++;
		}
		else{
			JOptionPane.showMessageDialog(null, "lista cheia","alerta!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void remover(){
		if(!isVazia()){
			corpo[fim] = null;
			fim = (fim + 1) % tamanho;
			numElemt--;
		}
		else{
			JOptionPane.showMessageDialog(null, "lista vazia","alerta!",JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public String toString() {
		return "Lista [corpo=" + Arrays.toString(corpo) + "]";
	}
}

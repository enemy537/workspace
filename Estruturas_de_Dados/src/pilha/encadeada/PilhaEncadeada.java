package pilha.encadeada;

import javax.swing.JOptionPane;

public class PilhaEncadeada {
	private No topo;
	private int tamanho;
	public PilhaEncadeada() {
		topo = null;
		tamanho = 0;
	}
	
	public boolean isVazia(){
		if(tamanho == 0){
			return true;
		}
		return false;
	}
	public void inserir(No valor){
		valor.setProx(topo);
		topo = valor;
		tamanho++;
	}
	public void remover(){
		if(!isVazia()){
			topo = topo.getProx();
			tamanho--;
		}
		else{
			JOptionPane.showConfirmDialog(null, "pilha vazia","alerta",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public String toString() {
		String auxString = new String();
		No auxNo = topo;
		while(auxNo != null){
			auxString += auxNo.getValor()+" ";
			auxNo = auxNo.getProx();
		}
		return "PilhaEncadeada [" +auxString+"]";
	}
	
}

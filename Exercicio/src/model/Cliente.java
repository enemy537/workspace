package model;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<CD> discos;
	public Cliente(String nome) {
		this.nome = nome;
		this.discos = new ArrayList<CD>();
	}
	public Cliente() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<CD> getDiscos() {
		return discos;
	}
	public void setDiscos(ArrayList<CD> discos) {
		this.discos = discos;
	}
	
	public void addCD(String string, String string2, int i, float f) {
		CD temp = new CD(string, string2, i, f);
		this.discos.add(temp);
	}
	public void removeCD(CD cd1) {
		if(this.discos.contains(cd1)){
			this.discos.remove(this.discos.indexOf(cd1));
		}
	}
	@Override
	public String toString() {
		return nome + "[" +this.discos.size()+" cd(s)" + "]";
	}

}

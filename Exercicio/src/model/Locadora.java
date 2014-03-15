package model;

import java.util.ArrayList;

public class Locadora {
	private ArrayList<Cliente> clientes;

	public Locadora(){
		clientes = new ArrayList<Cliente>();
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void addCliente(String cliente) {
		Cliente temp = new Cliente(cliente);
		this.clientes.add(temp);
	}

	public void removeCliente(Cliente c1) {
		if(this.clientes.contains(c1)){
			this.clientes.remove(this.clientes.indexOf(c1));
		}		
	}
	
}

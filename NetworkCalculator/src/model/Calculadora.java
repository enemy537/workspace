package model;

import java.util.HashMap;

public class Calculadora {
	private Integer hosts;
	private Integer decMasc;
	private String binMasc;
	private HashMap<Integer,Integer> dicMasc;
	
	public Calculadora(){
		 dicMasc = new HashMap<Integer,Integer>();
		 calcDecMas();
	}
	
	public void calcDecMas(){
		for(int i = 0; i < 33; i++){
			this.dicMasc.put((int) Math.pow(2, 1) ,i);
		}
	}
	
	public int getHosts() {
		return hosts;
	}
	public boolean setHosts(int hosts) {
		if(hosts <= Math.pow(2,32) && hosts > 0){
			this.hosts = hosts;
			return true;
		}
		return false;
	}
	public int getDecMasc() {
		return decMasc;
	}
	public boolean setDecMasc() {
		if(this.hosts != null){
			for(Integer x: this.dicMasc.keySet()){
				if(x >= this.hosts){
					this.decMasc = this.dicMasc.get(x);
					return true;
				}
			}
			return false;
		}
		return false;
	}
	public String getBinMasc() {
		return binMasc;
	}
	public boolean setBinMasc() {
		if(this.decMasc != null){
			
		}
		return false;
	}
}

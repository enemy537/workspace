package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Comando {
	private String comando;
	
	public Comando(String comando) {
		this.comando = comando;
	}
	public String executaComando() throws InterruptedException{
		
		StringBuffer saidaComando = new StringBuffer();
		Process p;
		
		try {
			p = Runtime.getRuntime().exec(this.comando);
			p.waitFor();
			BufferedReader buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));

			while(buffer.readLine() != null){
				saidaComando.append(buffer.readLine() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return saidaComando.toString();
	}
}

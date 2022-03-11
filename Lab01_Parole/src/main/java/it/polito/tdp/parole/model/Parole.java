package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	private List<String> struttura;
	
	public Parole() {
		//TODO
		struttura = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		this.struttura.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		List<String> l = new LinkedList<String>(this.struttura);
		
		Collections.sort(l, new CompParole());
		
		return l;
	}
	
	public void reset() {
		// TODO
		struttura.clear();
	}
	
	public boolean cancella(String p) {
		return this.struttura.remove(p);
	}

}

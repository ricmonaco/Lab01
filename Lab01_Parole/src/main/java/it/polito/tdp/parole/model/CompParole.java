package it.polito.tdp.parole.model;

import java.util.Comparator;

public class CompParole implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
		String s1 = arg0.toLowerCase();
		String s2 = arg1.toLowerCase();
		
		return s1.compareTo(s2);
	}

	
}

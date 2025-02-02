package no.hvl.dat102;

import java.util.Arrays;

public class Filmarkiv implements FilmarkivADT {
	
	private Film[] filmer;
	private int antall;
	
	public Filmarkiv(int plass) {
		
		filmer = new Film[plass];
		antall = 0;
		
	}
	
	@Override
	public Film finnFilm(int nr) {
		
		for(Film f : filmer) {
			
			if(f.getFilmnr() == nr) {
				
				return f;
				
			}
			
		}
		
		return null;
		
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		
		if(filmer.length <= antall) {
			
			filmer = Arrays.copyOf(filmer, filmer.length * 2);
			
		}
		
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i] == null) {
				
				antall++;
				filmer[i] = nyFilm;
				break;
				
			}
			
		}
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		Film film = finnFilm(filmnr);
		
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i] == film) {
				
				filmer[i] = filmer[filmer.length - 1];
				filmer[filmer.length - 1] = null;
				antall--;
				filmer = Arrays.copyOf(filmer, antall);
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[] soek = new Film[filmer.length];
		int temp = 0;
		
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i] != null && filmer[i].getTittel().contains(delstreng)) {
				
				soek[temp] = filmer[i];
				temp++;
				
			}
			
		}
		
		soek = trimTab(soek, temp);
		
		return soek;
		
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		Film[] soek = new Film[filmer.length];
		int temp = 0;
		
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i] != null && filmer[i].getProdusent().contains(delstreng)) {
				
				soek[temp] = filmer[i];
				temp++;
				
			}
			
		}
		
		soek = trimTab(soek, temp);
		
		return soek;
		
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		int count = 0;
		
		for(Film f : filmer) {
			
			if(f != null) {
				
				count += (f.getSjanger() == sjanger) ? (1) : (0);
				
			}
			
		}
		
		return count;
		
	}

	@Override
	public int antall() {
		
		return antall;
		
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		
		Film[] nyTab = new Film[n];
		int i = 0;
		
		while(i < n) {
			
			nyTab[i] = tab[i];
			i++;
			
		}
		
		return nyTab;
		
	}
	
}

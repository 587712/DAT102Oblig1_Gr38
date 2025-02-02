package no.hvl.dat102;

import java.util.Arrays;

public class FilmArkiv implements FilmarkivADT {
	
	private int antall;
	private Film[] filmer;
	
	public FilmArkiv(int antall) {
		
		filmer = new Film[antall];
		
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
		
		if(filmer.length > antall) {
			
			for(int i = 0; i < filmer.length; i++) {
				
				if(filmer[i] == null) {
					
					filmer[i] = nyFilm;
					antall++;
					break;
					
				}
				
			}
			
		}
		
		else {
			
			filmer = Arrays.copyOf(filmer, filmer.length * 2);
			leggTilFilm(nyFilm);
			
		}
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		for(int i = 0; i < filmer.length; i++) {
			
			if(filmer[i].getFilmnr() == filmnr) {
				
				filmer[i] = filmer[filmer.length - 1];
				antall--;
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[] result = new Film[filmer.length];
		int resultAntall = 0;
		
		for(Film f : filmer) {
			
			if(f.getTittel().contains(delstreng)) {
				
				result[resultAntall] = f;
				resultAntall++;
				
			}
			
		}
		
		return trimTab(result, resultAntall);
		
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		Film[] result = new Film[filmer.length];
		int resultAntall = 0;
		
		for(Film f : filmer) {
			
			if(f.getFilmskapar().contains(delstreng)) {
				
				result[resultAntall] = f;
				resultAntall++;
				
			}
			
		}
		
		return trimTab(result, resultAntall);
		
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
	
	public void print(Film[] samling) {
		
		for(Film f : samling) {
			
			System.out.println(f.getFilmnr());
			
		}
		
	}
	
	public Film[] getFilmer() {
		
		return filmer;
		
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		int count = 0;
		
		for(int i = 0; i < filmer.length; i++) {
			
			count += (filmer[i].getSjanger().equals(sjanger)) ? (1) : (0);
			
		}
		
		return count;
		
	}
	
}

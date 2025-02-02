package no.hvl.dat102;

public class Filmarkiv2 implements FilmarkivADT {
	
	int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2(int plass) {
		
		antall = 0;
		
	}
	
	@Override
	public Film finnFilm(int nr) {
		
		for(int i = 0; i < antall; i++) {
			
			
			
		}
		
		return null;
		
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		
		
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		return false;
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		return null;
		
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		return null;
		
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		return 0;
		
	}

	@Override
	public int antall() {
		
		return 0;
		
	}
	
}

package no.hvl.dat102;

public interface FilmarkivADT {
	
	Film finnFilm(int nr);
	void leggTilFilm(Film nyFilm);
	boolean slettFilm(int filmnr);
	Film[] soekTittel(String delstreng);
	Film[] soekProdusent(String delstreng);
	int antall(Sjanger sjanger);
	int antall();
	
}

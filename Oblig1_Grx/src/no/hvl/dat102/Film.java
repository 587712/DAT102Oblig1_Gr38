package no.hvl.dat102;

public class Film {
	
	private int filmnr;
	private String filmskapar;
	private String tittel;
	private int lansert;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {}
	
	public Film(int filmnr, String filmskapar, String tittel, int lansert, Sjanger sjanger, String filmselskap) {
		
		this.filmnr = filmnr;
		this.filmskapar = filmskapar;
		this.tittel = tittel;
		this.lansert = lansert;
		this.filmselskap = filmselskap;
		this.sjanger = sjanger;
		
	}
	
	public int getFilmnr() {
		
		return filmnr;
		
	}
	
	public String getFilmskapar() {
		
		return filmskapar;
		
	}
	
	public String getTittel() {
		
		return tittel;
		
	}
	
	public int getLansert() {
		
		return lansert;
		
	}
	
	public Sjanger getSjanger() {
		
		return sjanger;
		
	}
	
	public String getFilmselskap() {
		
		return filmselskap;
		
	}
	
	public void setFilmnr(int newFilmnr) {
		
		filmnr = newFilmnr;
		
	}
	
	public void setFilmskapar(String newFilmskapar) {
		
		filmskapar = newFilmskapar;
		
	}
	
	public void setTittel(String newTittel) {
		
		tittel = newTittel;
		
	}
	
	public void setLansert(int newLansert) {
		
		lansert = newLansert;
		
	}
	
	public void setSjanger(Sjanger newSjanger) {
		
		sjanger = newSjanger;
		
	}
	
	public void setFilmselskap(String newFilmselskap) {
		
		filmselskap = newFilmselskap;
		
	}
	
}

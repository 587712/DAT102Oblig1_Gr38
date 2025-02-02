package no.hvl.dat102;

import java.util.Objects;

public class Film {
	
	private int filmnr;
	private String produsent;
	private String tittel;
	private int aar;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {}
	
	public Film(int filmnr, String produsent, String tittel, int aar, Sjanger sjanger, String filmselskap) {
		
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.aar = aar;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
		
	}
	
	public int getFilmnr() {
		
		return filmnr;
		
	}
	
	public String getProdusent() {
		
		return produsent;
		
	}
	
	public String getTittel() {
		
		return tittel;
		
	}
	
	public int getAar() {
		
		return aar;
		
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
	
	public void setProdusent(String newProdusent) {
		
		produsent = newProdusent;
		
	}
	
	public void setTittel(String newTittel) {
		
		tittel = newTittel;
		
	}
	
	public void setAar(int newAar) {
		
		aar = newAar;
		
	}
	
	public void setSjanger(Sjanger newSjanger) {
		
		sjanger = newSjanger;
		
	}
	
	public void setFilmselskap(String newFilmselskap) {
		
		filmselskap = newFilmselskap;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		if(!(obj instanceof Film)) return false;
		
		Film film = (Film) obj;
		
		return filmnr == film.getFilmnr();
		
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(filmnr);
		
	}
	
}

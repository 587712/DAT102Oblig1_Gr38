package no.hvl.dat102;

import java.util.Scanner;

public class Tekstgrensesnitt {
	
	public Film lesFilm() {
		
		Scanner s = new Scanner(System.in);
		
		int filmNr = s.nextInt();
		String produsent = s.nextLine();
		String tittel = s.nextLine();
		int aar = s.nextInt();
		String sjanger = s.nextLine();
		String filmselskap = s.nextLine();
		
		Film nyFilm = new Film(filmNr, produsent, tittel, aar, Sjanger.finnSjanger(sjanger), filmselskap);
		
		s.close();
		
		return nyFilm;
		
	}
	
	public void skrivUtFilm(Film film) {
		
		StringBuilder s = new StringBuilder();
		
		s.append("[Film nummer: " + film.getFilmnr())
        	.append(" Produsent: " + film.getProdusent())
        	.append(" Tittel: " + film.getTittel())
        	.append(" Lansering: " + film.getAar())
        	.append(" Filmselskap: " + film.getFilmselskap())
        	.append(" Sjanger: " + film.getSjanger() + "]");
		
	}
	
	public void skrivUtFilmDelstrengTittel(FilmarkivADT arkiv, String delstreng) {
		
		Film[] temp = arkiv.soekTittel(delstreng);
		
		for(Film f : temp) {
			
			skrivUtFilm(f);
			System.out.println();
			
			
		}
		
	}
	
	public void skrivUtFilmDelstrengProdusent(FilmarkivADT arkiv, String delstreng) {
		
		Film[] temp = arkiv.soekProdusent(delstreng);
		
		for(Film f : temp) {
			
			skrivUtFilm(f);
			System.out.println();
			
		}
		
	}
	
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		
		System.out.println("Antall filmer: " + arkiv.antall());
		
		for(Sjanger s : Sjanger.values()) {
			
			System.out.println("Antall filmer i " + s.toString().toLowerCase() + ": " + arkiv.antall(s));
			
		}
		
		System.out.println();
		
	}
	
}

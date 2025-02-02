package no.hvl.dat102;

import java.util.Scanner;

public class Tekstgrensesnitt {
	
	public Film lesFilm(FilmArkiv filmarkiv) {
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		if(input.equals("Tittel")) {
			
			s.nextLine();
			s.close();
			
			return filmarkiv.soekTittel(input)[0];
			
		}
		
		else if(input.equals("Produsent")) {
			
			s.nextLine();
			s.close();
			
			return filmarkiv.soekProdusent(input)[0];
			
		}
		
		s.close();
		
		return null;
		
	}
	
	public void skrivUtFilm(Film film) {
		
		System.out.println(String.format("Filmnummer %s", film.getFilmnr()));
		
	}
	
	public void skrivUtFilmDelstrengTittel(FilmarkivADT arkiv, String delstreng) {
		
		Film[] filmer = arkiv.soekTittel(delstreng);
		
		for(int i = 0; i < filmer.length; i++) {
			
			System.out.println("Filmnummer " + filmer[i].getFilmnr());
			System.out.println("Filmskapar " + filmer[i].getFilmskapar());
			System.out.println("Tittel " + filmer[i].getTittel());
			System.out.println("Lansert " + filmer[i].getLansert());
			System.out.println("Sjanger " + filmer[i].getSjanger().toString());
			System.out.println("Filmselskap " + filmer[i].getFilmselskap());
			System.out.println();
			
		}
		
	}
	
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
		
		Film[] filmer = arkiv.soekProdusent(delstreng);
		
		for(int i = 0; i < filmer.length; i++) {
			
			System.out.println("Filmnummer " + filmer[i].getFilmnr());
			System.out.println("Filmskapar " + filmer[i].getFilmskapar());
			System.out.println("Tittel " + filmer[i].getTittel());
			System.out.println("Lansert " + filmer[i].getLansert());
			System.out.println("Sjanger " + filmer[i].getSjanger().toString());
			System.out.println("Filmselskap " + filmer[i].getFilmselskap());
			System.out.println();
			
		}
		
	}
	
	public void skrivUtSttistikk(FilmarkivADT arkiv) {
		
		System.out.println("Antall filmar " + arkiv.antall());
		
	}
	
}

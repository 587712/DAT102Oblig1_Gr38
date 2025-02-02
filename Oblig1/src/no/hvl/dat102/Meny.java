package no.hvl.dat102;

import java.util.Scanner;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv) {
		
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
		
	}
	
	public void start() {
		
		Film film1 = new Film(1, "Første produsent","Første tittel", 1900, Sjanger.finnSjanger("drama"), "Første selskap");
		Film film2 = new Film(2, "Andre produsent","Andre tittel", 1950, Sjanger.finnSjanger("action"), "Andre selskap");
		Film film3 = new Film(3, "Tredje produsent","Tredje tittel", 2000, Sjanger.finnSjanger("drama"), "Tredje selskap");
		
		filmarkiv.leggTilFilm(film1);
		filmarkiv.leggTilFilm(film2);
		filmarkiv.leggTilFilm(film3);
		
		boolean done = false;
		String action;
		Scanner s = new Scanner(System.in);
		
		while(!done) {
			
			System.out.println("les: input ny film\nfilm: skriv ut film frå filmnnr\ntittel: skriv ut film basert på tittel\nprodusent: skriv ut film basert på produsent\nstatistikk: vis statistikk\ndone: avslutt programmet");
			
			action = s.nextLine().toLowerCase();
			
			switch (action) {
				case "les":
					filmarkiv.leggTilFilm(tekstgr.lesFilm());
					break;
				case "film":
					tekstgr.skrivUtFilm(filmarkiv.finnFilm(s.nextInt()));
					s.nextLine();
					break;
				case "tittel":
					tekstgr.skrivUtFilmDelstrengTittel(filmarkiv, s.nextLine());
					break;
				case "produsent":
					tekstgr.skrivUtFilmDelstrengProdusent(filmarkiv, s.nextLine());
					break;
				case "statistikk":
					tekstgr.skrivUtStatistikk(filmarkiv);
					break;
				case "done":
					done = true;
					break;
				default:
					System.out.println("Incorrect input!");
					break;
			}
			
		}
		
	}
	
}

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
		
		boolean done = false;
		
		Film film1 = new Film(1, "John Smug", "Better than All", 1998, Sjanger.DRAMA, "Superior Films");
		Film film2 = new Film(2, "Sir Slice'O Bread", "The Evil Baker", 1970, Sjanger.ACTION, "Bored Pictures");
		Film film3 = new Film(3, "Prett Ensious", "Artsy Partsy", 2015, Sjanger.DRAMA, "Superior Films");
		
		filmarkiv.leggTilFilm(film1);
		filmarkiv.leggTilFilm(film2);
		filmarkiv.leggTilFilm(film3);
		
		Scanner s = new Scanner(System.in);
		
		while(!done) {
			
			System.out.println("Skriv inn handling: ");
			
			String action = s.nextLine();
			
			if(action.equals(("Finn film").toUpperCase())) {
				
				System.out.println("Skriv inn filmnummer: ");
				
				System.out.println(filmarkiv.finnFilm(s.nextInt()));
				
			}
			
			else if(action.equals("Legg til")) {
				
				System.out.println(tekstgr.lesFilm(filmarkiv));
				
			}
			
		}
		
		s.close();
		
	}
	
}

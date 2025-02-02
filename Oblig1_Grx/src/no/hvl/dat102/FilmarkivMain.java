package no.hvl.dat102;

public class FilmarkivMain {
	
	public static void main(String[] args) {
		
		FilmarkivADT filma = new FilmArkiv(100);
		Meny meny = new Meny(filma);
		meny.start();
		
	}

}

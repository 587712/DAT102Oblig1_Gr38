package no.hvl.dat102;

import java.util.Scanner;

public class FilmarkivMain {

	public static void main(String[] args) {
		
		FilmarkivADT filma;
		Scanner s = new Scanner(System.in);
		System.out.println("Skriv '1' for Filmarkiv, eller '2' for Filmarkiv2");
		int action = s.nextInt();
		s.nextLine();
		
		if(action == 1) {
			
			filma = new Filmarkiv(100);
			
		}
		
		else {
			
			filma = new Filmarkiv2();
			
		}
		
		Meny meny = new Meny(filma);
		meny.start();
		s.close();
		
	}

}

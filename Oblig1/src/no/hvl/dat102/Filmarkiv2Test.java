package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Filmarkiv2Test {
	
	Film film1;
	Film film2;
	Film film3;
	
	Filmarkiv2 filmer1;
	
	@BeforeEach
	void setUp() {
		
		film1 = new Film(1, "John Smug", "Better than All", 1998, Sjanger.finnSjanger("drama"), "Superior Films");
		film2 = new Film(2, "Sir Slice'O Bread", "The Evil Baker", 1970, Sjanger.finnSjanger("action"), "Bored Pictures");
		film3 = new Film(3, "Prett Ensious", "Artsy Partsy", 2015, Sjanger.finnSjanger("drama"), "Superior Films");
		
		filmer1 = new Filmarkiv2(3);
		filmer1.leggTilFilm(film1);
		filmer1.leggTilFilm(film2);
		filmer1.leggTilFilm(film3);
		
		
		
	}
	
	@Test
	void testFilmGet() {
		
		assertEquals(film1.getFilmnr(), 1);
		assertEquals(film2.getFilmnr(), 2);
		assertEquals(film3.getFilmnr(), 3);
		
		assertEquals(film1.getProdusent(), "John Smug");
		assertEquals(film2.getProdusent(), "Sir Slice'O Bread");
		assertEquals(film3.getProdusent(), "Prett Ensious");
		
		assertEquals(film1.getTittel(), "Better than All");
		assertEquals(film2.getTittel(), "The Evil Baker");
		assertEquals(film3.getTittel(), "Artsy Partsy");
		
		assertEquals(film1.getAar(), 1998);
		assertEquals(film2.getAar(), 1970);
		assertEquals(film3.getAar(), 2015);
		
		assertEquals(film1.getSjanger(), Sjanger.finnSjanger("drama"));
		assertEquals(film2.getSjanger(), Sjanger.finnSjanger("action"));
		assertEquals(film3.getSjanger(), Sjanger.finnSjanger("drama"));
		
		assertEquals(film1.getFilmselskap(), "Superior Films");
		assertEquals(film2.getFilmselskap(), "Bored Pictures");
		assertEquals(film3.getFilmselskap(), "Superior Films");
		
	}
	
	@Test
	void testFilmSet() {
		
		film1.setFilmnr(0);
		film1.setProdusent("Mister Guy");
		film1.setTittel("Movie the First");
		film1.setAar(2000);
		film1.setSjanger(Sjanger.finnSjanger("action"));
		film1.setFilmselskap("Filmselskap");
		
		film2.setFilmnr(1);
		film2.setProdusent("Guy's Wife");
		film2.setTittel("The Revolution");
		film2.setAar(1975);
		film2.setSjanger(Sjanger.finnSjanger("history"));
		film2.setFilmselskap("Filmselskap");
		
		film3.setFilmnr(2);
		film3.setProdusent("Guy's Mistress");
		film3.setTittel("Movie the Second");
		film3.setAar(2016);
		film3.setSjanger(Sjanger.finnSjanger("drama"));
		film3.setFilmselskap("Filmselskap");
		
		assertEquals(film1.getFilmnr(), 0);
		assertEquals(film2.getFilmnr(), 1);
		assertEquals(film3.getFilmnr(), 2);
		
		assertEquals(film1.getProdusent(), "Mister Guy");
		assertEquals(film2.getProdusent(), "Guy's Wife");
		assertEquals(film3.getProdusent(), "Guy's Mistress");
		
		assertEquals(film1.getTittel(), "Movie the First");
		assertEquals(film2.getTittel(), "The Revolution");
		assertEquals(film3.getTittel(), "Movie the Second");
		
		assertEquals(film1.getAar(), 2000);
		assertEquals(film2.getAar(), 1975);
		assertEquals(film3.getAar(), 2016);
		
		assertEquals(film1.getSjanger(), Sjanger.finnSjanger("action"));
		assertEquals(film2.getSjanger(), Sjanger.finnSjanger("history"));
		assertEquals(film3.getSjanger(), Sjanger.finnSjanger("drama"));
		
		assertEquals(film1.getFilmselskap(), "Filmselskap");
		assertEquals(film2.getFilmselskap(), "Filmselskap");
		assertEquals(film3.getFilmselskap(), "Filmselskap");
		
	}
	
	@Test
	void testEquals() {
		
		Film film4 = new Film(1, "Sir Slice'O Bread", "The Evil Baker", 1970, Sjanger.finnSjanger("action"), "Bored Pictures");
		
		assertEquals(film1, film4);
		assertEquals(film1.hashCode(), film4.hashCode());
		
	}
	
	@Test
	void testLeggTilFinnOgSlett() {
		
		assertEquals(filmer1.finnFilm(1), film1);
		assertEquals(filmer1.finnFilm(2), film2);
		assertEquals(filmer1.finnFilm(3), film3);
		
		assertTrue(filmer1.slettFilm(1));
		
		assertTrue(filmer1.finnFilm(1) == null);
		assertTrue(filmer1.finnFilm(2) == film2);
		assertTrue(filmer1.finnFilm(3) == film3);
		
	}
	/*
	@Test
	void testSoek() {
		
		Film[] checkFilmT = filmer1.soekTittel("er");
		
		assertEquals(checkFilmT[0], film1);
		assertEquals(checkFilmT[1], film2);
		assertTrue(checkFilmT.length == 2);
		
		Film[] checkFilmP = filmer1.soekProdusent("re");
		
		assertEquals(checkFilmP[0], film2);
		assertEquals(checkFilmP[1], film3);
		assertTrue(checkFilmP.length == 2);
		
	}
	
	@Test
	void testAntall() {
		
		assertTrue(filmer1.antall() == 3);
		assertTrue(filmer1.antall(Sjanger.finnSjanger("drama")) == 2);
		
	}
	*/
}

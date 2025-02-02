package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Oblig1_Test {
	
	Film film1 = new Film(1, "Filmskapar1", "Tittel1", 1, Sjanger.ACTION, "Filmselskap1");
	Film film2 = new Film(2, "Filmskapar2", "Tittel2", 2, Sjanger.SCIFI, "Filmselskap2");
	Film film3 = new Film(3, "Filmskapar3", "Tittel3", 3, Sjanger.HISTORY, "Filmselskap3");
	
	@Test
	void testFilm() {
		
		assertTrue(film1.getFilmnr() == 1);
		assertEquals(film2.getFilmskapar(), "Filmskapar2");
		assertEquals(film3.getTittel(), "Tittel3");
		assertTrue(film1.getLansert() == 1);
		assertEquals(film2.getFilmselskap(), "Filmselskap2");
		
		film1.setFilmnr(0);
		film2.setFilmskapar("Filmskapar4");
		film3.setTittel("Tittel4");
		film1.setLansert(0);
		film2.setFilmselskap("Filmselskap4");
		
		assertTrue(film1.getFilmnr() == 0);
		assertEquals(film2.getFilmskapar(), "Filmskapar4");
		assertEquals(film3.getTittel(), "Tittel4");
		assertTrue(film1.getLansert() == 0);
		assertEquals(film2.getFilmselskap(), "Filmselskap4");
		
	}
	
	FilmArkiv filmer1 = new FilmArkiv(2);
	
	@Test
	void testLeggTilFilm() {
		
		filmer1.leggTilFilm(film1);
		filmer1.leggTilFilm(film2);
		filmer1.leggTilFilm(film3);
		
	}
	
	FilmArkiv filmer2 = new FilmArkiv(3);
	
	@Test
	void testFinnFilm() {
		
		filmer2.leggTilFilm(film1);
		filmer2.leggTilFilm(film2);
		filmer2.leggTilFilm(film3);
		
		assertEquals(filmer2.finnFilm(2), film2);
		assertEquals(filmer2.finnFilm(3), film3);
		
	}
	
	FilmArkiv filmer3 = new FilmArkiv(3);
	
	@Test
	void testSlettFilm() {
		
		filmer3.leggTilFilm(film1);
		filmer3.leggTilFilm(film2);
		filmer3.leggTilFilm(film3);
		
		filmer3.slettFilm(2);
		
	}
	
	FilmArkiv filmer4 = new FilmArkiv(3);
	
	@Test
	void testSoekTittel() {
		
		filmer4.leggTilFilm(film1);
		filmer4.leggTilFilm(film2);
		filmer4.leggTilFilm(film3);
		
		FilmArkiv filmer5 = new FilmArkiv(3);
		filmer5.leggTilFilm(film1);
		filmer5.leggTilFilm(film2);
		filmer5.leggTilFilm(film3);
		
		FilmArkiv filmer6 = new FilmArkiv(1);
		filmer6.leggTilFilm(film1);
		
		FilmArkiv filmer7 = new FilmArkiv(0);
		
		assertEquals(filmer4.soekTittel("Tittel"), filmer5);
		assertEquals(filmer4.soekTittel("1"), filmer6);
		assertEquals(filmer4.soekTittel("Gary"), filmer7);
		
	}
	
	FilmArkiv filmer8 = new FilmArkiv(3);
	
	@Test
	void testGrensesnitt() {
		
		filmer8.leggTilFilm(film1);
		filmer8.leggTilFilm(film2);
		filmer8.leggTilFilm(film3);
		
		Tekstgrensesnitt tg = new Tekstgrensesnitt();
		
		System.out.println(tg.lesFilm(filmer8).getFilmskapar());
		tg.skrivUtFilm(film1);
		tg.skrivUtFilm(film2);
		
		tg.skrivUtFilmDelstrengTittel(filmer8, "Tittel");
		tg.skrivUtFilmDelstrengTittel(filmer8, "1");
		
		tg.skrivUtFilmProdusent(filmer8, "Film");
		tg.skrivUtFilmProdusent(filmer8, "1");
		
	}
	
}

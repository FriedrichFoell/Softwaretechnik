import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HonorarRechnerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testberechneHonorar() {
		//Berechnung ohne Leerzeichen
		assertEquals(0.179,HonorarRechner.berechneHonorar("WICHTIG: F�r Aufgabe 3 und 4 k�nnen sie ihr eigenes Problem und ihre eigene Programmiersprache und ihr eigenes Lieblings(mock)fragmework nehmen! Hauptsache es macht Spa� und sie tanken nochmal die Prinzipien! "));
		//Berechnung bei leerem String
		assertEquals(0,HonorarRechner.berechneHonorar(""));
		//Berechnung bei String = null
		Assertions.assertThrows(NullPointerException.class,()->{HonorarRechner.berechneHonorar(null);});
		//Berechnung bei Wiederholung. Dieser Test schl�gt fehl da Ich nicht in der Lage war die passende Methode zu programmieren.
		assertEquals(0,HonorarRechner.berechneHonorar("Dieser Satz ist keine Kopie. Dieser Satz ist keine Kopie"));
	}
	@Test
	void testz�hleBilder() {
		//z�hle Bilder
		assertEquals(2,HonorarRechner.z�hleBilder("Das ist ein test text. er enth�lt ein picture und noch ein picture"));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RechnerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testWurzelZiehen() {
		assertEquals(2,Rechner.WurzelZiehen(4,5));
		
	}

	@Test
	void testModulo() {
		assertEquals(1,Rechner.Modulo(10,3));
	}

	@Test
	void testPotenz() {
		assertEquals(243,Rechner.Potenz(3,5));
	}
	@Test
	void testDivision() {
		assertEquals(10,Rechner.Division(100,10));
	}
	
	@Test
	 void testException() {
		Assertions.assertThrows(ArithmeticException.class,()->{Rechner.Division(0,0);});
	}
}

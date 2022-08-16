package utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	private static Funciones f;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		f = new Funciones();
	}

	@Test
	void devuelveCentraltest() {
		
		assertEquals(5, f.devuelveCentral(1, 5, 9));
		assertEquals(5, f.devuelveCentral(5, 9, 1));
		assertEquals(5, f.devuelveCentral(9, 1, 5));
		
		
	}
	@Test
	
	void esBisiestoTest() {
		assertTrue(f.esBisiesto(1904), "Deberia ser verdadero");
		assertFalse(f.esBisiesto(2002), "Debería ser falso");
		assertFalse(f.esBisiesto(1900));
		assertThrows(ArithmeticException.class, 
				()->f.esBisiesto(1600));
		

		
	}
	
	

}

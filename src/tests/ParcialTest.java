package tests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;


import logica.Parcial;


public class ParcialTest {


	private Parcial parcial;
	 
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	
	@Test
	public void resultadoNormalTest() throws Exception {
		int resultado = this.parcial.potencia(2,7);
		assertEquals(128, resultado);
		assertTrue(resultado%1 == 0); // comprobar que es entero
	}
	
	@Test
	public void exponenteAltoTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.potencia(2,32));
	}
	
	@Test
	public void baseAltaTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.potencia(50000,2));
	}
	
	@Test
	public void exponenteNegativoTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.potencia(5,-3));
	}
	
	@Test
	public void ceroElevadoACeroTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.potencia(0,0));
	}
	
	
	@Test
	public void resultadoMuyGrandeTest() throws Exception {
		assertThrows(Exception.class, () -> this.parcial.potencia(4,29));
	}
	
	@Test
	public void limiteBaseTest() throws Exception {
		int resultado = this.parcial.potencia(46340,2);
		assertEquals(2147395600, resultado);
		assertTrue(resultado%1 == 0); // comprobar que es entero
	}
	
	@Test
	public void limiteExponenteTest() throws Exception {
		int resultado = this.parcial.potencia(2,30);
		assertEquals(1073741824, resultado);
		assertTrue(resultado%1 == 0); // comprobar que es entero
	}
}

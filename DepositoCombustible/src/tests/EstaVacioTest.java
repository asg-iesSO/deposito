package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.DepositoCombustible;

public class EstaVacioTest {

	@Test
	public void estaVacioTest() {
		double max, level;
		max = 100;
		level = 10;
		DepositoCombustible deposito = new DepositoCombustible(max, level);
		deposito.consumir(10);
		assertTrue(deposito.estaVacio());

	}

}

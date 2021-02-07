package tests;



import static org.junit.Assert.*;

import org.junit.Test;

import main.DepositoCombustible;

public class ConsumirTest {

	@Test
	public void fillTest() {
		double max, level;
		max = 100;
		level = 100;
		DepositoCombustible deposito = new DepositoCombustible(max, level);
		deposito.consumir(-10);
		deposito.consumir(10);
		deposito.consumir(-30);
		deposito.consumir(30);
		deposito.consumir(100);
		assertTrue(deposito.estaVacio());
	}

}

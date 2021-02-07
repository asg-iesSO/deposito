package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.DepositoCombustible;

public class FillTest {

	@Test
	public void fillTest() {
		double max, level;
		max = 100;
		level = 10;
		DepositoCombustible deposito = new DepositoCombustible(max, level);
		deposito.fill(-10);
		deposito.fill(100);
		deposito.fill(-30);
		deposito.fill(30);
		assertTrue(deposito.estaLleno());
	}

}

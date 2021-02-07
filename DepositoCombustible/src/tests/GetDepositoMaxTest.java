package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.DepositoCombustible;

public class GetDepositoMaxTest {

	@Test
	public void getDepositoMaxTest() {
		double max,level;
		max = 100;
		level =20;
		DepositoCombustible deposito = new DepositoCombustible(max,level);
		assertEquals(max, deposito.getDepositoMax(),0);
	}

}

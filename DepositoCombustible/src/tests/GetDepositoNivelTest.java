package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import main.DepositoCombustible;



class GetDepositoNivelTest {

	@Test
	void getDepositoNivelTest() {
		double max,level;
		max = 100;
		level =20;
		DepositoCombustible deposito = new DepositoCombustible(max,level);
		assertEquals(level, deposito.getDepositoNivel());
	}

}

package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import main.DepositoCombustible;



public class GetDepositoNivelTest {

	@Test
	public void getDepositoNivelTest() {
		double max,level;
		max = 100;
		level =20;
		DepositoCombustible deposito = new DepositoCombustible(max,level);
		assertEquals(level, deposito.getDepositoNivel(),0);
	}

}

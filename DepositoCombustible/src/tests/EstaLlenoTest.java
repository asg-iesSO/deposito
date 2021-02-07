package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import main.DepositoCombustible;

public class EstaLlenoTest {

	@Test
	public void estaLlenoTest() {
		double max, level;
		max = 100;
		level = 10;
		DepositoCombustible deposito = new DepositoCombustible(max, level);
		deposito.fill(90);
		assertTrue(deposito.estaLleno());
	}

}

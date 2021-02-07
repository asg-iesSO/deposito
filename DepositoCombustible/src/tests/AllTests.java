package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConsumirTest.class, EstaLlenoTest.class, EstaVacioTest.class, FillTest.class, GetDepositoMaxTest.class,
		GetDepositoNivelTest.class })
public class AllTests {

}

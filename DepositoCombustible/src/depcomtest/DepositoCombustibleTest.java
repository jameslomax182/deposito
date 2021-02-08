package depcomtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testDepositoCombustible() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepositoNivel() {
		double valorNivel=0;
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		valorNivel = tank.GetDepositoNivel();
		assertEquals(0,valorNivel,0.01);
	}

	@Test
	public void testGetDepositoMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaVacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		fail("Not yet implemented");
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}

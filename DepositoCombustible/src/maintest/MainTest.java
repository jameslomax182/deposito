package maintest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		// create the tank
        DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
        
        System.out.print("The tank with capacity " + tank.getDepositoMax() + " liters has been created. ");
        System.out.println(" Its initial fuel level is  " + tank.getDepositoNivel() + " liters.");
        }

}

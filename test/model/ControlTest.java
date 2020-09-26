package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import customException.EmptyDataException;

class ControlTest {

	private Control control;
	
	public void setup1() {
		control = new Control();
	}
	
	public void setup2() throws EmptyDataException {
		control = new Control();
		control.addClient("CC", "1006037746", "anderson", "cardenas", "3182870200", "calle 2 #6a50");
		control.addClient("CC", "1006023765", "rosa", "osorio", "3122765464", "calle 2 #2.45");
		control.addClient("CC", "1006893783", "oveimar", "otero", "31118746574", "cr 54-574");
		control.addClient("TI", "1005948292", "laura", "astaiza", "3456953939", "calle 34#4a40");
		control.addClient("TI", "1006053043", "angie", "rubio", "3122341254", "crr4 #5-34");
		
		control.addProduct("7564", "papa", "papa pa hacer la sopa", "456", "3232");
		control.addProduct("3455", "cebolla", "papa pa hacer la sopa", "456", "3232");
		control.addProduct("1435", "carne", "papa pa hacer la sopa", "456", "3232");
		control.addProduct("8545", "arroz", "papa pa hacer la sopa", "456", "3232");
	}
	@Test
	void test() throws EmptyDataException {
		setup1();
		control.addClient("CC", "2002949", "alfredo", "feo", "3182930312", "callle 23. 32-12");
	}

}

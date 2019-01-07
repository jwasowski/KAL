package kal.command.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchCommandTest {

	@Test
	public void test() {
		String test1 = null;
		String test2 = "1";
		int returnVal = checkSearchControlValues(test1,test2);
		assertEquals(1,returnVal);
	}
	private int checkSearchControlValues(String gun, String ammo) {
		if (gun != null && !gun.isEmpty() && !gun.equals("") && ("0").equals(gun)) {
			return 0;
		}
		if (ammo != null && !ammo.isEmpty() && ("1").equals(ammo)) {
			return 1;
		}
		return -1;
	}
}

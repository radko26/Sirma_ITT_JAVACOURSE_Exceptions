package com.sirma.itt.javacourse.objects.sumator;

import org.junit.Test;

public class SumatorTest {
	/**
	 * Tests if sum throws exceptions.
	 */
	@Test(expected = NumberFormatException.class)
	public void testSum() {
		Sumator tester = new Sumator();
		tester.sum("12", "2.1");
	}
}

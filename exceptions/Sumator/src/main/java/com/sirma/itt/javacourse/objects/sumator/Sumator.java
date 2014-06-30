package com.sirma.itt.javacourse.objects.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * For given 2 numbers it calculates their sum
 * 
 * @author Radoslav
 */

public class Sumator {

	/**
	 * Calculate the sum of two integers.
	 * 
	 * @param firstNumber
	 *            the first number
	 * @param secondNumber
	 *            the second number
	 * @return their sum
	 */
	public int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * Calculate the sum of two float numbers.
	 * 
	 * @param firstNumber
	 *            the first number
	 * @param secondNumber
	 *            the second number
	 * @return return the sum
	 */
	public float sum(float firstNumber, float secondNumber) {
		return firstNumber + secondNumber;
	}

	/**
	 * Sums two BigInteger objects.
	 * 
	 * @param firstNumber
	 *            BigInteger object
	 * @param secondNumber
	 *            BigInteger object
	 * @return String representation of the new BigInteger object in which we
	 *         keep the sum
	 */
	public String sum(BigInteger firstNumber, BigInteger secondNumber) {
		return firstNumber.add(secondNumber).toString();
	}

	/**
	 * Using built in BigDecimal class calculate the value.
	 * 
	 * @param firstNumber
	 *            the first number
	 * @param secondNumber
	 *            the second number
	 * @return the sum
	 */
	public String sum(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.add(secondNumber).toString();
	}

	/**
	 * Summing 2 string integer numbers, requires own implementation or making
	 * firstNumber BigInteger object with the string's value. Here we use the
	 * build in java.math.BigInteger.
	 * 
	 * @param firstNumber
	 *            number is passed in firstNumber string
	 * @param secondNumber
	 *            number is passed in firstNumber string
	 * @return the String representation of the BigInteger object
	 */
	public String sum(String firstNumber, String secondNumber)
			throws NumberFormatException {
		BigInteger firstNumberToInt = new BigInteger(firstNumber);
		BigInteger secondNumberToInt = new BigInteger(secondNumber);
		return firstNumberToInt.add(secondNumberToInt).toString();
	}
}
package com.jcg2016.junitguide;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculateTest {

	private int expected;
	private int first;
	private int second;

	public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
				{ 7, 3, 4 }, { 9, 4, 5 }, });
	}

	@Test
	public void sum() {
		Calculate add = new Calculate();
		System.out.println("Addition with parameters : " + first + " and "
				+ second);
		assertEquals(expected, add.sum(first, second));
	}
}

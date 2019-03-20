package com.bys.level2;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("The Answer is " + FibonacciFunc(5));

	}

	public static BigInteger FibonacciFunc(int n) {
		BigInteger result;
		BigInteger b1 = new BigInteger(String.valueOf(n));
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}
		result = FibonacciFunc(n - 1).multiply(b1);
		return result;
	}

}

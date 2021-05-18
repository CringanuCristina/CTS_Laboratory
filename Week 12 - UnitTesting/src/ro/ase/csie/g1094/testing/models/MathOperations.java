package ro.ase.csie.g1094.testing.models;

import ro.ase.csie.g1094.testing.exeptions.DivisionByZeroExeption;

public class MathOperations {

	public static int add(int a, int b) {
		return a+b;
	}
	public static double divide(int a, int b) throws DivisionByZeroExeption {
		if(b == 0) {
			throw new DivisionByZeroExeption();
		}
		return a/b;
	}
}

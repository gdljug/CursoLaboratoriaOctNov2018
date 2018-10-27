package org.laboratoria.clase3.functions;

import java.util.function.Function;

public class SumFunctionExample {

	public static Function<Integer, Integer> sum(final Integer x) { return y -> y + x; }

	public static Function <Integer, Integer> minus(final Integer x) { return y -> y - x; }
 
	
	public static void main(String[] args) {
		Integer one = 1;
		Integer oneplusone = sum(one).apply(one);
		System.out.println(oneplusone);
		Integer oneminuesone = minus(one).apply(one);
		System.out.println(oneminuesone);
	}
	
}

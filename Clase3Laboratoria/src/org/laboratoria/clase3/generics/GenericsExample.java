package org.laboratoria.clase3.generics;

import org.laboratoria.clase3.exceptions.TooLongRangeException;

public class GenericsExample {

	public static void main(String[] args) {
		RangedArray<Integer> intRArray = new RangedArray<Integer>(3);
		RangedArray<Float> floatRArray = new RangedArray<Float>(10);
		
		try {
			
			floatRArray.add(0.0f, 0);
			floatRArray.add(Float.NEGATIVE_INFINITY, 2);
			floatRArray.add(new Double(0.0).floatValue(), 8);
			
			System.out.println(floatRArray);
			
			intRArray.add(null, -1);
			intRArray.add(Integer.MIN_VALUE, 0);
			intRArray.add(Integer.MIN_VALUE + 1, 1);
			intRArray.add(Integer.MIN_VALUE - 2, 2);
			intRArray.add(Integer.MIN_VALUE + 3, 3);
			
			System.out.println(intRArray);
		
		} catch (TooLongRangeException e) {
//		} catch (ArrayIndexOutOfBoundsException|TooLongRangeException e) {
			e.printStackTrace();
		} 
	}
	
	
}

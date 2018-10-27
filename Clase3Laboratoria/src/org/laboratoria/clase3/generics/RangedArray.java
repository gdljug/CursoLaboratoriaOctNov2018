package org.laboratoria.clase3.generics;

import java.util.Arrays;

import org.laboratoria.clase3.exceptions.TooLongRangeException;

public class RangedArray <T>{
	
	private int higlimit = 10;
	
	private T[] innerArray;
	
	@SuppressWarnings("unchecked")
	public RangedArray(final int higlimit) {
		this.higlimit = higlimit;
		innerArray = (T[]) new Object[higlimit];
	}
	
	void add(final T object, final int position)
	{
		if (position > higlimit)
		{
			throw new TooLongRangeException();
		}
		innerArray[position] = object;
	}
	
	@Override
	public String toString() {
		return innerArray[0].getClass().getName() + ":" + Arrays.asList(innerArray).toString();
	}

}

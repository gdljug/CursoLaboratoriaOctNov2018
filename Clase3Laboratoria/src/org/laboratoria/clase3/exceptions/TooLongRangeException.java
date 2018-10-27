package org.laboratoria.clase3.exceptions;

public class TooLongRangeException extends IndexOutOfBoundsException {

	public TooLongRangeException() {
		super("Range was above expected range");
	}
	
	public TooLongRangeException(final int range, final int highlimit) {
		super("Range " + range + " was above the limit " + highlimit);
	}
}

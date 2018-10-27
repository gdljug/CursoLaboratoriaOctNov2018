package org.laboratoria.clase3.interfaces;

import java.util.Arrays;

public interface SoyInterfaz {
	
	final String DEFAULT_MESSAGE = "Parametros vacios";
	
	public void metodoNoRecibeNiRetornaNada();
	
	int metodoRecibeStringRegresaInt(final String string);
	
	abstract void quienImplementeSoyInterfazMeImplementaTambien(final boolean siono);
	
	default Object metodoRecibeMuchosStringRegresaObjeto(String... multiplesString) {
		if (multiplesString == null || multiplesString.length < 1)
		{
			return DEFAULT_MESSAGE;
		}
		return Arrays.asList(multiplesString).toString();
	}
	
	
	
}

package org.laboratoria.clase3.interfaces.impl;

import org.laboratoria.clase3.interfaces.SoyInterfaz;

public class SoyImplementacion implements SoyInterfaz {

	@Override
	public void metodoNoRecibeNiRetornaNada() {
		System.out.println("No hago nada!!");
	}

	@Override
	public int metodoRecibeStringRegresaInt(String string) {
		System.out.println("Retorno el tamaño del String como salida");
		return string.length();
	}
	
	
	@Override
	public void quienImplementeSoyInterfazMeImplementaTambien(boolean siono) {
		if (siono)
		{
			System.out.println("Fue un si");
		}
		else 
		{
			metodoNoRecibeNiRetornaNada();
		}
	}

	public static void main(String[] args) {
		SoyImplementacion impl = new SoyImplementacion();
		impl.metodoNoRecibeNiRetornaNada();
		System.out.println(impl.metodoRecibeStringRegresaInt("murcielago"));
		impl.quienImplementeSoyInterfazMeImplementaTambien(true);
		impl.quienImplementeSoyInterfazMeImplementaTambien(false);
		System.out.println(impl.metodoRecibeMuchosStringRegresaObjeto(new String[] {"Uno","Dos","Tres"}));
		System.out.println(impl.metodoRecibeMuchosStringRegresaObjeto(new String[]{}));
		System.out.println(impl.metodoRecibeMuchosStringRegresaObjeto((String [])null));
		SoyInterfaz claseAnonima = new SoyInterfaz() {
			
			@Override
			public void quienImplementeSoyInterfazMeImplementaTambien(boolean siono) {
				quienImplementeSoyInterfazMeImplementaTambien(siono);
				
			}
			
			@Override
			public int metodoRecibeStringRegresaInt(String string) {
				return metodoRecibeStringRegresaInt(string);
			}
			
			@Override
			public void metodoNoRecibeNiRetornaNada() {
				System.out.println("Yo si hago algo!!!");
				int i = 0;
				while (i < 100000) {
					i++;
				}
				System.out.println("Ya termine!!!");				
			}

			@Override
			public Object metodoRecibeMuchosStringRegresaObjeto(String... multiplesString) {
				return multiplesString;
			}
			
		};
		claseAnonima.metodoNoRecibeNiRetornaNada();
		System.out.println(claseAnonima.metodoRecibeMuchosStringRegresaObjeto(new String[] {"1","2","3"}));
		
		
	}

}

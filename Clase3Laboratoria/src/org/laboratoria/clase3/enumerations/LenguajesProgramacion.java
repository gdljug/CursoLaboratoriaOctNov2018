package org.laboratoria.clase3.enumerations;

public enum LenguajesProgramacion {
	
	JAVA(10.0),
	JAVASCRIPT(15.0),
	PYTHON(7.5);
	
	private final double porcentajeGithub;

	private LenguajesProgramacion(final Double popularityPercentage) {
		this.porcentajeGithub = popularityPercentage;
	}
	
	public static void main(String[] args) {
		
		if (JAVA.porcentajeGithub > JAVASCRIPT.porcentajeGithub)
		{
			System.out.println("Es más popular Java!!!");
		} else {
			System.out.println("Es mas popular Javascript :'(");
		}
		
		LenguajesProgramacion lenguaje = LenguajesProgramacion.valueOf("PYTHON");
		
		switch (lenguaje) {
		case JAVA:
			System.out.println("Opción Java");
			break;
		case JAVASCRIPT:
			System.out.println("Opción JavaScript");
			break;
		case PYTHON:
			System.out.println("Opción Pyhton");
			break;
		default:
			System.out.println("Java FTW!!!");
			break;
		}
		
//		LenguajesProgramacion go = LenguajesProgramacion.valueOf("GO");
		
	}
	
	
	
}

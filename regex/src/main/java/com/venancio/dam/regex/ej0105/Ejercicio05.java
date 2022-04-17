package com.venancio.dam.regex.ej0105;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio05 {
	// Programa para comprobar que las fechas introducidas son válidas, el formato
	// debe ser:
	// dd/mm/yyyy -> Y además debe dejar introducir los días y meses de una sola
	// cifra con
	// un 0 delante sin ser obligatorio el ponerlo, y además solo serán válidas las
	// fechas
	// comprendidas entre los años 1900 y 2099 ambos inclusive.

	private static Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");

	public static void main(String a[]) {
		System.out.println("Es '24/01/2000' una fecha válida? " + validarFecha("24/01/2000"));
		System.out.println("Es '03/45/3034' una fecha válida? " + validarFecha("03/45/3034"));
		System.out.println("Es '01/01/01' una fecha válida? " + validarFecha("01/01/01"));
		System.out.println("Es '7/4/2025' una fecha válida? " + validarFecha("7/4/2025"));
	}

	public static boolean validarFecha(String fecha) {

		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}
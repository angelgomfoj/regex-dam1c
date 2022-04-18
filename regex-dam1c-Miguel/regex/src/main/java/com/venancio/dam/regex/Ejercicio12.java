package com.venancio.dam.regex;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * En este ejercicio reconoceremos si la cadena introducida es de letras, numeros 
 * o ambos indicando si van primero letras o numeros, en caso de que haya varios intervalos de 
 * letras y numeros o no se cumpla ningun patron anterior se imprimira un mensaje personalizado y se devolvera
 * la cadena en la cual se habran sustituido
 * los digitos introducidos por nombre de colores. En caso normal se devolvera la cadena "EXITO!¨
 */
public class Ejercicio12 {
	private final static String patronNL = "^[0-9]+[a-zA-Z]+$";
	private final static String patronLN = "^[a-zA-Z]+[0-9]+$";
	private final static String patronN = "^[0-9]+$";
	private final static String patronL = "^[a-zA-Z]+$";
	
	//Si hicieramos A-z, pillariamos caracteres extras entre la a y la Z
	
	private static boolean esNu(String cadena) {
		if (cadena.matches(patronN)) {
			return true;
		}
		return false;
	}
	private static boolean esLe(String cadena) {
		if (cadena.matches(patronL)) {
			return true;
		}
		return false;
	}
	private static boolean esNuLe(String cadena) {
		if (cadena.matches(patronNL)) {
			return true;
		}
		return false;
	}
	private static boolean esLeNu(String cadena) {
		if (cadena.matches(patronLN)) {
			return true;
		}
		return false;
	}
	public static String queCadenaEs(String cadena) {
		if(esNu(cadena)){
			System.out.println("Es una composicion de Numeros");
		} else if(esNuLe(cadena)) {
			System.out.println("Es una composicion de Numeros seguida por Letras");
		} else if(esLe(cadena)){
			System.out.println("Es una composicion de Letras");
		} else if(esLeNu(cadena)) {
			System.out.println("Es una composicion de Letras seguida por Numeros");
		} else {
			System.out.println("Esta composicion no entra dentro de los paramentros establecidos");
			Pattern patronDeWhile = Pattern.compile(".*[0-9].*");
			Pattern patronDeCambio = Pattern.compile("[0-9]");
			Matcher mat = patronDeWhile.matcher(cadena);	
			while(mat.matches()) {
				mat = patronDeCambio.matcher(cadena);
				cadena=mat.replaceFirst(generaColor());
				mat = patronDeWhile.matcher(cadena);	
			}
			return cadena;
		}
		return "EXITO!";
	}
	
	private static String generaColor() {
		Random rd = new Random();
		switch (rd.nextInt(9)) {
		case 0:
			return "naranja-";
		case 1:
			return "amarillo-";
		case 2:
			return "marron-";
		case 3:
			return "colorado-";
		case 4:
			return "rojo-";
		case 5:
			return "magenta-";
		case 6:
			return "azul-";
		case 7:
			return "verde-";
		case 8:
			return "escarlata-";
		}
		return null;

	}
}

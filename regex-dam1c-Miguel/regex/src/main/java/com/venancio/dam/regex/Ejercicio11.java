package com.venancio.dam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio de sustitucion de ñ por nn, de vocales con tilde por un asterisco entre dos comillas y de numeros en cifra por letra, 
 * si van seguidos de otra letra entonces que lleven un guion entre medias
 */
public class Ejercicio11 {
	private static Pattern patron;
	private static Matcher mat;	
		    
	public static String cambiarElTexto(String textoAComprobar) {
		textoAComprobar=cambiarANn(textoAComprobar);
		textoAComprobar=cambiarTilde(textoAComprobar);
		textoAComprobar=cambiarNumero(textoAComprobar);
		return textoAComprobar;
	}
	
	private static String cambiarANn(String textoAComprobar) {
		patron = Pattern.compile("ñ");
		mat = patron.matcher(textoAComprobar);	
		return mat.replaceAll("nn");
	}
	private static String cambiarTilde(String textoAComprobar) {
		patron = Pattern.compile("á|í|ó|ú|é");
		mat = patron.matcher(textoAComprobar);	
		return mat.replaceAll("'*'");
	}
	private static String cambiarNumero(String textoAComprobar) {
		textoAComprobar=reCambioDeNumeros(patron, mat, "0", "cero", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "1", "uno", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "2", "dos", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "3", "tres", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "4", "cuatro", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "5", "cinco", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "6", "seis", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "7", "siete", textoAComprobar);
		textoAComprobar=reCambioDeNumeros(patron, mat, "8", "ocho", textoAComprobar);
		return reCambioDeNumeros(patron, mat, "9", "nueve", textoAComprobar);
	}
		private static String reCambioDeNumeros(Pattern patron, Matcher mat, String antes, String despues, String texto) {
			patron = Pattern.compile(antes);
			mat = patron.matcher(texto);
			texto=mat.replaceAll(despues+" ");
			
			patron = Pattern.compile(antes);
			mat = patron.matcher(texto);
			return mat.replaceAll(despues);
		}

}

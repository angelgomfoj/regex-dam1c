package com.venancio.dam.regex.ej0105;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio02 {
	// Programa para comprobar si en el texto se encuentra la palabra Python
	// mediante un patron
	// (Puede estar escrita en mayúsculas, minúsculas o ambas)
	// Si Python se encuentra en el texto, todas las 'a' minúsculas del texto
	// pasarán a mayúsculas.

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".*[Pp][Yy][Tt][Hh][Oo][Nn].*");
		String text = "Uno de los lenguajes de programación de más aceptación, según los distintos índices, es Python. Entre otras cosas, porque se emplea en sectores fuera de la programación como son la investigación científica y, especialmente, el análisis de datos.";

		Matcher matcher = pattern.matcher(text);

		boolean resultado = matcher.matches();

		if (resultado) {
			String newText = text.replaceAll("a", "A");
			System.out.println(newText);
		} else {
			System.out.println("La palabra python no se encontraba en el texto.");
		}

	}

}

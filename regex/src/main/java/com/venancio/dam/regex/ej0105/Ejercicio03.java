package com.venancio.dam.regex.ej0105;

public class Ejercicio03 {
	// Programa para eliminar todos los caracteres que no sean letras ni números de
	// un texto.

	public static void main(String[] args) {
		String text = "Importante: Como algunos “operadores” empiezan por “\\”, en Java no serían\r\n"
				+ "válidos porque podrían confundirse con otros caracteres especiales, como por ejemplo\r\n"
				+ "“\\n”. Para poder utilizarlos, habría que “escapar” la barra atrás, duplicándola: “\\\\”, de esta\r\n"
				+ "forma se indica que la primera barra va a escapar otro carácter, que sería otra barra\r\n"
				+ "atrás.";

		String newText = text.replaceAll("(?i)[^A-Z]", "");

		System.out.println(newText);

	}

}

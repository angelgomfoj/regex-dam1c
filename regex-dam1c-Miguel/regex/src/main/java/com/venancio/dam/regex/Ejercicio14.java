package com.venancio.dam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Detectar si en un String un caracter se repite mas de tres veces secuencialmente
 *En caso positivo imprimir el imprimir grupo encontrado diciendo el carácter repetido.
 */
public class Ejercicio14 {
	public static void comprobarTexto (String input) {
							//        | Cualquier caracter
							//        | | back-reference
							//		  | |				The backreference \1 (backslash one) references the first capturing group. 
							//		  |	|			\1 matches the exact same text that was matched by the first capturing group. 
							//        | |   | mas de 3
							//        | |   |     
		Pattern p = Pattern.compile("(.)\\1{3,}");
		// iterating test inputs
		    // matching
	    Matcher mat = p.matcher(input);
	    // 4+ repeated character found
	    if (mat.find()) {
	        System.out.printf("El input '%s' no es valido, el caracter '%s' se repite mas de 3 veces\n", input, mat.group(1));
	    } else {
	    	System.out.println("La cadena es perfectamente valida");
	    }
	}
}
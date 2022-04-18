package com.venancio.dam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Hacer un programa que pueda detectar si en un texto hay alguna palabra vuyos caracteres esten en orden alfabetico y que te pueda decir tambien
 *donde esta la palabra y cual es. Ej: dejo.
 */
public class Ejercicio15 {
	 
	
	public static boolean estaOrdenado(String cadena) {
		cadena = cadena.toLowerCase();
		String[] abec = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j=0;j<abec.length;j++) {
			String patronEnConstruccion = "(\\s|^)";
			for(int i=0;i<abec.length;i++) {
				if(i==j) {
					patronEnConstruccion += abec[i]+"+";
				} else 
					patronEnConstruccion += abec[i]+"*";
			}
			patronEnConstruccion += "(\\s|$)";
			System.out.println(patronEnConstruccion);
			Pattern patron = Pattern.compile(patronEnConstruccion);
			Matcher mat = patron.matcher(cadena);
			if(mat.find()) {
				System.out.println("Palabra: " + mat.group() + "  Pos ini: " + mat.start() + " Pos final: " +mat.end());
				return true;
			}
		}	
		return false;
	}
}

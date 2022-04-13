package com.venancio.dam.regex.ej10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio10 {
	
	public static final String[] TO_PASS = {"w3Unpocodet0d0", "w3Unpo<code>t0d0"};
	public static final String[] TO_FAIL = {"sdafasdf", "123456"};
	
	private Pattern passPattern;
	private Matcher matcher;
		
//	private final String PASS_PAT_DEFAULT = "^(?=\w*\d)(?=\w*[A-Z])(?=\w*[a-z])\S{8,16}$";
	
//	public Ejercicio10() {
//		this.passPattern = Pattern.compile(PASS_PAT_DEFAULT);
//	}
	
	public Ejercicio10(String passPattern) {
		this.passPattern = Pattern.compile(passPattern);
	}
	
	// Método para comprobar si el patrón introducido verifica las contraseñas correctamente
	public void passwordCheck() {
		System.out.println();
		System.out.println("¿Pasan la verificación?");
		System.out.println();
		
		// Comprobamos las que deberían ser válidas
		for (String string : Ejercicio10.TO_PASS) {
			System.out.print(string + " -> ");
			System.out.println(this.isValid(string)? "Sí": "No");
		}
		
		System.out.println();
		
		// Comprobamos las que NO deberían ser válidas
		for (String string : Ejercicio10.TO_FAIL) {
			System.out.print(string + " -> ");
			System.out.println(this.isValid(string)? "Sí": "No");
		}
	}
	
	// Método para comprobar si una contraseña es válida o no
	public boolean isValid(String strToCheck) {
		this.matcher = this.passPattern.matcher(strToCheck);
		
		if(this.matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para mostrar un array
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	// Getters y setters
	public Pattern getPassPattern() {
		return passPattern;
	}
	public void setPassPattern(Pattern passPattern) {
		this.passPattern = passPattern;
	}
	
	public Matcher getMatcher() {
		return matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
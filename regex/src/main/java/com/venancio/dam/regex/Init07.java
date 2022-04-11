package com.venancio.dam.regex;

import java.util.Scanner;

public class Init07 {
	
	public static void main(String[] args) {
		// Ejemplo de ejecución del ejercicio 7
		System.out.println("-----------------------------------\nEJERCICIO 07: Ejemplo de ejecución:\n-----------------------------------");
		
//		Ejercicio07 ej7 = new Ejercicio07();
//		ej7.isDniOrPassport();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número de documento que quiere comprobar: ");
		String doc = sc.nextLine();
		System.out.print("Por favor, introduzca ahora el patrón que le permita comprobar si se trata de un DNI o un pasaporte: ");
		String pat = sc.nextLine();
		
		Ejercicio07 ej7A = new Ejercicio07(doc, pat);
		ej7A.isDniOrPassport();
		
		sc.close();
		
	}

}
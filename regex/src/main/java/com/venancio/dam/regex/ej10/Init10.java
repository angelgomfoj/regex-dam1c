package com.venancio.dam.regex.ej10;

import java.util.Scanner;

public class Init10 {
	
	public static void main(String[] args) {
		
		// Ejemplo de ejecución del ejercicio 10
		System.out.println("-----------------------------------\nEJERCICIO 10: Ejemplo de ejecución:\n-----------------------------------");
		
		System.out.println("Contraseñas que han de pasar la verificación: ");
		Ejercicio10.printArray(Ejercicio10.TO_PASS);
		
		System.out.println();
		System.out.println("Contraseñas que NO han de pasar la verificación: ");
		Ejercicio10.printArray(Ejercicio10.TO_FAIL);
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el patrón que le permitirá comprobar si las contraseñas son válidas o no: ");
		String pat = sc.nextLine();
		sc.close();
		
//		Ejercicio10 ej10 = new Ejercicio10();
		Ejercicio10 ej10A = new Ejercicio10(pat);
		
//		ej10.passwordCheck();
		ej10A.passwordCheck();
		
	}

}
package com.venancio.dam.regex.ej08;

import java.util.Scanner;

public class Init08 {
	
	public static void main(String[] args) {
		// Ejemplo de ejecución del ejercicio 8
		System.out.println("-----------------------------------\nEJERCICIO 08: Ejemplo de ejecución:\n-----------------------------------");
		
//		Ejercicio08 ej8 = new Ejercicio08();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el patrón que le permitirá comprobar si se trata de una dirección de e-mail válida: ");
		String pat = sc.nextLine();
		
		Ejercicio08 ej8A = new Ejercicio08(pat);
		
		do {
			System.out.print("Por favor, introduzca el e-mail que quiere comprobar: ");
			ej8A.setToCheck(sc.nextLine());
			
			if(ej8A.isMail()) {
				System.out.println("La dirección introducida es una dirección de e-mail válida.");
			} else {
				System.out.println("No ha introducido una dirección de e-mail válida.");
			}
			
		} while(!ej8A.isMail());
		
		sc.close();
		
	}

}
package com.venancio.dam.regex;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		
		
		// Ejemplo de ejecución del ejercicio 6
		System.out.println("-----------------------------------\nEJERCICIO 06: Ejemplo de ejecución:\n-----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el patrón de separación de palabras: ");
		String pattern = sc.nextLine();

		System.out.print("Por favor, introduzca el número de repeticiones que ha de tener la palabra para que sea considerada término: ");
		int rep = Integer.valueOf(sc.nextLine());
		
//		System.out.println("Por favor, introduzca o pegue el texto del que quiere extraer la terminología: ");
//		StringBuilder text = new StringBuilder(sc.nextLine());
		
		sc.close();
		
		Ejercicio06 ej6 = new Ejercicio06(pattern);
//		Ejercicio06 ej6b = new Ejercicio06(text, pattern);
		
//		System.out.println(ej6.wordExtraction());
//		ej6.wordExtraction();
		ej6.termExtraction(rep);

	}
}
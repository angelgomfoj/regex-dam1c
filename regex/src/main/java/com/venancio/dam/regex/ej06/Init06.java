package com.venancio.dam.regex.ej06;

import java.util.Scanner;

public class Init06 {
	public static void main(String[] args) {
		
		
		// Ejemplo de ejecución del ejercicio 6
		System.out.println("-----------------------------------\nEJERCICIO 06: Ejemplo de ejecución:\n-----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el patrón de separación de palabras: ");
		String pattern = sc.nextLine();

		System.out.print("Por favor, introduzca el número mínimo de repeticiones que ha de tener la palabra para que sea considerada término: ");
		int min = Integer.valueOf(sc.nextLine());
		System.out.print("Por favor, introduzca el número máximo de repeticiones que ha de tener la palabra para que sea considerada término: ");
		int max = Integer.valueOf(sc.nextLine());
		
//		System.out.println("Por favor, introduzca o pegue el texto del que quiere extraer la terminología: ");
//		String text = sc.nextLine();
		
		sc.close();
		
//		Ejercicio06 ej6 = new Ejercicio06();
		Ejercicio06 ej6A = new Ejercicio06(pattern);
//		Ejercicio06 ej6B = new Ejercicio06(text, pattern);
		
//		ej6.termExtraction(3, 8);
		ej6A.termExtraction(min, max);

	}
}
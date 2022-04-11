package com.venancio.dam.regex;

import java.util.Map;
import java.util.Scanner;

public class Init {
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
		
//		Map<String, Integer> words = ej6.wordExtraction();
//		System.out.println(words);
		Map<String, Integer> wrds = ej6A.wordExtraction();
//		System.out.println(wrds);
		
//		ej6.termExtraction(words, 3, 8);
		ej6A.termExtraction(wrds, min, max);

	}
}
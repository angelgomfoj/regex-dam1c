package com.venancio.dam.regex.ej0105;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio01 {

	// Programa para comprobar si un número de teléfono móvil es válido y de España.
	// (Utilizaremos el prefijo español +34 como opcional)

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(?:(?:\\+|00)?34)?[67]\\d{8}$");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número de teléfono móvil español");
		String num = sc.nextLine();
		sc.close();
		Matcher matcher = pattern.matcher(num);

		boolean resultado = matcher.matches();

		String msg = resultado ? "El número introducido es válido." : "El número introducido NO es válido.";

		System.out.println(msg);
	}

}

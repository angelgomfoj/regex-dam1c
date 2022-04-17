package com.venancio.dam.regex.ej0105;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio04 {
	// Programa para comprobar que una ip contiene el número de dígitos correcto y
	// todos son números.

	public static void main(String a[]) {
		System.out.println("21.45.67.8 es una ip válida? " + Ejercicio04.comprobarIp("10.23.45.12"));
		System.out.println("34.pz.96.11 es una ip válida? " + Ejercicio04.comprobarIp("10.2a.56.32"));
		System.out.println("93.11.09 es una ip válida? " + Ejercicio04.comprobarIp("10.23.45"));
	}

	public static boolean comprobarIp(String ip) {

		Pattern pattern = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher matcher = pattern.matcher(ip);
		return matcher.find();
	}
}

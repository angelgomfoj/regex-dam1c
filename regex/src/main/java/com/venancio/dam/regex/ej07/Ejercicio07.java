package com.venancio.dam.regex.ej07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio07 {
	
	private String toCheck;
	private Pattern dniPattern;
	private Pattern passportPattern;
	private Pattern commonPattern;
	private Matcher matcher;
	
//	private final String TO_CHECK_DEFAULT = "65247921X REM697254";
//	private final String COMMON_PAT_DEFAULT = "([A-Z]{0,3})*[0-9]{6}([0-9]{2}[A-Z]{1})*";
//	private final String DNI_PAT_DEFAULT = "[0-9]{8}[A-Z]{1}";
//	private final String PASSPORT_PAT_DEFAULT = "[A-Z]{3}[0-9]{6}";
	
//	public Ejercicio07() {
//		this.toCheck = TO_CHECK_DEFAULT;
//		this.commonPattern = Pattern.compile(COMMON_PAT_DEFAULT);
//	}
	
	public Ejercicio07(String toCheck, String commonPattern) {
		this.toCheck = toCheck;
		this.commonPattern = Pattern.compile(commonPattern);
	}
	
	// Método para determinar si es un DNI o un pasaporte
	public void isDniOrPassport() {
		this.matcher = this.commonPattern.matcher(this.toCheck);
		
		Scanner sc = new Scanner(System.in);
		
		if(!matcher.matches()) {
			System.out.println("El número de documento que ha introducido no es un DNI ni un pasaporte.");
		} else {
			System.out.print("Ha introducido un DNI o pasaporte válido.\nPor favor, introduzca ahora el patrón para confirmar que se trata de un DNI: ");
			this.dniPattern = Pattern.compile(sc.nextLine() /* DNI_PAT_DEFAULT */);
			
			if(this.isDni(dniPattern)) {
				System.out.println("Confirmado: El número de documento introducido corresponde a un DNI.");
			} else {
				System.out.print("El número de documento introducido no es un DNI.\nPor favor, introduzca ahora el patrón para confirmar que se trata de un pasaporte: ");
				this.passportPattern = Pattern.compile(sc.nextLine() /* PASSPORT_PAT_DEFAULT */);
				
				System.out.println(this.isPassport(passportPattern)? "Confirmado: El número de documento introducido corresponde a un pasaporte." : "¡ERROR!");
			}
			
		}
		
		sc.close();

	}
	
	// Método para confirmar que es un DNI
	public boolean isDni(Pattern dniPattern) {
		this.matcher = dniPattern.matcher(this.toCheck);
		
		if(matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para confirmar que es un pasaporte
	public boolean isPassport(Pattern passportPattern) {
		this.matcher = passportPattern.matcher(this.toCheck);
		
		if(matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	// Getters y setters	
	public String getToCheck() {
		return toCheck;
	}
	public void setToCheck(String toCheck) {
		this.toCheck = toCheck;
	}

	public Pattern getDniPattern() {
		return dniPattern;
	}
	public void setDniPattern(String dniPattern) {
		this.dniPattern = Pattern.compile(dniPattern);
	}

	public Pattern getPassportPattern() {
		return passportPattern;
	}
	public void setPassportPattern(String passportPattern) {
		this.passportPattern = Pattern.compile(passportPattern);
	}

	public Pattern getCommonPattern() {
		return commonPattern;
	}
	public void setCommonPattern(String commonPattern) {
		this.commonPattern = Pattern.compile(commonPattern);
	}

	public Matcher getMatcher() {
		return matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
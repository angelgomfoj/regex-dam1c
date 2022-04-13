package com.venancio.dam.regex.ej08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {
	
	private String toCheck;
	private Pattern mailPattern;
	private Matcher matcher;
	
//	private final String MAIL_PAT_DEFAULT = "[^\s'\"@]+@[A-Za-z[0-9].-]+\.[A-Za-z]{2,}";
	
//	public Ejercicio08() {
//		this.mailPattern = Pattern.compile(MAIL_PAT_DEFAULT);
//	}
	
	public Ejercicio08(String mailPattern) {
		this.mailPattern = Pattern.compile(mailPattern);
	}
	
	public boolean isMail() {
		this.matcher = this.mailPattern.matcher(this.toCheck);
		
		if(this.matcher.matches()) {
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
	
	public Pattern getMailPattern() {
		return mailPattern;
	}
	public void setMailPattern(Pattern mailPattern) {
		this.mailPattern = mailPattern;
	}
	
}
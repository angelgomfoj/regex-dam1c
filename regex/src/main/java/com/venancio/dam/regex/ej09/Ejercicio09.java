package com.venancio.dam.regex.ej09;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio09 {
	
	private String toSwitch;
	private Pattern lastNamePattern;
	private Pattern namePattern;
	private Matcher matcher;

	private final String TO_SWITCH_DEFAULT = "Gómez Foj, Ángel\nMartín Soriano, Jennifer\nVizán Ramos, Miguel\n";
	private final String LAST_NAME_PATTERN = "([A-Z].*\s)?[A-Z].*,\s";
	private final String NAME_PATTERN = "(Ángel|Jennifer|Miguel)";
	
	public Ejercicio09() {
		this.toSwitch = TO_SWITCH_DEFAULT;
		this.lastNamePattern = Pattern.compile(LAST_NAME_PATTERN);
		this.namePattern = Pattern.compile(NAME_PATTERN);
	}
	
	public StringBuilder swithcOrder() {
		List<String> sortingList = new ArrayList<>();
		
		this.matcher = namePattern.matcher(toSwitch);
		matcher.find();
		for (int i = 0; i < 2; i++) {
			
			while(matcher.find() && i == 0) {
				sortingList.add(matcher.group());
				
			}
			
			this.matcher = lastNamePattern.matcher(toSwitch);
			int j = 0;
			while(matcher.find() && i == 1) {
				sortingList.add(j, matcher.group());
				j += 2;
			}

		}
		
		StringBuilder switched = new StringBuilder();
		
		for (String string : sortingList) {
			switched.append(string);
		}
		
		return switched;
		
	}
	
	// Getters y setters
	public String getToCheck() {
		return toSwitch;
	}
	public void setToCheck(String toCheck) {
		this.toSwitch = toCheck;
	}

	public Pattern getLastNamePattern() {
		return lastNamePattern;
	}
	public void setLastNamePattern(String lastNamePattern) {
		this.lastNamePattern = Pattern.compile(lastNamePattern);
	}
	
	public Pattern getNamePattern() {
		return namePattern;
	}
	public void setNamePattern(String namePattern) {
		this.namePattern = Pattern.compile(namePattern);
	}

	public Matcher getMatcher() {
		return matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
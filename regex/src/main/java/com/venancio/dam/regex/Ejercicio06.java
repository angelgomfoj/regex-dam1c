package com.venancio.dam.regex;

import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Ejercicio06 {
	
	private StringBuilder sciText;
	private Pattern pattern;
	private Map<String, Integer> wordList;
	
	public Ejercicio06(String pat) {
		this.sciText = new StringBuilder("texto de prueba, prueba, texto");
		this.pattern = Pattern.compile(pat);
		this.wordList = new HashMap<>();
	}
	
	public Ejercicio06(StringBuilder input, String pat) {
		this.sciText = input;
		this.pattern = Pattern.compile(pat);
		this.wordList = new HashMap<>();
	}
	
	// Método para extraer todas las palabras del texto usando el patrón especificado e incluiras en el mapa
	public Map<String, Integer> wordExtraction() {
		
		// Creamos un array con absolutamente todas las palabras del texto
		String[] wordByWord = this.pattern.split(sciText);
		
		/* Utilizamos el HashMap para contar las ocurrencias de cada palabra:		
		Para ello recorremos el array con todas las palabras del texto y las vamos incluyendo en el mapa
		de modo que la clave sea la palabra (String) como tal y el valor un entero (Integer) que iremos
		incrementando a medida que se vaya repitiendo en el texto. */
	    for(String word : wordByWord){
	        if(!wordList.containsKey(word)){
	            wordList.put(word, 1);
	        }else{
	            wordList.put(word, wordList.get(word)+1);
	        }
	    }
	    
	    return wordList;
	}
	
	/* Método que, tras determinar e indicarle cuántas veces se ha de repetir una palabra para considerarla
	término, extrae únicamente las palabras que aparecen en el texto más veces del número especificado */
	public void termExtraction(int numOfTimes) {
		
		// Mediante un iterator, eliminamos del mapa las palabras con menos repeticiones de las indicadas
		if(wordList.isEmpty()) {
			System.out.println("ATENCIÓN: Aún no se ha extraído ninguna palabra del texto.\nPor favor, asegúrese de extraer todas las palabras del texto antes de realizar la extracción de la terminología.");
		} else {
			for(Iterator<Map.Entry<String, Integer>> it = wordList.entrySet().iterator(); it.hasNext();) {
				Map.Entry<String, Integer> word = it.next();
				if(word.getValue() < numOfTimes) {
					it.remove();
				}
			}
			
//			// ¡¡¡NO FUNCIONA!!!
//			for (Map.Entry<String, Integer> word : wordList.entrySet()) {
//				if(!wordList.isEmpty()) {
//					if(Integer.valueOf(word.getValue()) < numOfTimes) {
//						wordList.remove(word.getKey());
//					}
//				}			
//			}
			
			// Mostramos la lista de términos
			if(wordList.isEmpty()) {
				System.out.println("ATENCIÓN: El texto no contiene ninguna palabra con el número mínimo de repeticiones especificado.");
			} else {
				System.out.println("\nTérmino:\tRepeticiones:");
				wordList.forEach((word, times) -> {
					System.out.println(word + "\t\t" + times);
				});
				
//				// Otra opción
//				for (Map.Entry<String, Integer> word : wordList.entrySet()) {
//					System.out.print(word.getKey() + " se repite " + word.getValue() + " veces.");
//				}
			}
					
		}
		
	}
	
	// Getters y setters
	public StringBuilder getSciText() {
		return sciText;
	}
	public void setSciText(StringBuilder newText) {
		this.sciText = newText;
	}

	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = Pattern.compile(pattern);
	}

	public Map<String, Integer> getWordList() {
		return wordList;
	}
	public void setWordList(Map<String, Integer> wordList) {
		this.wordList = wordList;
	}

}
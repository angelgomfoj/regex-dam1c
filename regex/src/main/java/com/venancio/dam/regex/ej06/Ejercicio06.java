package com.venancio.dam.regex.ej06;

import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Ejercicio06 {
	
	private String sciText;
	private Pattern pattern;
	private Map<String, Integer> wordList;
	
	private final String DEFAULT_SCI_TEXT = "2.1.1. Origen y funcionamiento de CRISPR-Cas.\r\n"
			+ "\r\n"
			+ "Como se ha especificado previamente, el sistema CRISPR es propio de las bacterias. Estos organismos lo utilizan como un sistema de defensa adaptativo frente a material genético (ADN) procedente del exterior, generalmente de virus bacteriófagos (un tipo de virus que infectan exclusivamente a las bacterias). Cuando este ADN exógeno entra en el interior de la bacteria, estas guardan una copia del mismo dentro de su propio genoma, como una forma de memoria de infecciones pasadas. Este ADN exógeno se integra en una región muy concreta del cromosoma bacteriano llamada locus CRISPR, el cual está formado por repeticiones cortas de ADN parcialmente palindrómico, alternadas con secuencias variables o espaciadores (Barrangou y Marraffini, 2014), de ahí su nombre (CRISPR, de Clustered Regularly Interspaced Short Palindromic Repeats). Dichas secuencias espaciadoras se corresponden con la copia del material genético que el virus bacteriófago introdujo en la bacteria. Cuando se produce una infección (introducción de ADN exógeno) por un virus del que ya existe información en el locus CRISPR (es decir, que ya infectó a la bacteria en el pasado), el sistema CRISPR actúa. Se producirán moléculas genéticas de ARN (una molécula que también alberga información, similar al ADN) usando como molde las secuencias espaciadoras del locus CRISPR (Zhao et al., 2014), que eran precisamente las copias del ADN del virus bacteriófago que la bacteria había guardado. Estas moléculas de ARN, guiarán a otras moléculas diferentes, las endonucleasas Cas (acrónimo de CRISPR-associated), hacia el ADN exógeno que el virus bacteriófago ha introducido, donde serán capaces de reconocer la secuencia genética igual a la que había en el locus CRISPR de la bacteria, a partir de la que fueron generadas. El complejo formado por la molécula de ARN y la endonucleasa Cas se unirá a esta secuencia y entonces actuará esta última, cuyo cometido será cortar la molécula de ADN (Mojica y Montoliu, 2016). De este modo, las bacterias consiguen destruir el material genético invasor, pues al cortar la molécula de ADN, la inutilizan.\r\n"
			+ "\r\n"
			+ "Gracias a las progresivas y constantes investigaciones llevadas a cabo por diferentes grupos de trabajo, se pudo dar con el funcionamiento de este sistema (detallado en el párrafo anterior) que permitió deducir que podría ser útil como instrumento de ayuda para modificar genes. Sin embargo, para poder utilizar CRISPRCas como una herramienta de edición génica, es necesario realizar algunas alteraciones en los elementos naturales que conforman el sistema bacteriano. Primeramente, existen tres tipos de sistemas CRISPR-Cas, cuyo funcionamiento, pese a ser en base el mismo, difiere en algunos puntos. El tipo de sistema CRISPR-Cas más utilizado como herramienta de edición génica es el tipo II, puesto que es a dicho grupo al que pertenece la endonucleasa más usada para este fin: la endonucleasa Cas9 (así pues, el sistema se denomina CRISPR-Cas9). Cuando actúa en las bacterias como estrategia defensiva, Cas9 necesita que haya dos moléculas de ARN unidas para guiarla hasta el ADN exógeno del virus bacteriófago y poder finalmente sesgarlo (Jiang y Doudna, 2015).\r\n"
			+ "Para poder utilizar CRISPR-Cas9 como herramienta de edición génica, se ha de diseñar una única molécula de ARN guía, planteada como equivalente a la pareja de moléculas de ARN existente en los sistemas naturales de tipo II (Doudna y Charpentier, 2014).\r\n"
			+ "\r\n"
			+ "Por último, el resultado final de la acción de CRISPR-Cas sobre el ADN es un corte en su estructura. Queda de manifiesto, por tanto, que CRISPR-Cas modifica el genoma en tanto que genera un punto de ruptura, pero como para las células es inviable que la integridad del ADN esté comprometida, tienen mecanismos para reparar tal corte. Es decir, no basta solo con cortar el ADN; para que un gen esté propiamente modificado, y dicha modificación sea patente, el corte que el sistema CRISPR-Cas realiza debe ser reparado. Básicamente, la célula cuenta con dos estrategias diferentes para cumplir con esta tarea (ver figura 1):\r\n"
			+ "\r\n"
			+ "• una en la que, a partir de un molde de ADN, se realiza una copia de dicho molde en el hueco generado (Escribano-Díaz et al., 2013),\r\n"
			+ "\r\n"
			+ "• y otra en la que, ante la inexistencia de este molde genético, se insertan aleatoriamente nucleótidos (los elementos básicos de los que se compone el ADN), para rellenar el corte (Davis y Chen, 2013).\r\n"
			+ "\r\n"
			+ "Aunque en cada una de estas dos estrategias interviene un considerable número de diversos factores, la diferencia más importante es el resultado final de la reparación del corte.\r\n"
			+ "\r\n"
			+ "• En la primera estrategia, la información del gen en el que CRISPR-Cas ha producido el corte ha sido reemplazada por la información genética contenida en el molde de ADN a partir del cual la célula ha realizado la reparación.\r\n"
			+ "\r\n"
			+ "• En la segunda, en cambio, la secuencia que ha cortado CRISPR-Cas ha sido reparada mediante una inserción aleatoria de nucleótidos, lo que significa que se\r\n"
			+ "ha sustituido por una combinación carente de información genética, por lo que el gen ha quedado inactivado.\r\n"
			+ "\r\n"
			+ "Esto es, en la primera estrategia el gen es reemplazado por otro (con una función diferente al original) y en la segunda estrategia el gen es inactivado (porque no se sustituye por ningún otro gen, sino por una combinación aleatoria de nucleótidos).\r\n"
			+ "\r\n"
			+ "Sabiendo esto, a la hora de plantear el procedimiento para modificar un gen concreto mediante el uso de CRISPR-Cas9, es preciso conocer la secuencia de nucleótidos del gen a modificar para así diseñar correctamente la molécula de ARN que guiará el corte que Cas9 realice (Brazelton et al., 2015). Además, si lo que se pretende es sustituir un gen por otro, se debe aportar también el molde de ADN con la información correspondiente al gen a incluir (Song y Stieger, 2017).\r\n"
			+ "\r\n"
			+ "Figura 1. Esquema del funcionamiento de las principales estrategias celulares de reparación de un corte en el ADN. Elaboración propia. Se ponen de manifiesto las principales diferencias entre ambas estrategias y su resultado final, reemplazamiento del gen o alelo en un caso e inactivación del mismo en el otro.\r\n"
			+ "\r\n"
			+ "1 Siglas para ácido desoxirribonucleico, una macromolécula biológica formada por una doble cadena de nucleótidos apareados.\r\n"
			+ "2 Siglas para ácido ribonucleico, una macromolécula biológica formada por nucleótidos que, en la mayoría de los casos, se encuentra en forma de cadena sencilla, es decir, con los nucleótidos sin aparear.\r\n"
			+ "3 Una endonucleasa es una proteína capaz de reconocer una secuencia concreta de nucleótidos en una molécula de ADN y cortar dicha molécula en el mismo punto de reconocimiento.\r\n"
			+ "4 En realidad lo habitual no es reemplazar un gen por otro, sino reemplazar alelos. Se denominan alelos a todas aquellas posibles formas o variantes que puede tomar un mismo gen. Es decir, el gen sigue siendo el mismo pero cambia de variante, lo que conlleva, en la mayoría de las ocasiones, un cambio también de función. Para comprenderlo mejor, tomando un ejemplo mendeliano, el gen que regula el color de los guisantes puede tomar el alelo «A», y entonces el guisante será amarillo, o el alelo «a», y en cambio el guisante será verde; pero el gen «color» sigue siendo el mismo, por mucho que cambie su alelo.";
//	private final String DEFAULT_PATTERN = "[\s|.|,|:|;|(|)|[|]|{|}|¿|?|¡|!|\r\n]\s*";
	
//	public Ejercicio06() {
//		this.sciText = DEFAULT_SCI_TEXT;
//		this.pattern = Pattern.compile(DEFAULT_PATTERN);
//		this.wordList = new HashMap<>();
//	}
	
	public Ejercicio06(String pat) {
		this.sciText = DEFAULT_SCI_TEXT;
		this.pattern = Pattern.compile(pat);
		this.wordList = new HashMap<>();
	}
	
	public Ejercicio06(String input, String pat) {
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
	    for (String word : wordByWord){
	    	word = word.toLowerCase();
	        if(!wordList.containsKey(word) && word != ""){
	            wordList.put(word, 1);
	        } else if(word != "") {
	            wordList.put(word, wordList.get(word)+1);
	        }
	    }
	    
	    return wordList;
	}
	
	/* Método que, tras determinar e indicarle el rango de cuántas veces se ha de repetir una palabra para
	considerarla término, extrae únicamente las palabras que aparecen en el texto un número de veces dentro
	de rango especificado */
	public void termExtraction(int minTimes, int maxTimes) {
		
		this.wordExtraction();
		
		// Mediante un iterator, eliminamos del mapa las palabras con menos repeticiones de las indicadas
		if(wordList.isEmpty()) {
			System.out.println("ATENCIÓN: Aún no se ha extraído ninguna palabra del texto.\nPor favor, asegúrese de extraer todas las palabras del texto antes de realizar la extracción de la terminología.");
		} else {
			for(Iterator<Map.Entry<String, Integer>> it = wordList.entrySet().iterator(); it.hasNext(); ) {
				Map.Entry<String, Integer> word = it.next();
				if(word.getValue() < minTimes || word.getValue() > maxTimes) {
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
//					System.out.println(word.getKey() + "\t\t" + word.getValue());
//				}
			}
					
		}
		
	}
	
	// Getters y setters
	public String getSciText() {
		return sciText;
	}
	public void setSciText(String newText) {
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
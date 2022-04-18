package com.venancio.dam.regex;

import java.util.Scanner;

public class Init11a15 {
	public static void main(String[] args) {
			//Scanner para input reader
			Scanner sc = new Scanner(System.in);
			//Selector de opciones
			int opt;
			do {
				System.out.println("Menú: "
						+ "\n\t11 -  11: "
						+ "\n\t12 -  12: "
						+ "\n\t13 -  13: "
						+ "\n\t14 -  14: "
						+ "\n\t15 -  15: "
						+ "\n\t-1 - Salir: ");
				opt = sc.nextInt();
				switch (opt) {
				case 11:	
					System.out.println("__________________________________________________\n"
							+ "\nEjemplo de ejecucion del ejercicio 11\n"
							+ "__________________________________________________\n");
					Ejercicio11ej();
					break;
				case 12:	
					System.out.println("__________________________________________________\n"
							+ "\nEjemplo de ejecucion del ejercicio 12\n"
							+ "__________________________________________________\n");
					Ejercicio12ej();
					break;
				case 13:	
					System.out.println("__________________________________________________\n"
							+ "\nEjemplo de ejecucion del ejercicio 13\n"
							+ "__________________________________________________\n");
					Ejercicio13ej();
					break;
				case 14:	
					System.out.println("__________________________________________________\n"
							+ "\nEjemplo de ejecucion del ejercicio 14\n"
							+ "__________________________________________________\n");
					Ejercicio14ej();
					break;
				case 15:	
					System.out.println("__________________________________________________\n"
							+ "\nEjemplo de ejecucion del ejercicio 15\n"
							+ "__________________________________________________\n");
					Ejercicio15ej();
					break;
				case -1:	//Salir
					System.out.println("Adios!");
					break;
				default:	//No has introducido datos correctamente
					System.out.println("No ha introducido el numero correctamente."
							+ "\n------------------------------------------------------");
					break;
				}
			}while(opt!=-1);
			sc.close();
		}
		private static void Ejercicio11ej() {
			System.out.println(Ejercicio11.cambiarElTexto("Diccionario terminológico de ciencias médicas, 12ª edición. Salvat Editores (eds.), S.A. 1984."
					+ "Harrison: Principios de Medicina Interna, 14ª Edición. McGraw-Hill Interamericana de España 1998."
					+ "Farreras-Rozman: Medicina Interna, 14ª Edición. Ediciones Harcourt S.A. 2000."
					+ "Catálogo de Especialidades Farmacéuticas. Consejo General de Colegios Oficiales de Farmacéuticos de España, Madrid 2003."
					+ "Vademécum Internacional Medicom. Medimedia-Medicom, S.A. Madrid 2003."
					+ "Alberca Serrano R. et alii (et al.). Demencias: diagnóstico y tratamiento. Masson S.A., Barcelona 1998."
					+ "Martínez Lage JM, Martínez-Lage Álvarez P. Concepto, criterios diagnósticos y visión general de las demencias. En: Manual de demencias. López-Pousa S, Villalta J, Llinás J (eds.). Prous Science, Barcelona 1996."
					+ "Martínez Lage JM, Láinez Andrés JM. El Alzheimer: teoría y práctica. Aula médica ediciones, Madrid 2000."
					+ "Agüera Ortiz, L.F: Demencia, una aproximación práctica, 1ª edición. Masson, S.A. 1998."
					+ "Young PA, Young PH. Neuroanatomía clínica funcional. Masson - Williams&Wilkins, Barcelona 1997."
					+ "López-Pousa S, Vilalta Franch J, Llinàs Reglà J (eds.). Manual de Demencias, 2ª Edición. Prous Science, Barcelona 2001."
					+ "Hachinski VC, Lassen NA, Marshall J. Multi-infarct dementia: a cause of mental deterioration in the elderly. Lancet 1974;2:207-210."
					+ "Reisberg B, Ferris SH, de León MJ, Crook T. The global deterioration scale for assessment of primary degenerative dementia. American Journal of Psychiatry 1982;139:1136-1139."
					+ "Pfeiffer, E. A short portable mental status questionnaire for the assessment of organic brain deficit in elderly patients. Journal of the American Geriatric Society 1975;23:433-441."));
		}
		
		private static void Ejercicio12ej() {
			Ejercicio12.queCadenaEs("Hola1234");
			Ejercicio12.queCadenaEs("1234adios");
			Ejercicio12.queCadenaEs("1234");
			Ejercicio12.queCadenaEs("adios");
			System.out.println("\t" + Ejercicio12.queCadenaEs("1234quetal1234"));
			System.out.println("\t" + Ejercicio12.queCadenaEs("Hola1234adios"));
			Ejercicio12.queCadenaEs("");
		}
		
		private static void Ejercicio13ej() {
			Ejercicio13 ej13 = new Ejercicio13();
			ej13.paisDelProducto("5901234123457");
			ej13.paisDelProducto("8411234123457");
			ej13.paisDelProducto("0000000000000");
		}
		
		private static void Ejercicio14ej() {
			Ejercicio14.comprobarTexto("Hola como va todo??");
			Ejercicio14.comprobarTexto("Hola quue tall????????");
			Ejercicio14.comprobarTexto("heyyyy");
			Ejercicio14.comprobarTexto("hey que taaaaal estamooooos");
		}
		
		private static void Ejercicio15ej() {
			System.out.println(Ejercicio15.estaOrdenado("dejo")? "Hay una palabra que va hacia abajo con el sentido del abecedario":"No hay una palabra que vaya hacia abajo con el sentido del abecedario");
			System.out.println(Ejercicio15.estaOrdenado("Lo dejo todo roto una vez mas")? "Hay una palabra que va hacia abajo con el sentido del abecedario":"No hay una palabra que vaya hacia abajo con el sentido del abecedario");
			System.out.println(Ejercicio15.estaOrdenado("Quizas")? "Hay una palabra que va hacia abajo con el sentido del abecedario":"No hay una palabra que vaya hacia abajo con el sentido del abecedario");
		}

		}
		

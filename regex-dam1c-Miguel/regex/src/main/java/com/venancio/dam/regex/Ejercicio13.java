package com.venancio.dam.regex;
import java.util.*;
/**
 *
 *En este ejercicio vamos a analizar segun el codigo de barras el pais al que pertenece el producto
 *y diremos si esta bien introducido.
 *Un codigo de barras se compone de varios numeros, en total 13 digitos:
 *Los 3 primeros para el pais, los 4 siguientes para la empresa, los 5 siguientes para el producto
 *como tal y el ultimo para verificar que esta bien.
 */
public class Ejercicio13 {
	Map<Integer, String> codigos;
	private String patron;


	public Ejercicio13() {
		asignarMapa();
		asignarPatron();
	}
	
	public Map<Integer, String> getCodigos() {
		return codigos;
	}
	
	public void setCodigos(Map<Integer, String> codigos) {
		this.codigos = codigos;
	}
	
	public String getPatron() {
		return patron;
	}
	
	public void setPatron(String patron) {
		this.patron = patron;
	}
	
	private void addIntToMap(int min, int max, String text) {
		while(min<=max) {
			this.codigos.put(min, text);
			min++;
		}
	}
	private void asignarPatron() {
		StringBuilder sb = new StringBuilder("^((");
		Iterator<Integer> it = codigos.keySet().iterator();
		while(it.hasNext()) {
			Integer clave = it.next();
			//En caso de que sea menor de 3 digitos se añade los 0 a la izqd con estos if
			if(clave<10)
				sb.append("00"+clave+"");
			else if(clave<100)
				sb.append("0"+clave.toString().substring(0,1)+clave.toString().substring(1,2)+"");
			else
				sb.append(clave.toString().substring(0,1)+clave.toString().substring(1,2)+clave.toString().substring(2,3));
			if(it.hasNext())
				sb.append("|");
		}
		sb.append(")[0-9]{10})$");
		this.patron = sb.toString();
	}
	
	private void asignarMapa() {
		//Los paises que tienen varios numeros seran introducidos con el metodo
		//addIntToMap
		this.codigos = new HashMap<Integer, String>(){{
			//Recordemos primero el texto, luego el numero
			put(380,"GS1 Bulgaria");
			put(383,"GS1 Slovenija");
			put(385,"GS1 Croacia");
			put(387,"GS1 BIH (Bosnia-Herzegovina)");
			put(389,"GS1 Montenegro");
			put(470,"GS1 Kirguistán");
			put(471,"GS1 Taiwán");
			put(474,"GS1 Estonia");
			put(475,"GS1 Letonia");
			put(476,"GS1 Azerbaiyán");
			put(477,"GS1 Lituania");
			put(478,"GS1 Uzbekistán");
			put(479,"GS1 Sri Lanka");
			put(480,"GS1 Filipinas");
			put(481,"GS1 Bielorrusia");
			put(482,"GS1 Ucrania");
			put(483,"GS1 Turkmenistán");
			put(484,"GS1 Moldavia");
			put(485,"GS1 Armenia");
			put(486,"GS1 Georgia");
			put(487,"GS1 Kazajstán");
			put(488,"GS1 Tayikistán");
			put(489,"GS1 Hong Kong");
			put(528,"GS1 Líbano");
			put(529,"GS1 Chipre");
			put(530,"GS1 Albania");
			put(531,"GS1 Macedonia");
			put(535,"GS1 Malta");
			put(539,"GS1 Irlanda");
			put(560,"GS1 Portugal");
			put(569,"GS1 Islandia ");
			put(590,"GS1 Polonia");
			put(594,"GS1 Rumania");
			put(599,"GS1 Hungría");
			put(603,"GS1 Ghana");
			put(604,"GS1 Senegal");
			put(608,"GS1 Bahrein");
			put(609,"GS1 Mauricio");
			put(611,"GS1 Marruecos");
			put(613,"GS1 Argelia");
			put(615,"GS1 Nigeria");
			put(616,"GS1 Kenia");
			put(618,"GS1 Costa de Marfil");
			put(619,"GS1 Túnez");
			put(620,"GS1 Tanzania");
			put(621,"GS1 Siria");
			put(622,"GS1 Egipto");
			put(623,"GS1 Brunei");
			put(624,"GS1 Libia");
			put(625,"GS1 Jordan");
			put(626,"GS1 Irán");
			put(627,"GS1 Kuwait");
			put(628,"GS1 Arabia Saudita");
			put(629,"GS1 Emiratos");
			put(729,"GS1 Israel");
			put(740,"GS1 Guatemala");
			put(741,"GS1 El Salvador");
			put(742,"GS1 Honduras");
			put(743,"GS1 Nicaragua");
			put(744,"GS1 Costa Rica");
			put(745,"GS1 Panamá");
			put(746,"GS1 Republica Dominicana");
			put(750,"GS1 México");
			put(759,"GS1 Venezuela");
			put(773,"GS1 Uruguay");
			put(775,"GS1 Perú");
			put(777,"GS1 Bolivia");
			put(780,"GS1 Chile");
			put(784,"GS1 Paraguay");
			put(786,"GS1 Ecuador");
			put(850,"GS1 Cuba");
			put(858,"GS1 Eslovaquia");
			put(859,"GS1 Checa");
			put(860,"GS1 Serbia");
			put(865,"GS1 Mongolia");
			put(867,"GS1 Corea del Norte");
			put(880,"GS1 Corea del Sur");
			put(884,"GS1 Camboya");
			put(885,"GS1 Tailandia");
			put(888,"GS1 Singapur");
			put(890,"GS1 India");
			put(893,"GS1 Vietnam");
			put(896,"GS1 Pakistán");
			put(899,"GS1 Indonesia");
			put(950,"Oficina Global GS1");
			put(955,"GS1 Malasia");
			put(958,"GS1 Macau");
		}};
		addIntToMap(1, 19, "GS1 US");
		addIntToMap(30, 39, "GS1 US");
		addIntToMap(60, 139, "GS1 US");
		addIntToMap(300, 379, "GS1 Francia");
		addIntToMap(400, 440, "GS1 Alemania");
		addIntToMap(450, 459, "GS1 Japón");
		addIntToMap(490, 499, "GS1 Japón");
		addIntToMap(460, 469, "GS1 Rusia");
		addIntToMap(500, 509, "GS1 UK");
		addIntToMap(520, 521, "Asociación GS1 Grecia");
		addIntToMap(540, 549, "GS1 Bélgica y Luxemburgo");
		addIntToMap(570, 579, "GS1 Dinamarca");
		addIntToMap(600, 601, "GS1 Sudáfrica");
		addIntToMap(640, 649, "GS1 Finlandia");
		addIntToMap(690, 699, "GS1 China");
		addIntToMap(700, 709, "GS1 Noruega");
		addIntToMap(730, 739, "GS1 Suecia");
		addIntToMap(754, 755, "GS1 Canadá");
		addIntToMap(760, 769, "GS1 Schweiz, Suisse, Svizzera");
		addIntToMap(770, 771, "GS1 Colombia");
		addIntToMap(778, 779, "GS1 Argentina");
		addIntToMap(789, 790, "GS1 Brasil");
		addIntToMap(800, 839, "GS1 Italia");
		addIntToMap(840, 849, "GS1 España");
		addIntToMap(868, 869, "GS1 Turquía");
		addIntToMap(870, 879, "GS1 Países Bajos");
		addIntToMap(900, 919, "GS1 Austria");
		addIntToMap(930, 939, "GS1 Australia");
		addIntToMap(940, 949, "GS1 Nueva Zelanda");
		addIntToMap(960, 969, "Oficina Mundial (GTIN-8s)");
	}
	public void recorrerElMapa() {
		Iterator<Integer> it = codigos.keySet().iterator();
		while(it.hasNext()) {
			Integer clave = it.next();
		    System.out.println("Clave: " + clave + ", Pais: " + codigos.get(clave));
		}
	}
	private String sacarPaisPorClave(String cadena) {
		int clave = (Integer.valueOf(cadena.substring(0, 3)));
		return codigos.get(clave);
	}
	public boolean esCorrecto(String cadena) {
		if(cadena.matches(this.patron)) {
			return true;
		}
		return false;
	}
	public void paisDelProducto(String cadena) {
		if(!esCorrecto(cadena))
			System.out.println("El numero introducido es erroneo, "
					+ "recuerde que debe ir con los 0 delante si es menor a 10 o a 100");
		else {
			System.out.println("El pais al que pertenece tal codigo es: " + sacarPaisPorClave(cadena));
		}
	}
}

/**
 	01 – 019
 	030 – 039
 	060 – 139
	300 – 379
 	380
 	383
 	385
 	387
 	389
 	400 – 440
 	450 – 459 y 490 – 499
 	460 – 469
 	470
 	471
 	474
 	475
 	476
 	477
 	478
 	479
 	480
 	481
 	482
 	483
 	484
 	485
 	486
 	487
 	488
 	489
 	500 – 509
 	520 – 521
 	528
 	529
 	530
 	531
 	535
 	539
 	540 – 549
 	560
	569
 	570 – 579
 	590
 	594
 	599
 	600 – 601
 	603
 	604
 	608
 	609
 	611
 	613
 	615
 	616
 	618
 	619
 	620
 	621
 	622
 	623
 	624
 	625
 	626
 	627
 	628
 	629
 	640 – 649
 	690 – 699
 	700 – 709
 	729
 	730 – 739
 	740
	741
 	742
 	743
 	744
 	745
 	746
 	750
 	754 – 755
 	759
 	760 – 769
 	770 – 771
 	773
 	775
 	777
 	778 – 779
 	780
 	784
 	786
 	789 – 790
 	800 – 839
 	840 – 849
 	850
 	858
 	859
 	860
 	865
 	867
 	868 – 869
 	870 – 879
 	880
 	884
 	885
 	888
 	890
 	893
 	896
 	899
 	900 – 919
 	930 – 939
 	940 – 949
 	950
 	955
 	958
 	960-969
*/
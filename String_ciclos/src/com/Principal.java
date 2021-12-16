package com;

public class Principal {

	public static void main(String[] args) {
		String cadena = "Hoy es 15 de diciembre de 2021";
		System.out.println(cadena.charAt(15));
		System.out.println(cadena.length());
		System.out.println(cadena.substring(2,30));//Este metodo es polimorfico ya que es el mismo metodo
		//pero se comporta distinto de acuerdo a los parametros
		System.out.println(cadena.substring(2));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.equals("Hoy es 15 de diciembre de 2021"));
		System.out.println(cadena.compareTo("Hoy es 15 de diciembre de 2021"));
		
		int x = 5;
		
		do {
			System.out.println("Iprime al menos una vez");
			System.out.println("Valor de x: " + x);
			x--;
		}while(x<0);
		
		String vocales = "";
		String consonantes = "";

//Del string actual, analizar cuales son vocales y cuales son consonantes
		//Hoy es 15 de diciembre de 2021
	/*	
		String auxVocal = "";
		String auxConsonante = "";
		
		
		for(int i = 0; i<cadena.length(); i++) {
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='A')
				//caracteresVocales[i] = 'a';
				auxVocal += String.valueOf(cadena.charAt(i));
			else if(cadena.charAt(i)=='e' || cadena.charAt(i)=='E')
				//caracteresVocales[i] = 'e';
				auxVocal += String.valueOf(cadena.charAt(i));
			else if(cadena.charAt(i)=='i' || cadena.charAt(i)=='I')
				//caracteresVocales[i] = 'i';
				auxVocal += String.valueOf(cadena.charAt(i));
			else if(cadena.charAt(i)=='o' || cadena.charAt(i)=='O')
				//caracteresVocales[i] = 'o';
				auxVocal += String.valueOf(cadena.charAt(i));
			else if(cadena.charAt(i)=='u' || cadena.charAt(i)=='U')
				//caracteresVocales[i] = 'u';
				auxVocal += String.valueOf(cadena.charAt(i));
			else if(cadena.charAt(i) == ' ')
				continue;
			else if(Character.isDigit(cadena.charAt(i)))
				continue;
			else 
				//caracteresConsonantes[i] = cadena.charAt(i);
				auxConsonante += String.valueOf(cadena.charAt(i));
		}
		

		
		System.out.println("vocales: " + auxVocal);
		System.out.println("consonantes: " + auxConsonante);
		

		*/
		
		for(int i=0; i<cadena.length(); i++) {
			if(Character.toString(cadena.charAt(i)).equals("a") || 
				Character.toString(cadena.charAt(i)).equals("e") ||
				Character.toString(cadena.charAt(i)).equals("i") ||
				Character.toString(cadena.charAt(i)).equals("o") ||
				Character.toString(cadena.charAt(i)).equals("u")) {
				vocales += Character.toString(cadena.charAt(i));
			}
			else {
				try {
					Integer.parseInt(Character.toString(cadena.charAt(i)));
				}
				catch(Exception ex) {
					
					consonantes += Character.toString(cadena.charAt(i));
				}
			}
		}
		System.out.println(vocales);
		System.out.println(consonantes);
		
		
		
	}
	

}

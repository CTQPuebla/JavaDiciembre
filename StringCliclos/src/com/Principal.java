package com;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {

		//String cadena = "Hoy es 15 de diciembre de 2021";
		
		/*
		//.length() tamaño
		System.out.println(cadena.length());
		
		//charAt
		System.out.println(cadena.charAt(15));
		
		//subString(int index)
		System.out.println(cadena.substring(10)); //muestra a partir del indice que se indica
		
		//substring(int strindex, int endindex)
		System.out.println(cadena.substring(10, 15)); //polimorfico
		
		//toLowerCase
		System.out.println(cadena.toLowerCase());
		
		//toUpperCase
		System.out.println(cadena.toUpperCase());
		
		//equals(Objerct o);
		System.out.println(cadena.equals("hola")); //compara Strings
		
		//compareTo(String s);
		System.out.println(cadena.compareTo("Hoy"));
		
		*/
		
		//CICLOS ----------------------------------
		//ESTRUTURAS DE CONTROL QUE PERMITEN REPETIR SENTENCIAS 
		
		
		//variable de control
		//condicion a evaluar
		//cambio de variable
		//DEFINIDO
		
		/*for(int i=0; i < 20; i++) {
			System.out.println("foo" +  i);
			
		}
		for(int i=20; i > 0; i--) {
			System.out.println("foo2" +  i);
			
		}
		
		
		//CICLO WHILE INDEFINIDO
		int x = 0;
		
		while(x<=30) {
			System.out.println("ok"+ x);
			
			x++;
		}
		*/
		
		//CICLO DO WHILE
		//S realiza la logica programada al menos una vez
		//Se cumpla o no la condicion
		
		
		//int x = 10;
		//do {
		//	System.out.println("hola al menos una vez");
		//	System.out.println("valor de x="+ x);
		//	x--;
		//}while(x>0);
		
		//EJERCICIO 1 ----------------------------------------------------------------------
		//Del string actual, analizar cuales son vocales y
		//cuales son constantes 
		//SALIDA =  
		//VOCALES = AEIOU, aeiou y 
		//CONSONANTES
		
		//INTENTO
		
		//int longitud= cadena.length();
		//String vocales=" ";
		//String consonantes=" ";
		
		/*for(int i =0; i< longitud; i++){		
			char caracter = cadena.toUpperCase().charAt(i);
			if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' ) {
				//--vocales = vocales + Character.toString(caracter.charAt(i));--
			}else if(caracter == ' ') {
				System.out.println(" "+ caracter);
			}else {
				
			}	
		}
		
		System.out.println("VOCAL "+ caracter);
		System.out.println("CONSONANTE "+ caracter);
		*/
		
		
		//FUNCIONA 
		/*
		String cadena = "Hoy es 15 de diciembre de 2021";
		String vocales=" ";
		String consonantes=" ";
		
		
		for(int i =0; i< cadena.length(); i++) {
			//char caracter = cadena.toUpperCase().charAt(i);
			if(Character.toString(cadena.charAt(i)).equals("a") 
					|| Character.toString(cadena.charAt(i)).equals("e") 
					|| Character.toString(cadena.charAt(i)).equals("i")
					|| Character.toString(cadena.charAt(i)).equals("o") 
					|| Character.toString(cadena.charAt(i)).equals("u")) {
				vocales = vocales + Character.toString(cadena.charAt(i));
			}else {
				try {
					Integer.parseInt(Character.toString(cadena.charAt(i)));
				}catch(Exception e) {
					consonantes = consonantes + Character.toString(cadena.charAt(i));	
				}
			}
		}
		System.out.println("Cadena: "+ cadena);
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + consonantes);
		-----------------------------------------------------------------------------*/
		
		//EJERCICIO 2
		//do  -  while 
		//LEER DE TECLADO numeros para que lo sume y haga promedio con las veces que se ingreso el numero
		//hacerlo hasta que llegue el tope de 24
		
	
		double numero;
		double resultado;
		int veces = 0;
		double suma= 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Ingrese un numero:");
			numero = s.nextInt();
			veces++;
			System.out.println("Numero de veces que has ingresado numeros : " + veces ); // veces
			suma= suma + numero;
			System.out.println("La suma de tus numeros es : " + suma ); // veces
			resultado= suma / veces;
			System.out.println("El promedio de la suma y de las veces que ingresaste numeros"+ resultado);
			System.out.println("Este programa se detendra hasta que el resultado sea mayor a 24");
		}while(resultado<24);
		
		
		
		
		

			
		
		
		
		
		
		
	}

}

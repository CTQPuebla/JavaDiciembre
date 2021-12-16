package com;

public class Principal {

	public static void main(String[] args) {
		//.length() tamaño 
		//System.out.println(cadena.length());
		//charAt
		
		//System.out.println(cadena.charAt(29));
		//substring (int index)
		//System.out.println(cadena.substring(10));
		//substring(int strindex, int endindex
		//System.out.println(cadena.substring(10, 15));
		//toLowerCase() convierte m
		//System.out.println(cadena.toLowerCase());
		//toUpperCase() convierte M
		//System.out.println(cadena.toUpperCase());
		//equals()
		//System.out.println(cadena.equals("2021"));
		//compareTo
		
		//Ciclos
		//variable de control
		//condicion
		//cambio de variable
		//for (int i = 0; i < 20; i++) {
		//	System.out.println("foo " + i);
		//}
		//for (int i = 20; i > 0; i--) {
		//	System.out.println("foo " + i);
		//}
		
		//while
		//evalua condicion en el inicio
		//while(x < 30) {
		//	System.out.println("ok " + x);
		//	x++;
		//}
		//do while
		//realiza la logica programada al menos una vez
		//se cumpla o no la condicion
		
		//do {
			//System.out.println("hola al menos una vez");
			//System.out.println("valor x: " + x);
			//x--;
			
		//}while(x>0);
		
		
		
		//Hoy es 15 de diciembre de 2021
		String cadena = "Hoy es 15 de diciembre de 2021";
		String vocales = "";
		String consonantes = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			//System.out.println(cadena.charAt(i));
			
			if(Character.toString(cadena.charAt(i)).equals("a")
					|| Character.toString(cadena.charAt(i)).equals("e")
					|| Character.toString(cadena.charAt(i)).equals("i")
					|| Character.toString(cadena.charAt(i)).equals("o")
					|| Character.toString(cadena.charAt(i)).equals("u"))
			{
				vocales = vocales + Character.toString(cadena.charAt(i));		
			}
			else {
				try {
					 Integer.parseInt(Character.toString(cadena.charAt(i)));
				}
				catch(Exception ex){
					consonantes = consonantes + Character.toString(cadena.charAt(i));
				}			
			}		
		}
		System.out.println(cadena);
		System.out.println("vocales: " + vocales);
		System.out.println("consonantes: " + consonantes);
	}
}

package com;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadena = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres");
		cadena = scanner.nextLine();
		
		StringBuffer nuevaCadena = new StringBuffer();
		for(int x = 0; x < cadena.length(); x++) {
			if(Character.isUpperCase(cadena.charAt(x))) {
				nuevaCadena.append("+" + Character.toLowerCase(cadena.charAt(x)));
				System.out.println("Es mayuscula : "+ "\n" + cadena.charAt(x)); 
			}
			else {
				nuevaCadena.append(cadena.charAt(x));
				System.out.println("Es minuscula: " + "\n" + cadena.charAt(x) );
			}
			
		}
	}

}

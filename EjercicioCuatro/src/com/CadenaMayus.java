package com;

import java.util.Scanner;

public class CadenaMayus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nombre = "";
		
		System.out.println("Ingresa tu nombre: ");
		nombre = scanner.nextLine();
		scanner.close();
		
		StringBuffer cadena = new StringBuffer();
		for(int x = 0; x < nombre.length(); x ++) {
			if(Character.isUpperCase(nombre.charAt(x))) {
				cadena.append("+" + Character.toLowerCase(nombre.charAt(x)));
				System.out.println("Mayuscula: " + nombre.charAt(x));
			}
			else {
				cadena.append(nombre.charAt(x));
				System.out.println("Minuscula: " + nombre.charAt(x));
			}
		}
	}

}

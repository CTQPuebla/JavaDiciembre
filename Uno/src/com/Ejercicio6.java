package com;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.print("Ingresa una linea de texto para comprobar si tiene alguna letra mayuscula: ");
		String s = S.nextLine();
		int i = 0;
		for (i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				System.out.println("El texto contiene una mayuscula");
				break;
			}			
		}
		if(i==s.length())
			System.out.println("el texto no contuvo ninguna mayuscula");
	}
}

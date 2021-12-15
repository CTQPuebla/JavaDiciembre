package com;
import java.util.Scanner;

public class ManipulacionDeCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String nombre = "Gilberto";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor:  ");
        String nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es:  " + nombre);
		
		System.out.println("Tu nombre tiene:  " + nombre.length() + " letras." );
		
		System.out.println("La primera letra de: " + nombre + " es la: " + nombre.charAt(0));
				
		int ultima_letra;
		
		ultima_letra = nombre.length();
	
		System.out.println("Y la última letra es la:  " + nombre.charAt(ultima_letra-1));
	}

}

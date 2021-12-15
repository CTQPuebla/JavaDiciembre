package com;

import java.util.Scanner;

public class AceptacionSolicitud {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		String sexo;
		int nota;
		int edad;
		
		System.out.println("ingresa sexo: (M o F) ");
		sexo = scanner.nextLine();
		System.out.println("ingresa nota:");
		nota = scanner.nextInt();
		System.out.println("ingresa edad:");
		edad = scanner.nextInt();
		scanner.close();
		
		if(!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
			System.out.println("Valor sexo incorrecto");
		}
		else if((nota > 5 && nota < 10) && (edad > 18 && edad < 30) && (sexo.toUpperCase().equals("M"))){
			System.out.println("Es POSIBLE");	
		}
		else if((nota > 5 && nota < 10 ) && (edad > 18 && edad < 30) && (sexo.toUpperCase().equals("F"))) {
			System.out.println("Es ACEPTADA");
		}
		else {
			System.out.println("NO ACEPTADA");
		}
	}

}

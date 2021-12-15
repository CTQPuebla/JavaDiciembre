package com;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		int anio;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Asigna un año: ");
		anio = scanner.nextInt();
		scanner.close();
		
		if((anio % 4 == 0) && ((anio % 100 !=0) || (anio % 400 == 0))) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
	}
}
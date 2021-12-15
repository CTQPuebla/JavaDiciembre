package com;

import java.util.Scanner;

public class Rdivision {

	public static void main(String[] args) {
		// Evaluar el numero Dos si es 0 mandar error
		Scanner scanner = new Scanner(System.in);
		double numeroUno;
		double numeroDos;
		
		System.out.println("Ingresa primer valor: ");
		numeroUno = scanner.nextInt();
		System.out.println("Ingresa segundo valor: ");
		numeroDos = scanner.nextInt();
		scanner.close();

		if(numeroDos == 0) {
			System.out.println("No se puede evaluar");
		}
		else {
			System.out.println("El valor es: " + numeroDos / numeroUno);
		}
	}

}

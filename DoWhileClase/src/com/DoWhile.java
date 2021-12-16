package com;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int acumulador = 0;
		int suma = 0;
		double promedio = 0;
		
		do {
			System.out.println("Ingresa un numero: ");
			numero = scanner.nextInt();
			scanner.close();
			suma = suma + numero;
			acumulador++;
			promedio = suma/acumulador;
		}while(promedio<30);
		System.out.println("promedio: " + promedio);
	}
}

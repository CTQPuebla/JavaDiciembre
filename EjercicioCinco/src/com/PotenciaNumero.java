package com;
import java.util.Scanner;

public class PotenciaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingresa un valor: ");
		int numero = scanner.nextInt();
		System.out.println("ingresa un exponente: ");
		int potencia = scanner.nextInt();
		scanner.close();
		
		if(numero < 0 ) {
			double resultado = Exponente((numero*-1) , potencia);
			System.out.println("Exponente negativo devuelto a: " + resultado);
		}
		else if(potencia == 0) {
			double resultado = Exponente(numero, potencia);
			System.out.println("0 devuelto a: " + resultado);
		}
		else {
			double resultado = Exponente(numero, potencia);
			System.out.println("Exponente positivo: " + resultado);
		}
	}
	static double Exponente(int numero, int potencia) {
		return Math.pow(numero, potencia);
	}
}

package com;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double promedio = 0;
		double valor = 0;
		int numeros = 0;
		do {
			if(promedio==0)
				System.out.print("Ingresa un numero para hacer el promedio: ");
			else
				System.out.print("Vuelve a ingresar un numero: ");
			valor += sc.nextDouble();
			numeros++;
			promedio = valor/numeros;
			System.out.println("Cantidad de numeros ingresados: " +numeros);
			System.out.println("Promedio actual: " + promedio);
		}while (promedio < 25);
		System.out.println("El promedio de los numeros fue mayor a tu edad");
	}
}

package com;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Teclee la base del numero: ");
		Double a = S.nextDouble();
		System.out.print("Teclee el exponente del numero: ");
		Double b = S.nextDouble();
		
		System.out.println("La potencia del numero es: " + Math.pow(a,b) );
	}
}

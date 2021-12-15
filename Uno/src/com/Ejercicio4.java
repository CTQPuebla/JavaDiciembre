package com;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Teclea el primer numero de la división");
		Double a = S.nextDouble();
		System.out.println("Teclea el segundo numero de la división");
		Double b = S.nextDouble();
		if (b==0)
			System.out.println("Error: el segundo numero no puede ser cero");
		else 
			System.out.println("la division es: " + a/b);
		
	}

}


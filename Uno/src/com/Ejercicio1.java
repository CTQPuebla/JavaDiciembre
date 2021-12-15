package com;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.print("teclaea el primer numero: ");
		Double a = S.nextDouble();
		System.out.print("teclea el segundo numero: ");
		Double b = S.nextDouble();
		
		if(a>b)
			System.out.println("el primer numero es mayor");
		else if (a<b)
			System.out.println("el segundo numero es mayor");
		else 
			System.out.println("ambos numero son iguales");
	}
}

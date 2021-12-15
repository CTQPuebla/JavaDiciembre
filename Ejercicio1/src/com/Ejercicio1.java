package com;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int x;
		int y;
		System.out.println("Ingrese un valor a x tipo entero");
		x = scanner.nextInt();
		System.out.println("Ingrese un valor a y tipo entero");
		y = scanner.nextInt();
		
		if(x>y){
			System.out.println("x es mayor");
		}
		else if(x == y) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("y es mayor");
		}
	}

}

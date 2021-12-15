package com;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		int x;
		int y;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese valor a x: ");
		x = scanner.nextInt();
		System.out.println("Ingrese valor a y que va ser el exponencial");
		y = scanner.nextInt();
		
		if(x<0) {
			double resultado = Math.abs(Potencia (x, y));
			System.out.println(x + " ^ " + y +" = " + resultado);
		}
		else {
			double resultado = Potencia (x, y);
			System.out.println(x + " ^ " + y +" = " + resultado);
		}
		
		/*if(y<0){
			System.out.println("No puede ser negativo");
		}
		else {
		System.out.println("El resultado es: " + Potencia(x, y));
		}*/
	}	
	static double Potencia(int x, int y) {
		return Math.pow(x, y);
		
		/*if(y == 0) {
			return 1;
		}
		else if(x < 0) {
			return (x * -1) * Potencia(x, y -1);
		}
		else {
			return x * Potencia(x, y -1);
		}*/
	}

}

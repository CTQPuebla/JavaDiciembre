package com;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int anio;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el a�o que desees: ");
		anio = scanner.nextInt();
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) 
		{
            System.out.println("El a�o " + anio + " es bisiesto");
        } else {
            System.out.println("El a�o " + anio + " no es bisiesto");
            
        }
	}

}

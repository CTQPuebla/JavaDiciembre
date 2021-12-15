package com;

import java.util.Scanner;

public class EscuelaViaje {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alumnos;
		double total;
		
		System.out.println("cuantos alumnos viajaran: ");
		alumnos = scanner.nextInt();
		scanner.close();
		
		if(alumnos >= 100) {
			total = alumnos * 65;
			System.out.println("total más de 100 alumnos es: " + total);
		}
		else {
			if(alumnos >= 50  && alumnos <= 99) {
				total = alumnos * 75;
				System.out.println("Total entre 55 y 99 alumnos es: " + total);
			}
			else if(alumnos >= 30 && alumnos <= 49){
				total = alumnos * 95;
				System.out.println("Total entre 30 y 49 alumnos es: " + total);
			}
			else if(alumnos < 30 && alumnos == 1 ) {
				total = 4000;
				System.out.println("Renta del autobus es: " + total);
			}
			else if(alumnos <= 0) {
				System.out.println("No hay alumnos para viajar");
			}
		}
		
	}

}

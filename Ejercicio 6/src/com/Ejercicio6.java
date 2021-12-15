package com;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int edad, nota;
		String sexo;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pon sexo M(masculino) o F(femenino)");
		sexo = scanner.nextLine();
		System.out.println("Ingrese edad: ");
		edad = scanner.nextInt();
		System.out.println("Ingrese nota: ");
		nota = scanner.nextInt();
		
		
		
		if(!sexo.toUpperCase().equals("M") || !sexo.toUpperCase().equals("F")) {
			System.out.println("Solo puede ser M y F");
		}
		else if(nota > 5 && sexo.toUpperCase().equals("M") && edad > 18) {
			System.out.println("Es posible");
		}
		else if(nota > 5 && sexo.toUpperCase().equals("F") && edad > 18) {
			System.out.println("Es aceptada");
		}
		else {
			System.out.println("No es aceptada");
		}
	}	
}



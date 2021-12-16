package com;

import java.util.Scanner;

public class EjercicioArreglo {

	public static void main(String[] args) {
		/*String[] vocales = new String[5];
		vocales[0] = "a";
		vocales[1] = "e";
		vocales[2] = "i";
		vocales[3] = "o";
		vocales[4] = "u";
		
		vocales[5] = "io";
		
		System.out.println(vocales);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numeros quieres almacenar?");
		int tamano = sc.nextInt();
		int[] numeros = new int [tamano];
		
		String almacenador = "";
		for (int i = 0; i < tamano; i++) {
			System.out.print("Introduce el numero "+(i+1)+": ");
			numeros[i] = sc.nextInt();
			//System.out.println(numeros[i] % 3);
			if(numeros[i] % 3 == 0)
				almacenador +=String.valueOf(numeros[i])+",";
		}
		//System.out.println(almacenador);
		String[] resultadoString = almacenador.split(",");
		int[] resultadoEntero = new int[resultadoString.length];
		
		for (int i = 0; i<resultadoString.length; i++) {
			resultadoEntero[i] = Integer.parseInt(resultadoString[i]);
			System.out.println(resultadoEntero[i]);
		}
		
		
		
	}

}

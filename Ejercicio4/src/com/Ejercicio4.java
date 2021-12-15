package com;
import java.util.*;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		String palabra;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite una cadena de texto");
		palabra = s.nextLine();
		
		//System.out.println(palabra);
		
		if(palabra == palabra.toLowerCase()) {
			System.out.println("Esta en minuscula");
		}else {  //else if(palabra == palabra.toUpperCase())
			System.out.println("Esta en mayuscula");
		}  //else { System.out.println("Es una cadena de texto mixta");  }
	}

}

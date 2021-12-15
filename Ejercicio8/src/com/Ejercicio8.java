package com;
import java.util.*;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		int lado1;
		int lado2;
		int lado3;
		boolean rectangulo = false; 


		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite el valor del primer lado del triangulo");
		lado1 = s.nextInt();
		System.out.println("Digite el valor del segundo lado del triangulo");
		lado2 = s.nextInt();
		System.out.println("Digite el valor del tercer lado del triangulo");
		lado3 = s.nextInt();
		
			//triangulo rectangulo si cumple con el teorema de Pitagoras(se halla primero la
			//hipotenusa), se comprueba el lado más largo se comprueba Pitagoras
		
			if (lado1 > lado2 && lado1 > lado3) {
		      if ((Math.pow(lado1,2)) == (Math.pow(lado2,2)) + (Math.pow(lado3,2))) {
		        rectangulo = true;
		      } 
		    } else if (lado2 > lado1 && lado2 > lado3) {
		      if ((Math.pow(lado2,2)) == (Math.pow(lado1,2)) + (Math.pow(lado3,2))) {
		        rectangulo = true;
		      } 
		    } else if (lado3 > lado1 && lado3 > lado2) {
		      if ((Math.pow(lado3,2)) == (Math.pow(lado1,2)) + (Math.pow(lado2,2))) {
		        rectangulo = true;
		      } 
		    }

		    // Dos lados iguales 
		    if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
		      if (rectangulo) {
		        System.out.println("Es un triángulo rectángulo e isósceles.");
		      } else {
		        System.out.println("Es un triángulo isósceles.");
		      }
		      
		    // Tres lados iguales
		    }else if (lado1 == lado2 && lado2== lado3) {
		      if (rectangulo) {
		        System.out.println("Es un triángulo rectángulo y equilátero.");
		      } else {
		        System.out.println("Es un triángulo equilátero.");
		      }
		    }else {
		      if (rectangulo) {
		        System.out.println("Es un triángulo rectángulo y escaleno.");
		      } else {
		        System.out.println("Es un triángulo escaleno.");
		      }
		    }
		    
	}

}

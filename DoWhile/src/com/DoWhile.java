package com;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		int num; 
		double tfinal, suma = 0;
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		
		
		do {

			System.out.println("Pon numero: ");
			num = scanner.nextInt();		
			x ++;
			suma = suma + num ;
			tfinal = suma/x;

						
			
		}while(tfinal < 27);
		
		System.out.println("Promedio: " + tfinal);
	}

}

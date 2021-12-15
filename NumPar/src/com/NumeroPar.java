package com;
import java.util.Scanner;
public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner entrada = new Scanner(System.in);
		
		        
        System.out.println("Introduce un número por favor, para determinar si es par o impar:  ");
        int numero = entrada.nextInt(); 
        
                
	        if (numero % 2 == 0)
	        	     	
	        {
	        	System.out.printf( "ES PAR" );
	        }
	        else {
	        	System.out.printf( "ES IMPAR" );
	}
	}
       
}

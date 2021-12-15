package com;
import java.util.Scanner;

public class PotenciaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Scanner entrada = new Scanner(System.in);
		        
        System.out.println("Introduce un número por favor:  ");
        double numero = entrada.nextInt(); 
        
        System.out.println("Introduce un número por favor, el cual será la potencia:  ");
        double numero2 = entrada.nextInt(); 
        
        if(numero <0 ) {
        	double elevado = Math.abs(Math.pow(numero,numero2));
            System.out.println(numero + " ^ " + numero2 + " : " +(elevado));
        }
        else if (numero2 == 0){
        	System.out.println("El resultado es :  1");
        }
        
        else {
        	double elevado = Math.pow(numero,numero2);
            System.out.println(numero + " ^ " + numero2 + " : " +(elevado));
            
        }
        
        
        
        
        
        
        

	}

}

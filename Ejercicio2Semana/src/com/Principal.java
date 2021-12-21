package com;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		String  color, marca, nombreMarca;
		int modelo, numModelo;
		int numcelulares;
		boolean salir = false;
		int opcion;
		
		System.out.println("INVENTARIO CELULARES");		
		System.out.println("¿Cuántos celulares desea ingresar?");
		numcelulares = s.nextInt();
		Celular[] celulares = new Celular[numcelulares];
		//System.out.println("El numero de celulares a registrar son "+numcelulares);
			
		for(int i = 0; i< numcelulares; i++) {
			celulares[i] = new Celular();
			System.out.println("Digite el modelo del celular " + (i+1));
			modelo = s.nextInt(); s.nextLine();
			celulares[i].setModelo(modelo);
			System.out.println("Digite la marca del celular " + (i+1) );
			marca = s.nextLine(); 
			celulares[i].setMarca(marca);
			System.out.println("Digite el color del celular "+ (i+1));
			color = s.nextLine();
			celulares[i].setColor(color);			
		}
		
		do{
	           System.out.println("Elija una de las siguientes opciones");
	           System.out.println("1. Buscar celular por marca");
	           System.out.println("2. Eliminar celular por modelo");
	           System.out.println("3. Muestra los celulares");
	           System.out.println("4. Salir");
	           opcion = s.nextInt();
	           switch(opcion){
	               case 1:
	                   System.out.println("¿Que marca de celular desea buscar?");
	                   String Nombremarca = s1.nextLine(); //s.nextLine();
	                   for(int k = 0; k < numcelulares; k++) {
	                	   if(celulares[k].getMarca().equals(Nombremarca)) {
		                	   System.out.println("Este es el celular que buscas: "+ celulares[k]);
		                   }
	                   }
	                  
	                   break;
	               case 2:
	                   System.out.println("¿Que modelo de celular desea eliminar?");
	                   numModelo = s1.nextInt();
	                   for(int j = 0; j < numcelulares; j++) {
	                	   if(numModelo==celulares[j].getModelo()) {
	                		   System.out.println("Se ha eliminado este modelo: " + numModelo );
	                		   celulares[j].setModelo(0);
	                		   celulares[j].setColor("");
	                		   celulares[j].setMarca("");
	                		   //celulares[j] = null;
	                	   }
	                   }
	                   break;
	                case 3:
	                   System.out.println("Los celulares registrados son: ");
	                   for(int i = 0; i <numcelulares; i++) {
	                	   System.out.print("Celular "+ (i+ 1) + " : ");
	                	   System.out.println(celulares[i].toString());
	                   }
	                   break;
	                case 4:
	                	salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	       }
	      while(!salir); 
		
	}
}

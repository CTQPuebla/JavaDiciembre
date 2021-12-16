package com;

public class StringCiclos {

		public static void main(String[] args) {
			
			
			/*.legth() tamaño
			System.out.println(cadena.length());
			
			//Posición de letra charAt
			System.out.println(cadena.charAt(10));
			
			
			//substring compila desde la posición deseada
			System.out.println(cadena.substring(20));
			
			//substring  compila inicio y final
			System.out.println(cadena.substring(9, 20));
			
			//toLowerCase minuscula
			System.out.println(cadena.toLowerCase());
			
			//toUpperCase mayusculas
			System.out.println(cadena.toUpperCase());
			
			//equals()
			System.out.println(cadena.equals("HOla"));
			
			for (int i =0; i < 20; i++) {
				System.out.println("foo " + i);
			}
			
			for (int i =20; i > 0; i--) {
				System.out.println("foo " + i);
			}
			//evalua condicion desde el inicio, indefinido
			int x = 10;
			while(x<=30) {
				System.out.println("ok"+ 30);
				x++;
			}
			
			//Se relaliza la logica programada al menos una vez que cumpla la conidicon o no
			do {
				System.out.println("Hola");
				System.out.println("Valor de x= " + x);
				x--;
			}
			while(x>0);*/
			
			String cadena = "Hoy es 15 de diciembre del 2021";
			
			
			String vocal = "";  
			String consonante = "";
			
			for(int i = 0; i <  cadena.length(); i++) {
				//System.out.println(cadena.charAt(i));
				if(Character.toString(cadena.charAt(i)).toLowerCase().equals("a") || Character.toString(cadena.charAt(i)).toLowerCase().equals("e") || Character.toString(cadena.charAt(i)).toLowerCase().equals("i")
					|| Character.toString(cadena.charAt(i)).toLowerCase().equals("o") || Character.toString(cadena.charAt(i)).toLowerCase().equals("u")	)  
				{
					vocal = vocal + Character.toString(cadena.charAt(i));
					
				}
				else {
					try {
						Integer.parseInt(Character.toString(cadena.charAt(i)));
						
					}
					catch(Exception ex){
						consonante = consonante + Character.toString(cadena.charAt(i));
						
					}
				}
				
			}
			System.out.println(cadena);
			System.out.println("Las vocales son: "+ vocal);
			System.out.println("Las consonantes son: " + consonante );
		}
}

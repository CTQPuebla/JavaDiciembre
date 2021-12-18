package com;

import java.io.*;

public class Examen {

	public static void main(String[] args) {
		String[] dias = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte", 
				"ventiuno", "veintidos", "veintires", "veintecuatro", "veinticinco", "veintiseis", "veintisiete", 
				"veintiocho", "veintinueve", "treinta", "treinta uno"};
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", 
				"noviembre", "diciembre"};
		
		File archivoLectura = new File("C:/Users/GSCODE/Desktop/examen/lectura.txt");
		File archivoEscritura = new File("C:/Users/GSCODE/Desktop/examen/escritura.txt");
		FileReader lectura = null;
		FileWriter escritura = null;
		BufferedReader textoLectura = null;
		BufferedWriter textoEscritura = null;
		String fecha;
		String fechaCompleta = "";
		
		
		try {
			lectura = new FileReader(archivoLectura);
			escritura = new FileWriter(archivoEscritura);
			textoLectura = new BufferedReader(lectura);
			textoEscritura = new BufferedWriter(escritura);
			while((fecha = textoLectura.readLine()) != null) 
			{
				System.out.println(fecha.substring(0,2));
				System.out.println(fecha.substring(2,4));
				for(int x =0; x<dias.length; x++) 
				{
					if((x+1) == Integer.parseInt(fecha.substring(0,2))) {
						fechaCompleta += dias[x] + " de ";
						
						
					}
					
					
				}
				
				for(int x =0; x<meses.length; x++) 
				{
					if(Integer.parseInt(fecha.substring(0,2)) == 29 && meses[x] == "febrero" ) {
						fechaCompleta = "Fecha no existente";
					}
					else if((x+1) == Integer.parseInt(fecha.substring(2,4))) {
						fechaCompleta += meses[x] + " del " + fecha.substring(4,8);
					}
					
				}
				System.out.println(fechaCompleta);
				textoEscritura.write(fechaCompleta + "\n");
				fechaCompleta = "";
				System.out.println("- - - - - - - - - - -");
			}	
			textoEscritura.write("-----------------------" + "\n");
		}
		 catch (IOException ex) 
		 {
			System.out.println("Error uno" + ex);
		 } finally {
			 	try 
			 	{
			 		textoEscritura.close();
			 		escritura.close();
			 		textoLectura.close();
			 		lectura.close();
			 	} 
			 	catch (IOException e)
			 	{
			 		System.out.println("Error dos" + e);
			 	}		
		 	}		
		
	}
}
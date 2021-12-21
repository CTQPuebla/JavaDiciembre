package com;
import java.io.*;
import java.util.GregorianCalendar;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		int anio = 0;
		String FechaDigito;
		String FechaCadena = "";
		FileReader lectura = null;
		FileWriter escritura = null;
		BufferedReader ContenidoLectura = null;
		BufferedWriter ContenidoEscritura = null;
		GregorianCalendar calendar = new GregorianCalendar();
		File archivoLectura = new File("C:\\Users\\user\\Desktop\\ejemplo.txt");
		File archivoEscritura = new File("C:\\Users\\user\\Desktop\\escritura.txt");
				
		String[] dias = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once","doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho","diecinueve", "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno"};
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

		try {
			lectura = new FileReader(archivoLectura);
			escritura = new FileWriter(archivoEscritura);
			ContenidoLectura = new BufferedReader(lectura);
			ContenidoEscritura = new BufferedWriter(escritura);
			
			while((FechaDigito = ContenidoLectura.readLine()) != null){
				System.out.print(FechaDigito.substring(0,2));
				System.out.print(FechaDigito.substring(2,4));
				System.out.print(FechaDigito.substring(4,8));
				for(int x=0; x < dias.length; x++){
					if((x+1) == Integer.parseInt(FechaDigito.substring(0,2))) {
						FechaCadena += "(" + dias[x] + " de ";
					}
				}

				for(int x=0; x < meses.length; x++){
					if(Integer.parseInt(FechaDigito.substring(0,2)) == 29 && meses[x] == "febrero") {
						anio+=Integer.parseInt(FechaDigito.substring(4,8));
						//System.out.println("Año en entero: " + anio);
						if(calendar.isLeapYear(anio)) {  //anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))
							FechaCadena += meses[x] + " del " + FechaDigito.substring(4,8) + ")";
						}else {
							FechaCadena = " ( No es año biciesto por lo cual esta fecha no existe )";
						}
					}
					else if((x+1) == Integer.parseInt(FechaDigito.substring(2,4))) {
						FechaCadena += meses[x] + " del " + FechaDigito.substring(4,8) + ")";
					}
				}
				System.out.println(FechaCadena);
				ContenidoEscritura.write(FechaCadena + "\n");
				FechaCadena = "";
			}	
		}
		 catch (IOException e){
			System.out.println(e);
		 }finally{
			 try {
			 	ContenidoEscritura.close();
			 	escritura.close();
			 	ContenidoLectura.close();
			 	lectura.close();
			 }catch(IOException e){
			 		System.out.println(e);
			 }		
		 }
    }
}

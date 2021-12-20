import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.BufferedWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class FechasArchivos {
	
	public static String devuelveDiaTexto(String i) {
		switch(i) {
		case "01":	return "Uno"; 			case "02": 	return "Dos"; 			case "03": 	return "Tres";
		case "04": 	return "Cuatro"; 		case "05": 	return "Cinco"; 		case "06": 	return "Seis"; 			
		case "07": 	return "Siete";			case "08": 	return "Ocho"; 			case "09": 	return "Nueve"; 		
		case "10":	return "Diez"; 			case "11": return "Once";			case "12":	return "Doce"; 			
		case "13":	return "Trece"; 		case "14": 	return "Catorce";		case "15": return "Quince";			
		case "16": 	return "Dieciseis"; 	case "17": 	return "Diecisiete"; 	case "18": 	return "Dieciocho";
		case "19": 	return "Diecinueve"; 	case "20": 	return "Veinte"; 		case "21": 	return "Veintiuno";
		case "22": 	return "Veintidos"; 	case "23": 	return "Veintitres"; 	case "24": 	return "Veinticuatro";
		case "25":	return "Veinticinco";	case "26": 	return "Veintiseis"; 	case "27": 	return "Veintisiete";
		case "28": 	return "Veintiocho"; 	case "29": 	return "Veintinueve";	case "30": 	return "Treinta";
		case "31": 	return "Treinta y uno";
		default: 	return "";
		}
		
	}
	
	public static String devuelveMesTexto(String i) {
		switch(i) {
		case "01":	return "Enero";		case "02": 	return "Febrero";	case "03":	return "Marzo";
		case "04": 	return "Abril";		case "05": 	return "Mayo";		case "06": 	return "Junio"; 			
		case "07": 	return "Julio";		case "08": 	return "Agosto"; 	case "09": 	return "Septiembre"; 		
		case "10":	return "Octubre";	case "11":	return "Noviembre";	case "12":	return "Diciembre"; 			
		default: 	return "";
		}
		
	}
	
  public static void main(String[] args) {
	  String datosLeidos = ""; //Contendrá las fechas concatenadas pero separadas por coma
      String[] fechas = null; //Contendrá las fechas en numeros
      String[] fechasTexto = null;	//Contendrá las fechas en texto, después de las adecuaciones necesarias
      //Los archivos se guardaron en la raiz de la carpeta del proyecto de Spring
      
      //Tratamos de leer y hacer las conversiones necesarias
      
	  try {
		  File myObj = new File("fechas.txt"); //El archivo que ya contiene las fechas
	      Scanner myReader = new Scanner(myObj);
	      
	      while (myReader.hasNextLine()) {
	    	  datosLeidos += myReader.nextLine()+",";
	    	  System.out.println(datosLeidos);
	      }
	      myReader.close();
	      
	      fechas = datosLeidos.split(",");
	      fechasTexto = new String[fechas.length]; 
	      
	      for (int i = 0; i<fechas.length; i++) {
	    	  System.out.println(fechas[i]);
	    	  fechasTexto[i] = devuelveDiaTexto(fechas[i].substring(0,2))+
	    			  " de "+devuelveMesTexto(fechas[i].substring(2,4))+
	    			  " de "+fechas[i].substring(4);
	    	  System.out.println(fechasTexto[i]);
	      }   
	  } 
	  catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	  }
	  
	  //Tratamos de crear un nuevo archivo  
	  
	  try {
	      File myObj = new File("fechas con texto.txt"); //El nombre del nuevo archivo
	      if (myObj.createNewFile()) {
	        System.out.println("Archivo creado: " + myObj.getName());
	      } else {
	        System.out.println("El archivo ya existe.");
	      }
	  } 
	  catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	  }
	  
	  //Tratamos de escribir en este nuevo archivo
	  
	  try {
	      FileWriter myWriter = new FileWriter("fechas con texto.txt");
	      BufferedWriter out = new BufferedWriter(myWriter);
	      
	      for(int i = 0; i<fechasTexto.length; i++) {
	    	  out.write(fechasTexto[i]);
	    	  out.newLine();
	      }
	      
	      out.close();
	      System.out.println("Se escribió exitosamente a archivo.");
	  } 
	  catch (IOException e) {
	      System.out.println("Ocurrió un error.");
	      e.printStackTrace();
	  }
  }
}
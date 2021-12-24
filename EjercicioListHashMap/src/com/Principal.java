package com;
import java.io.*;
import java.util.*;

public class Principal {
	public static void main(String[] args) {	
        Scanner entrada = new Scanner(System.in);
        List<Agenda> agendacontactos = new ArrayList<Agenda>();
        boolean salir = false;
        
        while (!salir) {   

            System.out.println(" BIENVENIDO A SU AGENDA ");
            System.out.println(" ¿Que desea hacer? ");
            System.out.println(" 1. Crear contacto ");
            System.out.println(" 2. Buscar contacto ");
            System.out.println(" 3. Ver todos mis contactos ingresados");
            System.out.println(" 4. Eliminar contacto ");
            System.out.println(" 5. Modificar contacto ");
            System.out.println(" 6. Salir ");
            
            int opcion = Integer.parseInt(entrada.nextLine());
           
            switch(opcion) {
                case 1: 
                    Agenda a = new Agenda();
                    
                    System.out.println("Ingrese nombre:");
                    a.setNombre(entrada.nextLine());
                    System.out.println("Ingrese domicilio: ");
                    a.setDomicilio(entrada.nextLine());
                    System.out.println("Ingrese fecha : ");
                    a.setFechanacimiento(entrada.nextLine());
                    System.out.println("Ingrese correo : ");
                    a.setCorreo(entrada.nextLine());
                    System.out.println("Ingrese telefono 1");
                    a.setTelefono1(entrada.nextLine());
                    System.out.println("Ingrese telefono 2 : ");
                    a.setTelefono2(entrada.nextLine());

                    agendacontactos.add(a);
                     
                    System.out.println("CONTACTO CREADO EXITOSAMENTE ");
                    
                    break;
                case 2: 
                	
                	if(!(agendacontactos.size()==0)){
                        System.out.println("Ingreser el nombre del contacto que busca: ");
                        String nombre = entrada.nextLine();
                        
                        for (int i = 0; i < agendacontactos.size(); i++) {
                            Agenda contacto = agendacontactos.get(i);
                         
                            if (nombre.equals(contacto.getNombre())) {
                            	System.out.println("----------------------------------");
                            	  System.out.println("Nombre: " + contacto.getNombre());
                                  System.out.println("Domicilio: " +contacto.getDomicilio());
                                  System.out.println("Correo :" + contacto.getCorreo());
                                  System.out.println("Fecha de nacimiento : " + contacto.getFechanacimiento());
                                  System.out.println("Telefono 1 :" + contacto.getTelefono1());
                                  System.out.println("Telefono 2 :" + contacto.getTelefono2());
                               System.out.println("-------------------------------------");
                            	}else {
                            		System.out.println("ESTE CONTACTO NO EXISTE EN TU AGENDA");
                            	}
                        	}
                    	}else {
                    		System.out.println("NO TIENES CONTACTOS REGISTRADOS");
                    		System.out.println();
                    	}
  
 
                    break;
                case 3: 

                	if(!(agendacontactos.size()==0)){
                		for(int i = 0; i < agendacontactos.size(); i++){ 
                     	   System.out.println("------------------------------------");
                            System.out.println("Contacto: " + (i + 1));
                            Agenda contacto =  agendacontactos.get(i); 

                            System.out.println("Nombre: " + contacto.getNombre());
                            System.out.println("Domicilio: " +contacto.getDomicilio());
                            System.out.println("Correo :" + contacto.getCorreo());
                            System.out.println("Fecha de nacimiento : " + contacto.getFechanacimiento());
                            System.out.println("Telefono 1 :" + contacto.getTelefono1());
                            System.out.println("Telefono 2 :" + contacto.getTelefono2());
                            System.out.println("------------------------------------");
                           
                        }
                	}else {
                		System.out.println("NO TIENES CONTACTOS REGISTRADOS");
                		System.out.println();
                	}
                    break;
                case 4: 
                	if(!(agendacontactos.size()==0)){
                        System.out.println("Ingreser el nombre del contacto a eliminar: ");
                        String nombre = entrada.nextLine();
                        
                        for (int i = 0; i < agendacontactos.size(); i++) {
                            Agenda contacto = agendacontactos.get(i);
                         
                            if (nombre.equals(contacto.getNombre())) {
                              
                            	agendacontactos.remove(i);
                                System.out.println("Contacto eliminado");
                            }else {
                        		System.out.println("ESTE CONTACTO NO EXISTE EN TU AGENDA");
                        	}
                        }
                    	}else {
                    		System.out.println("NO TIENES CONTACTOS REGISTRADOS");
                    		System.out.println();
                    	}
                    break;
                case 5:
                	if(!(agendacontactos.size()==0)){
                        System.out.println(" Ingrese el nombre del contacto a modificar");
                        String nombre = entrada.nextLine();
        
                        for (int i = 0; i < agendacontactos.size(); i++) {
                            Agenda contacto = agendacontactos.get(i);
                            if (nombre.equals(contacto.getNombre())) {
                            	System.out.println("**********");
                            	System.out.println("Nombre: " + contacto.getNombre());
                                System.out.println("Domicilio: " +contacto.getDomicilio());
                                System.out.println("Correo :" + contacto.getCorreo());
                                System.out.println("Fecha de nacimiento : " + contacto.getFechanacimiento());
                                System.out.println("Telefono 1 :" + contacto.getTelefono1());
                                System.out.println("Telefono 2 :" + contacto.getTelefono2());
                                System.out.println("**********");
                                
                                System.out.println("Ingrese nuevo nombre: ");
                                String nombrenuevo = entrada.nextLine();
                                System.out.println("Ingrese nuevo domicilio: ");
                                String nuevodom = entrada.nextLine();
                                System.out.println("Ingrese nuevo correo: ");
                                String nuevoco = entrada.nextLine();
                                System.out.println("Ingrese nueva fecha de nacimiento: ");
                                String nuevafecha = entrada.nextLine();
                                System.out.println("Ingrese nuevo telefono 1 ");
                                String nuevotel1 = entrada.nextLine();
                                System.out.println("Ingrese nuevo telefono 2: ");
                                String nuevotel2 = entrada.nextLine();
                                
                                contacto.setNombre(nombrenuevo);
                                contacto.setDomicilio(nuevodom);
                                contacto.setCorreo(nuevoco);
                                contacto.setFechanacimiento(nuevafecha);
                                contacto.setTelefono1(nuevotel1);
                                contacto.setTelefono2(nuevotel2);
                                
                            }else {
                        		System.out.println("ESTE CONTACTO NO EXISTE EN TU AGENDA");
                        	}
                        }
                    	}else {
                    		System.out.println("NO TIENES CONTACTOS REGISTRADOS");
                    		System.out.println();
                    	}
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("¡¡¡¡OPCION INVALIDA!!!!!");
            }
        }
	}

}

package com;

public class Principal {

	public static void main(String[] args) {
		// ATRIBITUTOS
		// METODO CONSTRUCTOR una clase tiene n constructores
		// Geller & Sellers
		// toString
		// Comportamiento
		//--------------------------------------------------
		
		//Instanciar objeto
		// el estado de un objeto se expresa a traves de los atributos
		Computadora c1 = new Computadora();
		c1.setMarca("Dell");
		c1.setModelo("vivoVook");
		c1.setProcesador("Intel core3");
		c1.setRam(6);
		c1.setMaterial("aluminio");
		c1.setTamanio("15.6");
		c1.setPuertos(5);
		System.out.println(c1);
		
		Computadora c2 = new Computadora("Dell", "vivo14", "core 7", 5, "aluminio", "15", 4);
		System.out.println(c2);
		
		//Instanciar el objeto 2
		Cpu c3 = new Cpu();
		c3.setMarca("Toshiba");
		c3.setModelo("Toshi23");
		c3.setProcesador("Intel");
		c3.setRam(2);
		c3.setMaterial("aluminio");
		c3.setTamanio("13");
		c3.setPuertos(1);
		//mostrarlo
		System.out.println(c3);
		
		Cpu c4 = new Cpu("HP", "HP14", "core 5", 8, "aluminio", "14", 4);
		System.out.println(c4);
		
		AutoGasolina ag = new AutoGasolina();
		ag.setAsientos(4);
		System.out.println(ag);
		
		Deportivo dp = new Deportivo();
		dp.setColor("rojo");
		System.out.println(dp);
		
		CarroB cb = new CarroB();
		cb.setAutomatico(false);;
		System.out.println(cb);
	}

}

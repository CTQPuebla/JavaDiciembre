package com;

public class Objetos {

	public static void main(String[] args) {
		
		//Atributos (Estado)
		
		//Metodo construccion
		
		//toString
		
		//better & setters
		
		//compartamiento
		
		Computadora c1 = new Computadora();
		
		c1.setMaterial("Aluminio");
		c1.setMarca("Dell");
		c1.setModelo("XPS");
		c1.setProcesador("Intel");
		c1.setRam(6.5);
		c1.setPuertos(5);
		c1.setTamaño("15.6");
		
		System.out.println(c1);
		
		//el estado del objeto se expresa a traves de los atributos
		Computadora c2 = new Computadora("Dell", "XPS", "Intel", 6.5, "Aluminio", "15.6", 5);
		System.out.println(c2);
		
		Cpu c3 = new Cpu();

		c3.setMaterial("Aluminio");
		c3.setMarca("Lenovo");
		c3.setModelo("XJ25");
		c3.setProcesador("AMD");
		c3.setRam(4.5);
		c3.setPuertos(5);
		c3.setTamaño("14");
		System.out.println(c3);
		
		Cpu c4 = new Cpu("Asus", "X512F", "Intel", 12, "Aluminio", "15.6", 4);
		System.out.println(c4);
		
		
		//------------------------------------------
		AutoGasolina ag = new AutoGasolina();
		ag.setAsientos(4);
		System.out.println(ag);
		
		Deportivo dp = new Deportivo();
		dp.setAsientos(4);
		System.out.println(dp);
		
		Camioneta ca = new Camioneta();
		ca.setLlantas(4);
		ca.setMotor("6.4 l v8");
		ca.setLargo(160);
		ca.setAncho(200);
		ca.setAlto(160);
	    ca.setAsientos(4);
		ca.setMarca("Jeep");
		ca.setModelo("Grand Cherokee");
		ca.setColor("Gris");
		ca.setEstandar(false);
		ca.setTodoTerreno(true);
		ca.setTorque(707);
		ca.setHp(203);
		

		
		System.out.println(ca);
	}

}

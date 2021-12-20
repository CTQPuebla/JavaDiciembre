package com;

public class Principal {
	
	//Atributos
	
	//Metodo constructor
	
	//Getter & Setters
	
	//toString

	//Comportamiento
	
	public static void main(String[] args) {
		//Instanciar un objeto
		
		Computadora c1 = new Computadora();
		
		c1.setMaterial("Aluminio");
		c1.setMarca("Dell");
		c1.setModelo("XPS");
		c1.setProcesador("Intel i5");
		c1.setNumpuertos(5);
		c1.setTamaño("15.6");
		c1.setRam(6.5);
		System.out.println(c1); //vemos el estado del objeto se expresa a tra ves de los atributos
		
		
		Computadora c2 = new Computadora("Apple", "Mac Air", "M2", 8.0, "Aluminio", "13.2", 1);
		System.out.println(c2);
		
		//c2.material = "Plastico";
		
		//System.out.println(c2);
		
		//------------
		AutoGasolina ag = new AutoGasolina();
		ag.setAsientos(4);
		System.out.println(ag);
		
		Deportivo dep = new Deportivo();
		dep.setColor("negro");
		System.out.println(dep);
		
		//-----------
		SelecciondeFutbol s1 = new SelecciondeFutbol();
		s1.setId(123456);
		System.out.println(s1);
		
		Entrenador e1 = new Entrenador();
		e1.setIdFederacion("1q234545");
		System.out.println(e1);
	}
	
	
	
	

}

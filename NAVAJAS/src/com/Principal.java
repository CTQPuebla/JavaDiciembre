package com;

public class Principal {

	public static void main(String[] args) {
		Navaja nj = new NavajaBasica();
		Navaja ne = new NavajaExtendida();
		
		NavajaMetodos nm1 = new NavajaBasica();
		NavajaMetodos nm2 = new NavajaExtendida();
		
		nj.setNombre("abanico");
		nj.setMarca("China");
		nj.setColor("Rojo");
		nj.setTamano(30);
		nj.setPrecio(500);
		
		ne.setNombre("Cabriteras");
		ne.setMarca("Europea");
		ne.setColor("Negro");
		ne.setTamano(50);
		ne.setPrecio(2000);
		
		System.out.println(nj.toString());
		System.out.println();
		System.out.println(ne.toString());
		System.out.println();
	
		System.out.println(nm1.caracteristicas());
		System.out.println();
		System.out.println(nm2.caracteristicas());
		

	}
	
	
}

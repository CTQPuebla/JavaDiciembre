package com;

public class Principal {

	public static void main(String[] args) {
		NavajaSuiza n = new NavajaSuiza();
		n.partir();
		n.cortar();
		n.cortar();
		n.sujetar();
		n.destaparCorcho();
		n.limar();
		n.medir();
		n.guiar();
		n.partir();
		n.ver();
		n.destaparCorcholata();
		System.out.println("Esta navaja tiene un tamaño de ancho de " +INavajaSuiza.tamanoAncho );
	}

}

package com;

public class NavajaSuiza implements INavajaSuiza{

	Tijera t = new Tijera();
	Pinza p = new Pinza();
	DestapaCorcho d = new DestapaCorcho();
	Lima l = new Lima();
	Regla r = new Regla();
	Brujula b = new Brujula();
	Navaja n = new Navaja();
	Lupa lu = new Lupa();
	Destapacorcholatas de = new Destapacorcholatas();
	
	public NavajaSuiza() {
		
	}

	@Override
	public void cortar() {
		t.cortar();
	}

	@Override
	public void sujetar() {
		p.sujetar();
	}

	@Override
	public void destaparCorcho() {
		d.destapar();
	}

	@Override
	public void limar() {
		 l.limar();
	}

	@Override
	public void medir() {
		r.medir();		
	}

	@Override
	public void guiar() {
		b.guiar();
	}

	@Override
	public void partir() {
		n.partir();
	}

	@Override
	public void ver() {
		lu.ver();
	}

	@Override
	public void destaparCorcholata() {
		de.destapar();
	}
	
}

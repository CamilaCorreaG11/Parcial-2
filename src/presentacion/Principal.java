package presentacion;

import logica.Parcial;

public class Principal {

	
	public Principal() {
		
		Parcial p = new Parcial();
		
		try {
			System.out.println(p.potencia(2,7));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	try {
		System.out.println(p.potencia(2,32));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		System.out.println(p.potencia(0,0));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		p = new Parcial();
		System.out.println(p.potencia(3,-5));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		p = new Parcial();
		System.out.println(p.potencia(4,29));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		p = new Parcial();
		System.out.println(p.potencia(50000,2));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	try {
		p = new Parcial();
		System.out.println(p.potencia(46340,2));
	} catch (Exception e) {
		e.printStackTrace();
	}
	try {
		p = new Parcial();
		System.out.println(p.potencia(2,30));
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	
	
	
	public static void main(String[] args) {
		new Principal();
	}
	
	
}

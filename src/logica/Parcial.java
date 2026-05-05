package logica;

public class Parcial {
		
	private int b;
	private int e;
	
	
	
	public Parcial() {
	
	}



	public int potencia (int b, int e) throws Exception{
		// e tiene que ser positivo
		// no puede ser mayor a 2147483647
		// 0 a la 0 es indeterminado 
		
		if (e<0) {
			throw new Exception ("El exponente es negativo y la respuesta no sera un numero entero.");
		}
		
		else if (b == 0 && e ==0) {
			throw new Exception ("0 elevado a la 0 es indeterminado");
		}
		
		// Verifico esto primero para que haya un limite en los numeros ingresados antes de usar Math.pow por que tambien debe haber un limite para los numeros double 
		else if (b > 46340 && e >=2) {
			throw new Exception ("El numero ingresado elevado a una potencia de 2 o mayor es muy grande para que el resultado sea guardado en una variable entera");
		}
		
		// Verifico esto primero para que haya un limite en los numeros ingresados antes de usar Math.pow por que tambien debe haber un limite para los numeros double 

		else if (b >= 2 && e > 30) {
			throw new Exception ("El exponente ingresado es muy grande para que el resultado de elevar el primer numero sea guardado en una variable entera");
		}
		
		
		else if (Math.pow(b, e) > 2147483647 || Math.pow(b, e) < -2147483647  ) {
			throw new Exception ("El resultado es mayor a 2147483647 o menor a -2147483647, el limite para los enteros en java");
			
		}
		
		double respuesta = Math.pow(b, e);
		return (int) respuesta;
		
		
	}
	
	
	
}

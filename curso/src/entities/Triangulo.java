package entities;

public class Triangulo {
	
	// Attributes//
	public double a;
	public double b;
	public double c;
	
	
	
	//Metodos
	public double  area() {
		 double p = ( a  + b + c) /2.0;
		 double resultado = Math.sqrt(p *(p - a) * (p - b) * (p - c));
		 
		 
		return resultado;
		 
	}
	
	
	
	

	
}

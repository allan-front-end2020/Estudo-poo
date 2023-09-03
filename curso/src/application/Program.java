package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args)
	
	{
	Locale.setDefault(Locale.US); 
    Scanner sc = new Scanner(System.in);	
    
    
    Triangulo x, y;
     // intanciar o objeto triangulo
     x = new Triangulo();
     y = new Triangulo();
	
	 
	 System.out.println("Entre com as medidas do triangulo x");
	 x.a = sc.nextDouble();
	 x.b= sc.nextDouble();
	 x.c= sc.nextDouble();
	 
	 System.out.println("Entre com as medidas do triangulo y");
	 y.a= sc.nextDouble();
	 y.b = sc.nextDouble();
	 y.c = sc.nextDouble();
  		

	  double areaX = x.area();
	  double areaY = y.area();
	  
	 
	 
	 System.out.println("A area do triangulo X é :"+ areaX);
	
	 System.out.println("A area do triangulo y é :"+ areaY);
	 
	 
	 if(areaX > areaY) {
		 System.out.println("O maior triangulo e o x");
	 }
	 else{
		 System.out.println("O maior triangulo e o y");
		
	 }
	 
	 
	 
	 
	 
	 
	 
	 sc.close();

	}

}

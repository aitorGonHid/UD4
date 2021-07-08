package UD4.ejercicio5;


public class Ejercicio5App {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		
		System.out.println("Valores iniciales:");
		System.out.println("a= "+a+", b= "+b+", c= "+c+" y d= "+d);
		
		System.out.print("\nAsignaciones: \n"
				+ "b toma el valor de c,\n"
				+ "c toma el valor de a,\n"
				+ "a toma el valor de d,\n"
				+ "d toma el valor de b:\n\n");
		
		//Asignaciones
		b=c;
		System.out.println("b: "+b+" c: "+c);
		c=a;
		System.out.println("c "+c+" a: "+a);
		a=d;
		System.out.println("a: "+a+" d: "+d);
		d=b;
		System.out.println("d: "+d+" b: "+b);
		
		System.out.println("\nValores finales: ");
		System.out.println("a= "+a+", b= "+b+", c= "+c+" y d= "+d);
		

	}

}

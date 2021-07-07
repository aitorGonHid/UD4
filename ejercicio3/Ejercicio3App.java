package ejercicio3;

public class Ejercicio3App {
	
	public static void main (String args[]) {
		
		int x = 1;
		int y = 2;
		double n = 1.2;
		double m = 2.2;
		
		System.out.println("El valor de las variables: ");
		System.out.println("x=" + x + ", y=" + y + ", n=" + n + " y m=" + m + "\n");
		System.out.println("La suma  X + Y: " + (x+y));
		System.out.println("La diferencia  X –Y: " + (x-y));
		System.out.println("El producto  X * Y: " + (x*y));
		System.out.println("El cociente  X / Y: " + (x/y));
		System.out.println("El resto  X % Y: " + (x%y));
		System.out.println("La suma  N + M: " + (n+m));
		System.out.println("La diferencia  N –M: " + (n-m));
		System.out.println("El producto  N * M: " + (n*m));
		System.out.println("El cociente  N / M: " + (n/m));
		System.out.println("El resto  N % M: " + (n%m));
		System.out.println("La suma X + N: " + (x+m));
		System.out.println("El cociente Y / M: " + (y/m));
		System.out.println("El resto Y % M: " + (y%m));
		System.out.println("El doble de cada variable: " + (x*2) + ", " + (y*2) + (", ") + (n*2) + ", " + (m*2));
		System.out.println("La suma de todas las variables: " + (x+y+m+n));
		System.out.println("El producto de todas las variables: " + (x*y*m*n));
	}		
}

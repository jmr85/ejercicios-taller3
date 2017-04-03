package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * Ejercicio9: Realizar una clase que lea 4 valores numéricos e informar su
	 * suma y promedio.
	 */
	static int suma(int a, int b) {
		return a + b;
	}

	static int promedio(int a, int b) {
		return suma(a, b) / 2;
	}

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("*** SUMA ***");
		System.out.print("Ingrese numero: ");
		a = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		b = sc.nextInt();
		System.out.println("La Suma es: " + suma(a, b));
		System.out.println("*** PROMEDIO ***");
		System.out.print("Ingrese numero: ");
		c = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		d = sc.nextInt();
		System.out.print("EL Promedio es: " + promedio(c, d));

		sc.close();
	}

}

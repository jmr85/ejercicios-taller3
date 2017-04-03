package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	/*
	 * Ejercicio8: Escribir un programa (clase) en el cual se ingrese 4 números,
	 * calcular e informar la suma de los 2 primeros y el producto del 3ro y el
	 * 4to
	 */
	static int suma(int a, int b) {
		return a + b;
	}

	static int producto(int a, int b) {
		return a * b;
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
		System.out.println("*** PRODUCTO ***");
		System.out.print("Ingrese numero: ");
		c = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		d = sc.nextInt();
		System.out.print("EL Producto es: " + producto(c, d));

		sc.close();
	}

}

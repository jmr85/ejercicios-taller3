package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Ejercicio10: Se debe desarrollar un programa que pida el ingreso del
	 * precio de un artículo y la cantidad que lleva el cliente, mostrar lo que
	 * debe abonar el comprador.
	 */

	static double venta(double precio, double cant) {
		return precio * cant;
	}

	public static void main(String[] args) {
		double precio, cant;
		Scanner sc = new Scanner(System.in);
		System.out.println("*** VENTA ***");
		System.out.print("Ingrese precio: ");
		precio = sc.nextDouble();
		System.out.print("Ingrese cantidad: ");
		cant = sc.nextDouble();
		System.out.println("El cliente debe abonar: $" + venta(precio, cant));

		sc.close();
	}

}

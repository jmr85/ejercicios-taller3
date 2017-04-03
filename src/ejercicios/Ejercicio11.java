package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	/*
	 * Ejercicio11: Realizar un programa que lea por teclado 2 números, si el
	 * 1ro es mayor al 2do informar su suma y diferencia en caso contrario,
	 * informar el producto y la división del 1ro respecto al 2do validar que no
	 * sea 0.
	 */
	static boolean mayor(int a, int b) {
		return a > b;
	}

	static int suma(int a, int b) {
		return a + b;
	}

	static int resta(int a, int b) {
		return a - b;
	}

	static int producto(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Ingrese el primer numero: ");
		a = sc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		b = sc.nextInt();
		while(b == 0){
			System.out.print("No se puede ingresar 0, vuelva a ingresar el numero: ");
			b = sc.nextInt();
		}
		if(mayor(a,b))
			System.out.println("La suma es: " + suma(a, b));
		else
			System.out.println("La diferencia entre los dos es de: " + resta(b, a));
		System.out.println("El producto es: " + producto(a, b));
		System.out.println("La division es: " + div(a, b));
		
		sc.close();

	}

}

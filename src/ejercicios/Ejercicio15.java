package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
	/*
	 * Confeccionar un programa que permita cargar un número entero positivo de
	 * hasta 3 cifras y muestre un mensaje indicando si tiene 1,2 o 3 cifras,
	 * mostrar un mensaje de error si el número de cifras es mayor.
	 */
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI EL NUMERO TIENE 1, 2 ó 3 CIFRAS *****");
		System.out.print("Ingrese primer numero: ");
		num = sc.nextInt();

		if (num >= 0 && num < 10)
			System.out.println("El numero tiene 1 cifra");
		else if (num >= 10 && num < 100)
			System.out.println("El numero tiene 2 cifras");
		else if (num >= 100 && num < 1000)
			System.out.println("El numero tiene 3 cifras");
		else if (num >= 1000)
			System.out.println("Error: solo se permite numero de tres cifras");
		else if (num < 0)
			System.out.println("El numero ingresado es negativo");
		
		sc.close();
	}
	
	

}

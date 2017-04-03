package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
/* Ejercicio13: Se cargan por teclado 3 números distintos y se visualiza el mayor de ellos.  */
	public static void main(String[] args) {
		int numero1, numero2, numero3;
		int mayor;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER EL NUMERO MAYOR DE TRES *****");
		System.out.print("Ingrese primer numero: ");
		numero1 = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		numero2 = sc.nextInt();
		System.out.print("Ingrese tercer numero: ");
		numero3 = sc.nextInt();
		
		mayor = numero1;
		
		if(mayor < numero2)
			mayor = numero2;
		if(mayor < numero3)
			mayor = numero3;
		
			
		System.out.println("El mayor de los tres es: " + mayor);

	

		sc.close();

	}

}

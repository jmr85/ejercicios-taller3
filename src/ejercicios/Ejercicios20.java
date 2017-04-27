package ejercicios;

import java.util.Scanner;

public class Ejercicios20 {

	public static void main(String[] args) {
		/* Escribir un programa que pida ingresar la coordenada de un punto en el plano 
		 * es decir 2 valores enteros. X e Y (ambos distintos a 0) posteriormente imprimir
		 *  en pantalla en que cuadrante se ubica dicho punto. 
		 *  Primer cuadrante: si x es mayor a 0 e Y es mayor a 0 segundo cuadrante menor
		 *   a 0 e Y mayor a 0 tercer cuadrante mayor a 0 e Y menor a 0 cuarto cuadrante el resto. */

		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("*****  *****");
		System.out.print("Ingrese valor de X: ");
		x = sc.nextInt();
		System.out.print("Ingrese valor de Y: ");
		y = sc.nextInt();
	
		if(x > 0 && y > 0)
			System.out.println("El punto se ubica en el primer cuadrante");
		else if(x < 0 && y > 0)
			System.out.println("El punto se ubica en el segundo cuadrante");
		else if(x > 0 && y < 10)
			System.out.println("El punto se ubica en el tercer cuadrante");
		
		sc.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	/* Ejercicio7:  Realizar la carga del lado de 1 cuadrado mostrar por pantalla
	 * el perímetro del mismo (el perímetro de 1 cuadrado calcula multiplicando el valor del lado x 4)  
 */
	public static void main(String[] args) {

		int lado, perimetro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un lado del cuadrado para calcular perimetro: ");
		lado = sc.nextInt();
		perimetro = lado * 4;
		System.out.println("El perimetro es: " + perimetro);
		sc.close();
		
	}

}

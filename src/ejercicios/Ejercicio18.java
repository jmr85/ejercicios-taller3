package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
/*  Se ingresa por teclado 3 números, si todos los valores ingresados son menores a 10 
 * imprimir en pantalla la leyenda, todos los números son menores a 10.   */
	
	public static void main(String[] args) {
		int valor, valor2, valor3;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI TODOS LOS NROS SON MENORES A 10 *****");
		System.out.print("Ingrese primer numero: ");
		valor = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		valor2 = sc.nextInt();
		System.out.print("Ingrese tercer numero: ");
		valor3 = sc.nextInt();

		if(valor < 10 && valor2 < 10 && valor3 < 10)
			System.out.println("Todos los numeros son menores a 10");
		
		sc.close();

	}
	
	
}

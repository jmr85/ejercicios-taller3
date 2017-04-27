package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*Se ingresa por teclado 3 números, si al menos 1 de los valores
		 *  ingresados es menor a 10 imprimir la leyenda, alguno de los números es menor a 10. */
		
		int valor, valor2, valor3;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI ALGUNOS DE LOS NROS ES MENOR A 10 *****");
		System.out.print("Ingrese primer numero: ");
		valor = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		valor2 = sc.nextInt();
		System.out.print("Ingrese tercer numero: ");
		valor3 = sc.nextInt();

		if(valor < 10 || valor2 < 10 || valor3 < 10)
			System.out.println("Alguno de los números es menor a 10");
		
		sc.close();

	}

}

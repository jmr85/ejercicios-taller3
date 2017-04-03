package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
/* Se ingresa por teclado un valor entero, mostrar una leyenda
 *  que indique si el número es positivo, nulo o negativo.  */
	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI EL NUMERO ES POS, NULL O NEG *****");
		System.out.print("Ingrese primer numero: ");
		num = sc.nextInt();
		
		if(num > 0)
			System.out.println("El numero es positivo");
		else if(num == null)
			System.out.println("El numero no tiene valor");
		
		sc.close();

	}

}

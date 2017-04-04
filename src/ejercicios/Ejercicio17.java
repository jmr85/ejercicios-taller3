package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
/* Se ingresan 3 valores por teclado, si todos son iguales se imprime la suma 
 * de el 1ro con el 2do y a este resultado se lo multiplica por el 3ro. */
	public static void main(String[] args) {
		int numero1, numero2, numero3;
		int resultado;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI TODOS LOS NUMEROS SON IGUALES *****");
		System.out.print("Ingrese primer numero: ");
		numero1 = sc.nextInt();
		System.out.print("Ingrese segundo numero: ");
		numero2 = sc.nextInt();
		System.out.print("Ingrese tercer numero: ");
		numero3 = sc.nextInt();
		
		if((numero1 == numero2) && (numero1 == numero3) && (numero2 == numero3)){
			resultado = numero1 + numero2;
			System.out.println("La suma del primero con el segundo: " + resultado );
			System.out.println("Resultado se lo multiplica por el 3ro: " + resultado * numero3 );
		}	
		sc.close();

	}

}

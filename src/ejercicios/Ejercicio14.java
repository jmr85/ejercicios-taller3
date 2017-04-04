package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
/*(falta resolver el NULL)Se ingresa por teclado un valor entero, mostrar una leyenda
 *  que indique si el número es positivo, nulo o negativo.  */
	public static void main(String[] args) {
		String valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** PARA SABER SI EL NUMERO ES POS, NULL O NEG *****");
		System.out.print("Ingrese primer numero: ");
		valor = sc.next();
//		if(Objects.isNull(Integer.valueOf(num)))
		if(valor.isEmpty())
			System.out.println("El numero es NULO");
		else if(Integer.parseInt(valor) >= 0)
			System.out.println("El numero es positivo");
		else if(Integer.parseInt(valor) < 0)
			System.out.println("El numero es negativo");
		
		sc.close();

	}

}

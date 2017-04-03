package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
	/*
	 * Ejercicio12: Se ingresan 3 notas de un alumno si el promedio es mayor o
	 * igual a 7 mostrar mensaje diciendo promocionado.
	 */
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		int promedio;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** NOTAS ALUMNO *****");
		System.out.print("Ingrese primer nota: ");
		nota1 = sc.nextInt();
		System.out.print("Ingrese segunda nota: ");
		nota2 = sc.nextInt();
		System.out.print("Ingrese numero: ");
		nota3 = sc.nextInt();

		promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio >= 7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("Se Promociona con promedio mayor o igual a 7");
		}

		sc.close();

	}

}

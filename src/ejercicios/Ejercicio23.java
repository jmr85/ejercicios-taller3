package ejercicios;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		/*
		 * Se ingresa un conjunto de 15 alturas de personas por teclado mostrar
		 * la altura promedio de las personas.
		 */
		String nombre;
		float altura;
		float cont = 0;
		System.out.println("********** Ingresar Altura de personas ******************");

		Scanner sc = new Scanner(System.in);

		Hashtable<String, Float> alturaPersonas = new Hashtable<>();

		for (int i = 1; i <= 4; i++) {
			System.out.print("Ingrese nombre: ");
			nombre = sc.next();
			System.out.print("Ingrese altura: ");
			altura = sc.nextFloat();
			cont += altura;
			alturaPersonas.put(nombre, altura);
			
		}

		System.out.println("****** Altura promedio de las personas *******");
		float promedio = cont / 4;
		System.out.println(promedio);
		sc.close();

	}
}

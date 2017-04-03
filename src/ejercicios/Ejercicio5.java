package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
	/*
	 * Ejercicio5: Solicitar el ingreso del nombre y la edad de 2 personas,
	 * mostrar el nombre de la persona con mayor edad
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Ingrese el primer nombre: ");
		String nombre1 = bReader.readLine();
		System.out.print("Ingrese su edad: ");
		String edad1 = bReader.readLine();
		int ed1 = Integer.parseInt(edad1);

		System.out.print("Ingrese el segundo nombre: ");
		String nombre2 = bReader.readLine();
		System.out.print("Ingrese su edad: ");
		String edad2 = bReader.readLine();
		int ed2 = Integer.parseInt(edad2);

		if (ed1 > ed2)
			System.out.println("La persona con mayor edad es: " + nombre1);
		else
			System.out.println("La persona con mayor edad es: " + nombre2);

	}

}

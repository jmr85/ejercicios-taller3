package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*
		 * De 1 operario se conoce su sueldo y los años de antigüedad se pide
		 * confeccionar un programa que lea los datos de entrada e informe lo
		 * siguiente A) Si el sueldo es inferior a 500 y su antigüedad es igual
		 * o superior a 10 años otorgar un aumento del 20% y mostrar el sueldo a
		 * pagar. B) si el sueldo es inferior a 500 pero su antigüedad es menor
		 * a 10 años otorgar un aumento del 5% y después mostrar el sueldo a
		 * pagar C) Si el sueldo es mayor a 500, mostrar el sueldo en pantalla
		 * sin cambios.
		 */

		float sueldo; 
		int antiguedad;

		Scanner sc = new Scanner(System.in);

		System.out.println("****************** Sueldo y antiguedad Operario ********************");
		System.out.print("Ingrese el sueldo: ");
		sueldo = sc.nextInt();
		System.out.print("Ingrese la antiguedad: ");
		antiguedad = sc.nextInt();

		if (sueldo < 500 && antiguedad >= 10)
			System.out.println("Sueldo a pagar: " + aumento(sueldo, 20));
		else if (sueldo < 500 && antiguedad < 10)
			System.out.println("Sueldo a pagar: " + aumento(sueldo, 5));
		else if (sueldo > 500)
			System.out.println("Sueldo a pagar: " + sueldo);
		sc.close();
	}

	static float aumento(float sueldo, int porc) {
		return sueldo + (sueldo * porc / 100);
	}

}

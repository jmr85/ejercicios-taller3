package ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * Realizar un programa que pida cargar una fecha cualquiera, luego
	 * verificar si dicha fecha corresponde a navidad.
	 */
	public static void main(String[] args) {
		int dia, mes, año;

		Scanner sc = new Scanner(System.in);

		System.out.println("***** INGRESE FECHA PARA SABER SI CORRESPONDE A NAVIDAD *****");
		System.out.print("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese año: ");
		año = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

		Calendar calendar = new GregorianCalendar(año, mes - 1, dia);

		if (dia == 25 && mes == 12)
			System.out.print("La fecha: " + sdf.format(calendar.getTime()) + " es navidad");
		else
			System.out.print("La fecha: " + sdf.format(calendar.getTime()) + " NO es navidad");

		sc.close();
	}

}

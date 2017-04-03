package ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio6 {
	/* Ejercicio6:  Se carga una fecha (día mes año) por teclado, mostrar un mensaje 
	 * que diga fecha correcta si corresponde al primer trimestre del año.  */
	public static void main(String[] args) {
		int dia, mes, año;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese año: ");
		año = sc.nextInt();
		
		
		if(mes >= 0 && mes <= 2){
			System.out.println("La fecha corresponde al primer trimestre del año");
		}else{
			System.out.println("La fecha NO corresponde al primer trimestre del año");
		}
		
		sc.close();
		
		
	}

}

package ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio6 {
	/* Ejercicio6:  Se carga una fecha (d�a mes a�o) por teclado, mostrar un mensaje 
	 * que diga fecha correcta si corresponde al primer trimestre del a�o.  */
	public static void main(String[] args) {
		int dia, mes, a�o;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese a�o: ");
		a�o = sc.nextInt();
		
		
		if(mes >= 0 && mes <= 2){
			System.out.println("La fecha corresponde al primer trimestre del a�o");
		}else{
			System.out.println("La fecha NO corresponde al primer trimestre del a�o");
		}
		
		sc.close();
		
		
	}

}

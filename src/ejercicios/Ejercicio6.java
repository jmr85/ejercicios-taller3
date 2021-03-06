package ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio6 {
	/* Ejercicio6:  Se carga una fecha (d�a mes a�o) por teclado, mostrar un mensaje 
	 * que diga fecha correcta si corresponde al primer trimestre del a�o.  */
	public static void main(String[] args) {
		int dia, mes, a�o;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***** PARA SABER SI LA FECHA ES DEL PRIMER TRIMESTRE *****");
		System.out.print("Ingrese dia: ");
		dia = sc.nextInt();
		System.out.print("Ingrese mes: ");
		mes = sc.nextInt();
		System.out.print("Ingrese a�o: ");
		a�o = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");

		Calendar calendar = new GregorianCalendar(a�o, mes - 1, dia);
		
		if(mes >= 0 && mes <= 2){
			System.out.println("La fecha " + sdf.format(calendar.getTime())+ " corresponde al primer trimestre del a�o");
		}else{
			System.out.println("La fecha "+ sdf.format(calendar.getTime()) +" NO corresponde al primer trimestre del a�o");
		}
		
		sc.close();
		
	}

}

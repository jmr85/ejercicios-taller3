package ejercicios;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que solicite ingresar 10 notas de 20 alumnos y
		 * nos informe cuantos tienen notas mayores o iguales a 7 y cuantos
		 * menores.
		 */
		String nombre;
		float nota;
		System.out.println("********** Ingresar Notas de Alumnos ******************");
		
		Scanner sc = new Scanner(System.in);

		Hashtable<String, Float> notasAlumnos = new Hashtable<>();
		Hashtable<String, Float> notasBajas = new Hashtable<>();
		
		for (int i = 1; i <= 10; i++) {	
			System.out.print("Ingrese nombre: ");
			nombre = sc.next();
			System.out.print("Ingrese la nota: ");
			nota = sc.nextFloat();
			notasAlumnos.put(nombre, nota);
		}
		String aux;
		Enumeration<String> keys = notasAlumnos.keys();
		 
		System.out.println("****** Notas mayores o iguales a 7 *******");
		while(keys.hasMoreElements()){
			aux = keys.nextElement();
			if(notasAlumnos.get(aux) >= 7){
				System.out.println("Alumno: " + aux + ", Nota: " + notasAlumnos.get(aux));
			}else{
				notasBajas.put(aux, notasAlumnos.get(aux));
			}
			
		}
		System.out.println("****** Notas menores a 7 *******");
		Enumeration<String> keys2 = notasBajas.keys();
		while(keys2.hasMoreElements()){
			aux = keys2.nextElement();	
			System.out.println("Alumno: " + aux + ", Nota: " + notasBajas.get(aux));
		}
		
		sc.close();
	}

}

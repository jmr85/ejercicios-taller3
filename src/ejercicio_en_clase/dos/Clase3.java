package ejercicio_en_clase.dos;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		Clase1 clase1 = new Clase1();
		Clase2 clase2 = new Clase2();
		
		System.out.println("Ingrese un valor: ");
		valor = sc.nextInt();
		
		if( valor > 6){
			System.out.println(clase1.resta());
		}else{
			System.out.println(clase2.mostrarNombre());
		}
		
		sc.close();

	}

}

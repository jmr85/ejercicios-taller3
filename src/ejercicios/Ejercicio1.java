package ejercicios;

public class Ejercicio1 {
	/* Ejercicio1: Juan gana 100$, pedro gana 200$, el costo de la hora es 10$  
	 * 1) mostrar el sueldo que sea más alto  2) quien trabaja menos horas  
	 * 3) mostrar la suma de los sueldos   */
	public static void main(String[] args) {

		String a = "Juan";
		String b = "Pedro";

		int gana1 = 100;
		int gana2 = 200;

		/* 1) mostrar el sueldo que sea más alto */
		if (gana1 > gana2)
			System.out.println("El sueldo mas alto es de $" + gana1 + " de " + a);
		else
			System.out.println("El sueldo mas alto es de $" + gana2 + " de " + b);

		int hora1 = gana1 / 10;
		int hora2 = gana2 / 10;
		
		/* 2) quien trabaja menos horas */
		if (hora1 < hora2)
			System.out.println("Trabaja menos horas el empleado " + a + " con "+ hora1 + " Hs");
		else
			System.out.println("Trabaja menos horas el empleado " + b + " con "+ hora2 + " Hs");
		/* 3) mostrar la suma de los sueldos */
		int suma = gana1 + gana2;
		System.out.println("La suma de los sueldos es $" + suma);
	}

}

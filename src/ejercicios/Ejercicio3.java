package ejercicios;

public class Ejercicio3 {
/* Ejercicio3: A1=1000, A2=500, A3=700, A4=1000 Realizar el producto de cada variable
 *  (ósea multiplicar por 2) después preguntar si A1 mas A2 es mayor que A3 mas A4,
 *   si es mayor ponemos el valor de A1 y A2 (por separado), si no es mayor 
 *   (ósea menor o igual) ponemos el valor de A3 y A4. Indicar que valor es el  menor (de los 4). */
	public static void main(String[] args) {

		/* calculo el producto */
		int A1 = 1000 * 2;
		int A2 = 500 * 2;
		int A3 = 700 * 2;
		int A4 = 1000 * 2;
		/* calculo si suma1 es mayor que suma2 */

		int suma1 = A1 + A2;
		int suma2 = A3 + A4;

		/* comparo las sumas1 0 la suma2 si es mayor o no */
		if (suma1 > suma2) {
			System.out.println("La suma de los valores  mayores: " + A1+" y "+ A2 +" es Mayor");
		} else {
			System.out.println("La suma de los valores  menores:  " + A3 + " y " + A4 +" es Mayor");
		}

		/* Indicar que valor es el  menor (de los 4) */
		
		int menor = A1;
		if(A1 < A2)
			menor = A1;
		if(A1 > A2)
			menor = A2;
		if(menor > A3)
			menor = A3;
		if(menor > A4)
			menor = A4; 
		
		System.out.println("El menor es " + menor);
	}

}

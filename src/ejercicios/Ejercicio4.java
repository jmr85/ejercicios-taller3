package ejercicios;

public class Ejercicio4 {
/* Ejercicio4: Total preguntas=50, preguntas correctas=30 sacar el porcentaje de Preguntas
 *  contestadas correctamente si el porcentaje es mayor igual a 90,
 *   visualizamos "nivel máximo" si esta entre 75 y 89 visualizamos nivel medio"
 *    si esta entre 50 y 74 visualizamos "nivel regular" y si es menor a 50 visualizamos "nivel bajo".*/
	public static void main(String[] args) {
		int preguntas, pregcorrecta, porcentaje;
		preguntas = 50;
		pregcorrecta = 30;

		/* calcular el porcentaje de preguntas correctamente */
		porcentaje = (100 / preguntas) * pregcorrecta;

		System.out.println("Valor de porcentaje: " + porcentaje);
		System.out.println("El porcentaje de preguntas contestadas correctamente: " + porcentaje);

		/* comparamos valores de preguntas */

		int mayor = 90;

		if (porcentaje >= mayor) {
			System.out.println("Nivel maximo");
		}
		else if ((porcentaje >= 75) && (porcentaje < 89)) {
			System.out.println("Nivel medio");
		}
		else if ((porcentaje >= 50) && (porcentaje < 74)) {
			System.out.println("Nivel regular");
		} else {
			System.out.println("Nivel bajo");
		}

	}

}

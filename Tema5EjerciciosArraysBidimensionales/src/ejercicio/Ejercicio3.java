package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int tabla[][] = new int[4][5];

		int notaMinima = 10;// Nota minima inicializada a 10 que es la maxima posible

		int notaMaxima = 0;// nota maxima inicializada a 0 que es la minima posible

		int notaMedia = 0;// nota medai inicializada a 0 para usar en bucle

		Scanner dogma = new Scanner(System.in);

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {
			// mensaje por pantalla personalizado con valor de posicion actual de eje y +1
			System.out.println("Introduzca las notas del Alumno " + (i + 1) + ": ");

			// bucle for para recorrer eje x de array tabla
			// tabla[0].length indica longitud de eje x en posicion 0 de eje y
			// entre los corchetes puede ir cualquier valor solo ha de estar relleno
			// para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

				// doy a array tabla posicion eje y = i eje x = j valor igual a
				// siguienteentrada de datos por teclado
				tabla[i][j] = dogma.nextInt();
			}
		}

		dogma.close();

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {

			// hago println de array tabla en posicion de eje y con valor i
			// lo cual hara print de el eje x con todas sus posiciones en cada linea
			// mensaje por pantalla personalizado con valor de alumno igual a posicion
			// actual de eje y +1
			System.out.print("Las notas del Alumno " + (i + 1) + " son: ");
			System.out.println(Arrays.toString(tabla[i]));
		}

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {

			// bucle for para recorrer eje x de array tabla
			// tabla[0].length indica longitud de eje x en posicion 0 de eje y
			// entre los corchetes puede ir cualquier valor solo ha de estar relleno
			// para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

				// compruebo si el valor del elemento de posicion j en fila i es menor a
				// notaMinima
				if (tabla[i][j] < notaMinima) {
					// de serlo doy notaMinima el valor de dicho elemento
					notaMinima = tabla[i][j];

					// compruebo si el valor del elemento de posicion j en fila i es menor a
					// notaMaxima
				} else if (tabla[i][j] > notaMaxima) {
					// de serlo doy notaMaxima el valor de dicho elemento
					notaMaxima = tabla[i][j];
				}

				// almaceno en noMedia el valor del elemento contenido en eje y i eje x j
				notaMedia += tabla[i][j];
			}

			// doy a notaMedia valor igual a todas las notas guardadas con anterioridad
			// dividido entre longitud de eje x y le aplico casting a tipo int
			notaMedia = (int) (notaMedia / tabla[0].length);

			// hago multiples prints mostrando notaMinima, notaMaxima y notaMedia
			// mensaje por pantalla personalizado con valor de alumno igual a posicion
			// actual de eje y +1
			System.out.println();
			System.out.println("La nota minima del Alumno " + (i + 1) + " es: " + notaMinima);
			System.out.println("La nota maxima del Alumno " + (i + 1) + " es: " + notaMaxima);
			System.out.println("La nota media del Alumno " + (i + 1) + " es: " + notaMedia);
			System.out.println();

			// reinicio los valores de notaMinima, notaMaxima y notaMedia a sus valores
			// antes del bucle para poder usarlos correctamente en la siguiente iteracion
			notaMinima = 10;
			notaMaxima = 0;
			notaMedia = 0;
		}

	}

}

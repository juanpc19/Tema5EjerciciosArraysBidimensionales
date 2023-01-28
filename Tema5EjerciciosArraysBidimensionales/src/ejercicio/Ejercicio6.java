package ejercicio;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {

		int tabla[][] = new int[6][10];

		int minimo = 1000;// variable donde guardare el valor mas pequeño del array

		int filaMinimo = 0;// variable donde guardare el valor numerico de la fila donde se encuentra
							// minimo

		int columnaMinimo = 0;// variable donde guardare el valor numerico de la columna donde se encuentra
								// minimo

		int maximo = 0; // variable donde guardare el valor mas grande del array

		int filaMaximo = 0;// variable donde guardare el valor numerico de la fila donde se encuentra
							// maximo

		int columnaMaximo = 0;// variable donde guardare el valor numerico de la columna donde se encuentra
								// maximo

		// bucle for para recorrer eje y de array tabla
		for (int fila = 0; fila < tabla.length; fila++) {

			// bucle for para recorrer eje x de array tabla
			for (int columna = 0; columna < tabla[0].length; columna++) {

				// doy a posicion tabla[fila][columna] de array tabla valor igual a un numero
				// aleatorio entre 0 y 1000
				tabla[fila][columna] = (int) (Math.random() * 1001);
			}
		}

		// bucle for para recorrer array mostrando sus elementos por pantalla
		for (int fila = 0; fila < tabla.length; fila++) {
			// hago print de cada fila en diferentes lineas
			System.out.println(Arrays.toString(tabla[fila]));
		}

		// bucle for para recorrer eje y de array tabla
		for (int fila = 0; fila < tabla.length; fila++) {

			// bucle for para recorrer eje x de array tabla
			for (int columna = 0; columna < tabla[0].length; columna++) {

				// si el valor del elemento en la posicion indicada es menor a minimo
				if (tabla[fila][columna] < minimo) {
					// minimo toma el valor de este
					minimo = tabla[fila][columna];
					// filaMinimo guarda el valor numerico de fila en el que ha sido encontrado
					filaMinimo = fila;
					// y columnaMinimo guarda el valor numerico de columna en el que ha sido
					// encontrado
					columnaMinimo = columna;
				}
				// si el valor del elemento en la posicion indicada es mayor a maximo
				if (tabla[fila][columna] > maximo) {
					// maximo toma el valor de este
					maximo = tabla[fila][columna];
					// filaMaximo guarda el valor numerico de fila en el que ha sido encontrado
					filaMaximo = fila;
					// y columnaMaximo guarda el valor numerico de columna en el que ha sido
					// encontrado
					columnaMaximo = columna;
				}
			}
		}

		// salto de linea para mejor visualizacion
		System.out.println();

		// print de mensaje mostrando el valor minimo y su posicion en el array mediante
		// fila y columna
		System.out.println(
				"El valor minimo es: " + minimo + " y esta en la fila " + filaMinimo + " columna " + columnaMinimo);

		// print de mensaje mostrando el valor maximo y su posicion en el array mediante
		// fila y columna
		System.out.println(
				"El valor maximo es: " + maximo + " y esta en la fila " + filaMaximo + " columna " + columnaMaximo);

	}

}

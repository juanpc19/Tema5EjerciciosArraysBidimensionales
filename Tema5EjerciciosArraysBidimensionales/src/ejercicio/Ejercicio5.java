package ejercicio;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tabla[][] = new int[5][6];

		int sumaFilas = 0; // variable donde guardare el valor del elemento filas del array tabla

		int sumaColumnas = 0;// variable donde guardare el valor del elemento columna del array tabla

		int total = 0; // variable donde guardare valores de sumaColumnas y sumaFilas
		// al final de cada fila recorrida y de cada columna recorrida

		// los dos siguientes bucles for recorreran una fila horizontalmente por
		// completo antes de pasar a la siguiente fila
		// dando valores aleatorios a todas las posiciones excepto la ultima de cada
		// fila
		// y excepto la ultima fila al completo

		// bucle for para recorrer el eje y del array tabla
		// que no recorrera la ultima fila del array, esto lo haran otros dos bucles
		for (int fila = 0; fila < tabla.length - 1; fila++) {

			// bucle for para recorrer el eje x del array tabla
			for (int columna = 0; columna < tabla[0].length; columna++) {

				// mientras columna de una posicion menor a la ultima de la fila
				if (columna < tabla[0].length - 1) {
					// le doy al elemento tabla[fila][columna] un valor aleatorio entre 100 y 999
					// 1000-100 sera el maximo 999 y + 100 el minimo 100
					tabla[fila][columna] = (int) (Math.random() * (1000 - 100) + 100);
					// y añado dicho valor aleatorio a sumaParcialFila
					sumaFilas += tabla[fila][columna];

					// cuando columna de posicion igual a ultima de la fila
				} else {
					// doy a esta ultima columna valor igual a variable sumaFilas
					tabla[fila][columna] = sumaFilas;
				}
			}
			// cada vez que complete una fila con sus valores añado el valor de
			// sumaFilas a total
			total += sumaFilas;
			// y reinicio valor de sumaFilas a 0 al final de bucle anidado
			// para usarla de nuevo cuando vuelva a entrar al bucle anidado
			sumaFilas = 0;
		}

		// bucle for para imprimir array y ver progreso
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

		// los dos siguientes bucles for recorreran una columna verticalmente por
		// completo antes de pasar a la siguiente columna
		// dando valor a la ultima posicion de cada columna

		// bucle for para recorrer el eje x del array tabla
		for (int columna = 0; columna < tabla[0].length; columna++) {

			// bucle for para recorrer el eje y del array tabla
			for (int fila = 0; fila < tabla.length; fila++) {

				// voy sumando a sumaColumnas el valor del elemento en la posicion dada
				// en cada iteracion
				sumaColumnas += tabla[fila][columna];

				// al llegar a la ultima fila
				if (fila == tabla.length - 1) {
					// doy al elemento en posicion tabla[fila][columna] un valor igual a
					// sumaColumnas
					tabla[fila][columna] = sumaColumnas;
				}

				// al llegar a la ultima columna de la ultima fila
				if ((fila == tabla.length - 1) && (columna == tabla[0].length - 1)) {
					// doy a dicha posicion valor igual a total
					tabla[fila][columna] = total;
				}

			}
			// al llegar al final de la columna añado el valor sumaColumnas a total
			total += sumaColumnas;
			// y reinicio valor de sumaColumnas a 0 al final de bucle anidado
			// para usarla de nuevo cuando vuelva a entrar al bucle anidado
			sumaColumnas = 0;

		}

		// salto de linea para mayor claridad
		System.out.println();

		// bucle for para imprimir array y ver resultado final
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

	}

}

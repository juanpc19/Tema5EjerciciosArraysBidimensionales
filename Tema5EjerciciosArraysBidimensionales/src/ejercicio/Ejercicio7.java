package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int matrizA[][] = new int[4][4];

		int matrizB[][] = new int[4][4];

		int auxiliar = 0;// variable donde guardare

		Scanner dogma = new Scanner(System.in);

		// bucle para recorrer array matrizA en horizontal ([fila][columna]) dandole
		// valor a sus elementos
		// igual al introducido por teclado
		for (int fila = 0; fila < matrizA.length; fila++) {

			for (int columna = 0; columna < matrizA[0].length; columna++) {

				System.out.println("Introduzca valor para el siguiente elemento: ");
				matrizA[fila][columna] = dogma.nextInt();
			}

		}

		dogma.close();

		// print de array
		for (int fila = 0; fila < matrizA.length; fila++) {
			System.out.println(Arrays.toString(matrizA[fila]));
		}

		// print para espacio
		System.out.println();

		// bucle para recorrer array matrizB en vertical ([columna][fila])
		// lo usare para transponer la matrizA y copiarla en la matrizB
		for (int columna = 0; columna < matrizA.length; columna++) {

			for (int fila = 0; fila < matrizA.length; fila++) {

				// dandole valor a sus elementos igual a el valor almacenado en matrizA con
				// sus posiciones siendo invertidas a las de matrizB (matrizA[fila][columna])
				matrizB[columna][fila] = matrizA[fila][columna];

			}
			// print de fila una vez asignado valor a sus elementos
			System.out.println(Arrays.toString(matrizB[columna]));
		}

		// print para espacio
		System.out.println();

		// bucle para recorrer matrizA en vertical ([columna][fila])
		// que usare para transponer la matrizA sin usar otro array (matrizB)
		for (int columna = 0; columna < matrizA.length; columna++) {

			for (int fila = columna; fila < matrizA[0].length; fila++) {

				// guardo en auxiliar valor del elemento en la posicion actual
				// para no perderlo al macharlo en la siguiente linea de codigo
				auxiliar = matrizA[fila][columna];

				// doy a elemento en posicion [fila][columna] valor de elemento en posicion
				// [columna][fila]
				matrizA[fila][columna] = matrizA[columna][fila];

				// doy a elemento en posicion [columna][fila] valor previamente guardado en
				// auxiliar
				matrizA[columna][fila] = auxiliar;

			}

		}

		// print de array matrizA
		for (int fila = 0; fila < matrizA.length; fila++) {
			System.out.println(Arrays.toString(matrizA[fila]));
		}

	}

}

package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int matrizA[][] = new int[4][4];

		int matrizB[][] = new int[4][4];

		int auxiliar = 0;

		Scanner dogma = new Scanner(System.in);

		for (int fila = 0; fila < matrizA.length; fila++) {

			for (int columna = 0; columna < matrizA[0].length; columna++) {

				System.out.println("Introduzca valor para el siguiente elemento: ");
				matrizA[fila][columna] = dogma.nextInt();
			}
		}

		dogma.close();

		for (int fila = 0; fila < matrizA.length; fila++) {
			System.out.println(Arrays.toString(matrizA[fila]));
		}

		System.out.println();
		for (int columna = 0; columna < matrizA.length; columna++) {

			for (int fila = 0; fila < matrizA.length; fila++) {

				matrizB[columna][fila] = matrizA[fila][columna];

			}
			System.out.println(Arrays.toString(matrizB[columna]));
		}

		System.out.println();

		for (int columna = 0; columna < matrizA.length; columna++) {

			for (int fila = columna; fila < matrizA[0].length; fila++) {

				auxiliar = matrizA[fila][columna];

				matrizA[fila][columna] = matrizA[columna][fila];

				matrizA[columna][fila] = auxiliar;

			}

		}

		for (int fila = 0; fila < matrizA.length; fila++) {
			System.out.println(Arrays.toString(matrizA[fila]));
		}

	}

}

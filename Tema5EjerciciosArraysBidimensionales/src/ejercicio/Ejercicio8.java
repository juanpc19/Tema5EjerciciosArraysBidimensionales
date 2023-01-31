package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];

		boolean simetrica = false;

		// bucle for para generar matriz con valores aleatoris del 0 al 10
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				matriz[fila][columna] = (int) (Math.random() * 11);

			}

		}

		// genera matriz a mano para comprobacion
		/*
		 * Scanner dogma=new Scanner (System.in); for (int fila = 0; fila <
		 * matriz.length; fila++) {
		 * 
		 * for (int columna = 0; columna < matriz[fila].length; columna++) {
		 * System.out.println("introduzca numero"); matriz[fila][columna] =
		 * dogma.nextInt();
		 * 
		 * } System.out.println("siguiente linea"); } dogma.close();
		 */

		// print de matriz
		for (int fila = 0; fila < matriz.length; fila++) {

			System.out.println(Arrays.toString(matriz[fila]));
		}

		// recorre array comprobando si la matriz es simetrica o no partiendo de que no
		// lo es y cambiando boleana simetrica en caso de que lo sea o no
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				// comprobacion de elemento de una celda igual al de su "opuesta"
				if (matriz[fila][columna] == matriz[columna][fila]) {
					simetrica = true;
					// de no ser iguales
				} else {
					simetrica = false;
					break;

				}

			}

		}

		// ternario evalua estado simetrica y devuelve respuesta acorde
		System.out.println(simetrica ? "Es simetrica." : "No es simetrica.");

	}

}

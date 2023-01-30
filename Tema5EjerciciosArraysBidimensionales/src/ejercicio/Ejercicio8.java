package ejercicio;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				matriz[fila][columna] = (int) (Math.random() * 10);

			}

		}

		for (int fila = 0; fila < matriz.length; fila++) {

			System.out.println(Arrays.toString(matriz[fila]));
		}

		// mirar 7 y imagen matriz simetrica, crear boleana para evañluear mensaje al
		// final de comprobar todas las posiciones

	}

}

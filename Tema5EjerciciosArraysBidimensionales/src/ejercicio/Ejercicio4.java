package ejercicio;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {

		int num[][] = new int[3][6];

		// asigno valor a elementos dentro del array bidimensional de forma manual
		num[0][0] = 0;

		num[0][1] = 30;

		num[0][2] = 2;

		num[0][5] = 5;

		num[1][0] = 75;

		num[1][4] = 0;

		num[2][2] = -2;

		num[2][3] = 9;

		num[2][5] = 11;

		// bucle for para recorrer las filas y hacer print de cada una de ellas
		for (int i = 0; i < num.length; i++) {
			System.out.println(Arrays.toString(num[i]));
		}

	}

}

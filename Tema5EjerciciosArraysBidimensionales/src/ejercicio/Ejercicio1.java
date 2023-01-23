package ejercicio;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla[][] = new int[5][5];

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {

			// bucle for para recorrer eje x de array tabla
			//tabla[0].length indica longitud de eje x en posicion 0 de eje y
			//entre los corchetes puede ir cualquier valor solo ha de estar relleno
			//para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

				// doy a array tabla posicion eje y = i eje x = j valor igual a
				// la suma de sus posiciones bidimensionales (eje y, eje x)
				// multiplicadas por 10
				tabla[i][j] = 10 * (i + j);
			}
		}

		// bucle for para recorrer array tabla
		for (int i = 0; i < tabla.length; i++) {

			// hago println de array tabla en posicion de eje y con valor i
			// lo cual hara print de el eje x con todas sus posiciones en cada linea
			System.out.println(Arrays.toString(tabla[i]));

		}

	}

}

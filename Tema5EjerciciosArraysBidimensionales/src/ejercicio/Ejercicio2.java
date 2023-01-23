package ejercicio;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		int tabla[][] = new int[10][10];

		int factor1 = 1;// guarda numero tabla, 1x, 2x, 3x...

		int factor2 = 1;// guarda factor con el que multiplicar, x1, x2, x3...

		int producto = factor1 * factor2;// guarda resultado multiplicacion

		// bucle for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {

			// bucle for para recorrer eje x de array tabla
			//tabla[0].length indica longitud de eje x en posicion 0 de eje y
			//entre los corchetes puede ir cualquier valor solo ha de estar relleno
			//para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

				// calculo el valor actual de producto multiplicando factor1 por factor2
				producto = factor1 * factor2;
				// doy a array tabla posicion eje y = i eje x = j valor igual a producto
				tabla[i][j] = producto;
				// incremento valor de factor2 en +1
				factor2++;
			}

			// incremento valor de factor1 en +1
			factor1++;
			// "reinicio"valor de factor2 a 1
			factor2 = 1;
		}

		// bucle for para recorrer array tabla
		for (int i = 0; i < tabla.length; i++) {

			// hago println de array tabla en posicion de eje y con valor i
			// lo cual hara print de el eje x con todas sus posiciones en cada linea
			System.out.println(Arrays.toString(tabla[i]));
		}

	}

}

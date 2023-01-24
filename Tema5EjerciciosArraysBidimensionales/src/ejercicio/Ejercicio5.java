package ejercicio;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		// creo el array uno mas largo para poner sumatorios de ejex y y eje x hacer
		// condicion dentro de bucles para ultimas posiciones y otra para ultima
		// posicion
		int tabla[][] = new int[5][6];

		int sumaParcialFila = 0;

		int sumaParcialColumna = 0;

		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {

				tabla[i][j] = (int) (Math.random() * (1000 - 100) + 100);
				// mientras j no llegue a ultima celda añado valor de j a sumaParcialFila
				if (j < tabla[0].length - 1) {
					sumaParcialFila += tabla[i][j];

				} else {
					tabla[i][j] = sumaParcialFila;
				}
			}
			// reinicio valor de sumaParcialFila a 0 al final de bucle anidado
			sumaParcialFila = 0;
		}

		// para ver arrays
		for (int e = 0; e < tabla.length; e++) {
			System.out.println(Arrays.toString(tabla[e]));
		}
	}

}

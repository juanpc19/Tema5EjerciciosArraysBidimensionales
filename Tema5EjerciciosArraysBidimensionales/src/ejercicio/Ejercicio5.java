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

		for (int fila = 0; fila < tabla.length-1; fila++) {

			for (int columna = 0; columna < tabla[0].length; columna++) {

				tabla[fila][columna] = (int) (Math.random() * (1000 - 100) + 100);
				// mientras columna no llegue a ultima celda añado valor de columna a
				// sumaParcialFila
				if (columna < tabla[0].length - 1) {
					sumaParcialFila += tabla[fila][columna];

				} else {
					tabla[fila][columna] = sumaParcialFila;
				}
			}
			// reinicio valor de sumaParcialFila a 0 al final de bucle anidado
			sumaParcialFila = 0;
		}

		// para ver arrays
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

		
		//recorrer todas las columnas de la fila dada
		for (int columna = 0; columna < ; columna++) {

			for (int fila=i, fila=i; columna < fila; columna++) {

				if (fila ==tabla.length-1) {
					tabla[fila][columna]=sumaParcialColumna;
				}
				sumaParcialColumna+=tabla[fila][columna];
				
			}
		}

	}

}

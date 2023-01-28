package ejercicio;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		// creo el array uno mas largo para poner sumatorios de ejex y y eje x hacer
		// condicion dentro de bucles para ultimas posiciones y otra para ultima
		// posicion
		int tabla[][] = new int[5][6];

		int sumaFilas = 0;

		int sumaColumnas = 0;

		int total = 0;

		for (int fila = 0; fila < tabla.length - 1; fila++) {

			for (int columna = 0; columna < tabla[0].length; columna++) {

				if (columna < tabla[0].length - 1) {
					tabla[fila][columna] = (int) (Math.random() * (1000 - 100) + 100);
					// mientras columna no llegue a ultima celda añado valor de columna a
					// sumaParcialFila
					sumaFilas += tabla[fila][columna];

				} else {
					tabla[fila][columna] = sumaFilas;
				}

				// sumaFilasTotal+=sumaFilas;
			}

			total += sumaFilas;
			// reinicio valor de sumaParcialFila a 0 al final de bucle anidado
			sumaFilas = 0;
		}

		// para ver arrays
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

		// recorrer todas las columnas de la fila dada
		for (int columna = 0; columna < tabla[0].length; columna++) {

			for (int fila = 0; fila < tabla.length; fila++) {

				sumaColumnas += tabla[fila][columna];

				if (fila == tabla.length - 1) {
					
					tabla[fila][columna] = sumaColumnas;
				
					
				}

				if ((fila == tabla.length - 1) && (columna == tabla[0].length - 1)) {
					tabla[fila][columna] = total;
				}

			}

			total += sumaColumnas;
			//
			sumaColumnas = 0;

		}

		System.out.println();
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

	}

}

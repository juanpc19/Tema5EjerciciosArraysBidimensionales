package ejercicio;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {

		// creo el array uno mas largo para poner sumatorios de ejex y y eje x hacer
		// condicion dentro de bucles para ultimas posiciones y otra para ultima
		// posicion
		int tabla[][] = new int[5][6];

		int sumaFilas = 0;

		int sumaFilasTotal = 0;//para usar sumaParcialFila en siguentes bucles
		
		int sumaColumnas = 0;
		
		int sumaColumnasTotal = 0;

		for (int fila = 0; fila < tabla.length - 1; fila++) {

			for (int columna = 0; columna < tabla[0].length; columna++) {

				tabla[fila][columna] = (int) (Math.random() * (1000 - 100) + 100);
				// mientras columna no llegue a ultima celda añado valor de columna a
				// sumaParcialFila
				if (columna < tabla[0].length - 1) {
					sumaFilas += tabla[fila][columna];

				} else {
					tabla[fila][columna] = sumaFilas;
				}
				
				sumaFilasTotal+=sumaFilas;
			}
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
				
				if (fila == tabla.length - 1) {
					tabla[fila][columna] = sumaColumnasTotal;
				}
				
				sumaColumnasTotal += tabla[fila][columna];
				
				if ((fila== tabla.length-1) && (columna==tabla[0].length-1)) {
					tabla[fila][columna] = sumaColumnasTotal+sumaFilasTotal;
				}
			}
		
			sumaColumnasTotal=0;

		}
		
		System.out.println();
		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

	}

}

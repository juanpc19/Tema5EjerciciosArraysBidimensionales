package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int matriz[][] = new int[5][5];

		boolean simetrica = false;

		
		Scanner dogma=new Scanner (System.in);
		
		// genera matriz aleatoria
		/*for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				matriz[fila][columna] = (int) (Math.random() * 10);

			}

		}

		*/
		//meter a mano una matriz simetrica para comprobar funcionamiento
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.println("introduzca numero");
				matriz[fila][columna] = dogma.nextInt();

			}
			System.out.println("siguiente linea");
		}
		
		// print amatriz
		for (int fila = 0; fila < matriz.length; fila++) {

			System.out.println(Arrays.toString(matriz[fila]));
		}

		// recorre array comprobando si es simetrico partiendo de que no lo es
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				// si se da cambia a que si es simetrica
				if (matriz[fila][columna] == matriz[columna][fila]) {
					simetrica = true;
					// sino permanece false
				} else {
					simetrica = false;
					break;

				}

			}

		}

		// ternario evalua estado simetrica y devuelve respuesta
		System.out.println(simetrica ? "Es simetrica." : "No es simetrica.");

	}

}

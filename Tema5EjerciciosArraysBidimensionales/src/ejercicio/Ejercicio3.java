package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int tabla[][] = new int[4][5];

		int alumno = 1;
		
		int notaMinima=10;
		
		int notaMaxima=0;
		
		int notaMedia=0;

		Scanner dogma = new Scanner(System.in);

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca las notas del Alumno" + (alumno) + ": ");

			// bucle for para recorrer eje x de array tabla
			//tabla[0].length indica longitud de eje x en posicion 0 de eje y
			//entre los corchetes puede ir cualquier valor solo ha de estar relleno
			//para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

				// doy a array tabla posicion eje y = i eje x = j valor igual a
				// la suma de sus posiciones bidimensionales (eje y, eje x)
				// multiplicadas por 10
				tabla[i][j] = dogma.nextInt();	
			}
			alumno++;
		}

		dogma.close();

		for (int i = 0; i < tabla.length; i++) {

			// hago println de array tabla en posicion de eje y con valor i
			// lo cual hara print de el eje x con todas sus posiciones en cada linea
			System.out.println(Arrays.toString(tabla[i]));
		}

		// for para recorrer eje y de array tabla
		for (int i = 0; i < tabla.length; i++) {
			
			

			// bucle for para recorrer eje x de array tabla
			//tabla[0].length indica longitud de eje x en posicion 0 de eje y
			//entre los corchetes puede ir cualquier valor solo ha de estar relleno
			//para que calcule la longitud del eje x y no del y
			for (int j = 0; j < tabla[0].length; j++) {

								
				if (tabla[i][j]<notaMinima) {
					
				}
				notaMinima=tabla[i][j];
			}
			
			System.out.println("La nota minima del Alumno" + (alumno) + "es: ");
			System.out.println("La nota maxima del Alumno" + (alumno) + "es: ");
			System.out.println("La nota media del Alumno" + (alumno) + "es: ");
			
			alumno++;
		
			notaMinima=10;
			notaMaxima=0;
			notaMedia=0;
			
		}

		
		
	}

}

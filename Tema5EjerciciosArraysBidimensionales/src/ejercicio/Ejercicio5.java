package ejercicio;

public class Ejercicio5 {

	public static void main(String[] args) {

		// creo el array uno mas largo para poner sumatorios de ejex y y eje x hacer
		// condicion dentro de bucles para ultimas posiciones y otra para ultima
		// posicion
		int tabla[][] = new int[4][7];

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				// (Math.random()*(1000-100)+100); para numero entre 999 y 100
				// 1000-100 = maximo (1000 seria 999 porque devuelve 1 menos)
				// +100 seria el minimo
				// lo uso para dar valor al elemento en posicion i eje y j eje x
				tabla[i][j] = (int) (Math.random() * (1000 - 100) + 100);
			}

		}

	}

}

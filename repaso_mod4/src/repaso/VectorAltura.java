package Repasos;
//5 personas , indicar altura, el promedio , la mas alta y baja

import java.util.Scanner;

public class VectorAltura {

	private Scanner tecladoScanner;
	private float[] alturas;
	private float promedio;

	public void cargar() {
		tecladoScanner = new Scanner(System.in);
		alturas = new float[5];

		for (int f = 0; f < 5; f++) {
			System.out.println("Ingresar Altura: ");
			alturas[f] = tecladoScanner.nextFloat();
		}
	}

	public void calcularPromedio() {
		float suma;
		suma = 0;
		for (int f = 0; f < 5; f++) {
			suma = suma + alturas[f];
		}
		promedio = suma / 5;
		System.out.println("La altura promedio de 5 personas es: " + promedio);

	}

	public void altaBaja() {
		int alta, baja;
		alta = 0;
		baja = 0;
		for (int f = 0; f < 5; f++) {
			if (alturas[f] > promedio) {
				alta++;
			} else {
				if (alturas[f] < promedio) {
					baja++;
				} else {
				}

			}

		}

		System.out.println("La cantidad de personas altas es:  " + alta);
		System.out.println("La cantidad de personas bajas es: " + baja);
	}

	public static void main(String[] args) {
		VectorAltura Va = new VectorAltura();
		Va.cargar();
		Va.calcularPromedio();
		Va.altaBaja();
	}

}

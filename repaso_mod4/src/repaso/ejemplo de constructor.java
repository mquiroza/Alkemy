package Repasos;

import java.util.Scanner;

public class Constructor {

	// sueldos 5 personas

	/*
	 * 1. tienen el mismo nombre de la clase 2.es el primer metodo que se ejecuta
	 * 3.se debe ejecutar de forma automatica 4.no retorna datos 5 se ejecuta solo 1
	 * vez 6 su objetivo es inicializar atributos
	 */

	private Scanner teclado;
	private int[] sueldos;

	// 1.tienen el mismo nombre de la clase

	public Constructor() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];

		for (int f = 0; f < 5; f++) {
			System.out.print("Ingreso de Monto de Sueldo : $ ");
			sueldos[f] = teclado.nextInt();
		}

	}

	// mostrar

	public void imprimir() {
		for (int f = 0; f < 5; f++) {
			System.out.println(sueldos[f]);
		}
	}

	public static void main(String args[]) {
		Constructor apodoConstructor = new Constructor();
		apodoConstructor.imprimir();
	}

}// fin clase
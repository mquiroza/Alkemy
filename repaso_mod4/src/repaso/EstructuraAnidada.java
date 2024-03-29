package Basicos;

import java.util.Scanner;

public class EstructuraAnidada {

	public static void main(String[] args) {

		// llamar escaner

		Scanner teclado = new Scanner(System.in);

		// declarar
		int num;
		System.out.println("Ingrese un valor de hasta 3 digitos positivos: ");
		num = teclado.nextInt();

		if (num < 10) {
			System.out.println("Tiene 1 digito");
		} else {
			if (num < 100) {
				System.out.println("Tiene 2 digitos");
			} else {
				if (num < 1000) {
					System.out.println("Tiene 3 digitos");

				}
			}

		}
	}

}

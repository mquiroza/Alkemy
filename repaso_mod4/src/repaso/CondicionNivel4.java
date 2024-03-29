package Repasos;

import java.util.Scanner;

public class CondicionNivel4 {

	// 3 nros por teclado con condicion &&
	public static void main(String args[]) {

		Scanner tecladoScanner = new Scanner(System.in);

		// datos
		int num1, num2, num3;

		// capturar datos
		System.out.println("Ingresar primer numero");
		num1 = tecladoScanner.nextInt();

		System.out.println("Ingresar segundo numero");
		num2 = tecladoScanner.nextInt();

		System.out.println("Ingresar tercer numero");
		num3 = tecladoScanner.nextInt();

		// condiciones

		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es: " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("El numero mayor es: " + num2);
			} else {
				System.out.println("El numero mayor es: " + num3);
			}
		}

	}
		
}






















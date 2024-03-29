package Repasos;

import java.util.Scanner;

public class CondicionaNivel3 {

	public static void main(String[] args) {
		
		//ingresar datos por consola
		Scanner teclado = new Scanner(System.in);
		
		//datos que necesito 
		float nota1, nota2, nota3;
		
		//datos que me pide ingresar
		System.out.print("Ingrese primer nota:");
		nota1 = teclado.nextFloat();
		
		System.out.print("Ingrese segunda nota:");
		nota2 = teclado.nextFloat();
		
		System.out.print("Ingrese tercer nota:");
		nota3 = teclado.nextFloat();
		
		//operacion 
		
		float promedio = (nota1 + nota2 + nota3) / 3;
		
		// resultados o decision que tomara nuestros código
		if (promedio >= 7) {
			System.out.print("Promocionado");
		} else {
			if (promedio >= 4) {
				System.out.print("Regular");
			} else {
				System.out.print("Reprobado");
			}
		}
	}

}



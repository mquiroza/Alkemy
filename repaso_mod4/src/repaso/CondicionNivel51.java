package Repasos;

import java.util.Scanner;


public class CondicionNivel51 {

	public static void main(String[] args) {
		// llamar al teclado
		
		Scanner tecladoScanner = new Scanner(System.in);
		
		//datos
		
		int x, nrosIngresar, valor, pares, impares;
		x = 1;
		pares = 0;
		impares = 0;
		
		System.out.println("Cuantos nros ingresaras");
			nrosIngresar=tecladoScanner.nextInt();
			
			//condicion
			while(x<=nrosIngresar) {
				System.out.println("Ingrese el valor");
				valor = tecladoScanner.nextInt();
			
			//resultado
				if (valor%2==0) {
					pares=pares + 1;
				} else {
					impares = impares + 1;
				}
			x = x + 1;
		}
			
			System.out.print("Los nros pares son: ");
			System.out.println(pares);
			System.out.print("Los nros impares son: ");
			System.out.println(impares);
	}

}

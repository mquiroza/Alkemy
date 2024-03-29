package Repasos;

import java.util.Scanner;

public class CondicionNivel7 {

	public static void main(String[] args) {
		// do while= mientras cumpla X funciona
		
		// llamada teclado
		Scanner tecladoScanner = new Scanner(System.in);
		
		//datos
		int nro, suma;
		suma = 0;
		
		//condicion
		do {
			System.out.print( "Ingresar número: ");
			nro=tecladoScanner.nextInt();
			if (nro!=25) {
				suma= suma + nro ;
			}
		} while (nro!=25);
		System.out.println("La suma acumulada es: ");
		System.out.println(suma);
		
		if(suma==0) {
			System.out.println("La suma acumulada es cero ");
		} else {
			if(suma>0) {
				System.out.println("EL nro es positivo");
			} else {
				System.out.println("El nro sumado es negativo");
			}
		}
		
	}

}

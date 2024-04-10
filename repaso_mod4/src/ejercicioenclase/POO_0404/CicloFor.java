package Abril;

import java.util.Scanner;

/*Escribir un programa que lea n números enteros y
calcule la cantidad de valores mayores o iguales a 1000.
Se debe realizar con for, tenemos otras opciones, pero ando mañosa XD*/
public class CicloFor { // inicio clase

	public static void main(String[] args) { // inicio main
		// teclado

		Scanner teclado = new Scanner(System.in);

		// datos
		int cantidad, nros, f, valor;
		cantidad = 0;

		System.out.println("¿Cuantos nros va a ingresar? ");
		nros = teclado.nextInt();

		// condicion u operacion

		for (f = 1; f <= nros; f++) {// inicio for
			System.out.println("Ingrese el nro, sin decimales: ");
			valor = teclado.nextInt();

			if (valor >= 1000) {//inicio if
				cantidad = cantidad + 1;
			}//fin if
		}//fin for
		
		System.out.println("La cantidad de nros ingresados mayores o igual a 1000 son: ");
		System.out.print(cantidad);
	}// fin main

}// fin clase

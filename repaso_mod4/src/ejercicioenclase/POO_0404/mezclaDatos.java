package Abril;

import java.util.Scanner;

// tener nros de distintos tipos y obtener resultados
/*
 * Pasar dolares a peso chileno
 * */

public class mezclaDatos { // inicio clase

	public static void main(String[] args) {// inicio main

		Scanner teclado = new Scanner(System.in);

		// datos

		double pesoClp;
		double dolar;
		double cambioMoneda = 0.011;

		// pedir los datos

		System.out.println("Ingreso monto a cambia CLP: $ ");
		pesoClp = teclado.nextInt();
		
		//operacion o condicion
		
		dolar = pesoClp * cambioMoneda;
		
		//Mostrar o imprimir
		
		System.out.println("Los dolares que recibira son: USD $ " + dolar);
		

	}// fin main
}// fin clase

package Repasos;

import java.util.Scanner;

public class CondicionNivel2 {

	// crear condicion compuesta con 1 if y 1 else
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Declarar varios datos
		int num1, num2;
		
		System.out.println("Ingrese primer nro sin decimales");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese segundo nro sin decimales");
		num2 = teclado.nextInt();
		
		if(num1>num2) {
			System.out.println("El nro mayor es " + num1);
		}else {
			System.out.println("El nro mayor es " + num2);
		}
	}

}

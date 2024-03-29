package Repasos;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class CondicionNivel71 {

	public static void main(String[] args) {
		
		//teclado
		Scanner tecladoScanner = new Scanner(System.in);
		
		//Datos
		int cuenta;
		float saldo, suma;
		suma = 0;
		
		//condicion
		do {
			System.out.println("Ingresar el nro de la cuenta");
			cuenta=tecladoScanner.nextInt();
			
			if(cuenta>0) {
				System.out.println("Ingrese saldo: ");
				saldo=tecladoScanner.nextFloat();
				if(saldo>0) {
					System.out.println("Saldo Positivo");
					suma=suma+saldo;
				}else {
					if(saldo<0) {
						System.out.println("Le debo al banco");
					}else {
						System.out.println("La pobreza me respira en la nuca Marce");
					}
				}
			}
		} while (cuenta>=0);
		System.out.println("Tienes dinero");
		System.out.println(suma);
		

	}

}

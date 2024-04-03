package Repasos;

import java.util.Iterator;

public class CondicionalSwicth {

	public static void main(String[] args) {
		
		//datos
		int cant1 = 0;
		int nro2 = 0;
		int cant3 = 0;
		int nro4 = 0;
		int cant5 = 0;
		int otros = 0;
		
		for(int x = 0; x<100;x++) {
			int valor = (int) (Math.random() *10) + 1;
			
			switch (valor) {
			case 1:
				cant1++;
				break;
				
			case 3:
				cant3++;
				break;
				
			case 5:
				cant5++;
				break;

			default:
				otros++;
			}
		}
		
		System.out.println("cantidad de veces que aparecio el nro 1: " + cant1);
		System.out.println("cantidad de veces que aparecio el nro 1: " + cant3);
		System.out.println("cantidad de veces que aparecio el nro 1: " + cant5);
		System.out.println("cantidad de veces que aparecieron otros nros: " + otros);
			
		
	}

}

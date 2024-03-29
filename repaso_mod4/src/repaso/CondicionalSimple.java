package Basicos;

import java.util.Scanner;

public class CondicionalSimple {
	public static void main(String[] arg) {
		Scanner teclado=new Scanner(System.in);
		float sueldo; //sirve para las monedas que usen decimales ej: dolar
		System.out.println("Ingrese Sueldo: ");
		sueldo = teclado.nextFloat();	
	
		if (sueldo>3000) {
    	    System.out.println("Esta persona debe pagar impuestos");
    	}
	}

}

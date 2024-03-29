package Repasos;

import java.util.Scanner;

public class CondicionalNivel1 {

	public static void main(String[] args) {
		
		// sueldo por impuesto
		//con la linea 11 capturo los datos de la consola
		Scanner entradaDeDato = new Scanner(System.in);
		
		// Declarando datos que necesito
		float sueldo;
		System.out.println("Ingrese su sueldo");
		sueldo = entradaDeDato.nextFloat();
		
		//condicion o operacion
		
		if (sueldo > 5000) {
			System.out.println("Debe pagar impuesto"); //fin
		}
		
			
	}

}

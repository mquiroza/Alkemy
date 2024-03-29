package Basicos;

import java.util.Scanner;

public class PasoNoPaso {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3;
		
		System.out.println("Ingresar primera nota");
		nota1 = teclado.nextInt();
		
		System.out.println("Ingresar segunda nota");
		nota2 = teclado.nextInt();
		
		System.out.println("Ingresar tercera nota");
		nota3 = teclado.nextInt();
		
		int promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio >=7) {
			System.out.println("Felicidades pasaste de curso");
			
		} else {
			if (promedio >=4) {
				System.out.println("Regular // Por los pelos");
				
			} else {
				System.out.println("Reprobado // Por estar en tiktok");
			}
		}
		
	}
	
	
}

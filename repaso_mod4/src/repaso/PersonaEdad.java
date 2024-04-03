package Repasos;

import java.util.Scanner;

//vectores paralelos : 1 vector nombre, 2 vector edad
//mayor de 18 años
public class PersonaEdad {

	private Scanner tecladoScanner;
	private String[] nombres;
	private int[] edades;
	
	//cargar info, solicitar etc
	
	public void cargar() {
		tecladoScanner = new Scanner(System.in);
		//vector1
		nombres = new String[5];
		//vector2
		edades = new int[5];
		
		for(int f=0; f<nombres.length; f++) {
			System.out.print("Ingrese nombre: ");
			nombres[f]=tecladoScanner.next();
			
			System.out.print("Ingrese Edad: ");
			edades[f]=tecladoScanner.nextInt();
		}
		
	}
	
	//operacion o condicion
	
	public void mayorEdad() {
		
		System.out.println("Personas mayores de edad: ");
		for(int f=0; f<nombres.length; f++) {
			if(edades[f]>=18) {
				System.out.println(nombres[f]);
			} else {
				System.out.println(nombres[f] + " No es mayor de edad");
			}
		}
	}
	
	//ejecutar y resultado
	
	public static void main(String [] args) {
		PersonaEdad pe= new PersonaEdad();
		pe.cargar();
		pe.mayorEdad();
	}
	
	
}

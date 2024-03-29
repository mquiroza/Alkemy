package Repasos;

import java.util.Scanner;


public class Persona {
	
	//variables (datos) Los atributos los definimos dentro de la clase pero fuera de la main:
	//private: no permite el acceso al atributo desde otras clases
	
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	
	//ingreso de esos datos
	//Declarar metodos o las funciones de la clase
	
	public void ingresoDatos() {
		
		teclado=new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		nombre= teclado.next();
		
		System.out.println("Ingrese Edad: ");
		edad= teclado.nextInt();
				
	}
	
	// metodo para comprobar lo ingresado 
	
	public void mostrarIngresos() {
		System.out.println("Su nombre es: " + nombre);
		System.out.println("Su edad es: " + edad);
		
	}
	
	//Condicion es la operación a realizar
	
	public void mayorEdad() {
		if(edad>=18) {
			System.out.println(nombre + " Es mayor de Edad, puede salir de noche");
		} else {
			System.out.println(nombre + " No mayor de Edad, no puede salir de noche");
		}
		
	}
	
	public static void main(String [] args ) {
		Persona personaA;
		personaA = new Persona();
		personaA.ingresoDatos();
		personaA.mostrarIngresos();
		personaA.mayorEdad();
	}

}

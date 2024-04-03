package Repasos;

import java.util.Scanner;

/*Ejercicio Plantear una clase llamada Alumno y definir como atributos su nombre y su edad.
 *En el constructor realizar la carga de datos. Definir otros dos métodos para imprimir los datos ingresados 
 *y un mensaje si es mayor o no de edad (edad >=18)*/
public class AlumnoConstructor {

	//datos
	private Scanner tecladoScanner;
	private String nombreString;
	private int edad;
	
	//primer metodo, es el constructor se debe llamar igual que la clase
	
	public AlumnoConstructor() { // inicio primer metodo constructor
		tecladoScanner = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombreString=tecladoScanner.next();
		System.out.println("Ingrese Edad: ");
		edad=tecladoScanner.nextInt();
	}// fin constructor
	
	//imprimir
	public void imprimir() {
		System.out.println("Nombre: " + nombreString);
		System.out.println("Edad: " + edad);
	}
	
	
	//condicion 
	
	public void mayorEdad() {
		if(edad>=18) {
			System.out.println(nombreString + "Es mayor de edad, puede salir de noche");
		} else {
			System.out.println(nombreString + "Es menor de edad, no puede salir de noche, debe hacer tuto");
		}
	}
	
	//ejecutar
	
	public static void main(String [] arg) {
		AlumnoConstructor apodo= new AlumnoConstructor();
		apodo.imprimir();
		apodo.mayorEdad();
	}
	
}

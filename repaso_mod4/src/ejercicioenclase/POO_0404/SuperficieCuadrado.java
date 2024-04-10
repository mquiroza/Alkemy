package Abril;

import java.util.Scanner;

/*Creemos un proyecto llamado SuperficieCuadrado y una clase llamada SuperficieCuadrado.
Codificamos el algoritmo en Java

1 - Disponemos el nombre del objeto System con minúsculas.
2 - Tratamos de imprimir el nombre de la variable superficie con el primer caracter en mayúsculas*/


public class SuperficieCuadrado {// inicio clase

	public static void main(String[] args) { //inicio metodo ejecutador
		
		// teclado Scanner es para ingresar valores por consola
		
		Scanner teclado = new Scanner(System.in);
		
		// datos 
		
		int lado;
		int superficie;
		
		//ingresar mis datos a traves de la consola usando el teclado
		
		System.out.print("Ingresar valor del lado del cuadrado: ");
		
		//operacion o condicion
		
		lado = teclado.nextInt();
		
		superficie = lado * lado;
		
		System.out.print(" La superficie del cuadrado es: ");
		
		System.out.print(superficie);
		

	}//fin metodo ejecutador
	

}// fin clase

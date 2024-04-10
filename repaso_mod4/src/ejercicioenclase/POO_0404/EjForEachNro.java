package Abril;

import java.util.ArrayList;

//sumar los elementos de una lista
public class EjForEachNro { //inicio clase

	public static void main(String[] args) {//inicio main
		
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(4);
		numeros.add(3);
		numeros.add(5);
		
		int suma = 0;
		
		//Recorrer la lista con for each y sumar los elementos
		
		for(int numero : numeros) {
			suma += numero;
			System.out.println("Separa de forma individual cada numero: " + numero);
		}
				
		System.out.println("La suma de los numeros es: " + suma);
		
	}// fin main

}// fin clase


/*Ayuda memoria
 * 
 * Importamos la clase ArrayList para crear la lista de numero enteros.
 * Se crea una lista numero y se agregan elementos a ella.
 * Se inicializa una variable suma para acumular el resultado.
 * el bucle for each itera sobre cada elemnto de la lista
 * en cada iteracion, la variable numero toma el valor del elemento actual de la lista
 * Se suma el valor numero a la variable suma
 * Se muestra o imprime la suma total de los elementos 
 * 
 * */
 
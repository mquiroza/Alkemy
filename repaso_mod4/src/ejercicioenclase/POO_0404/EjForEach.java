package Abril;

// recorrer un arreglo de frutas
/* ¿Que es un for each?
 * El bucle for each utiliza internamente un iterador  para abrir sucesiva% cada elemnto del array.
 * 
 *Iterador en Java: es un patrón de diseño de comportamiento que permite el recorrido secuencial
 *en una estructura compleja de datos sin exponer el detalle interno.
 * */

public class EjForEach {// inicio clase
	
	public static void main(String[] args) {// inicio main
		
		//arreglo o estructura de datos
		String[] frutero = {"manzanas", "peras", "frutillas", "mango", "platano", "kiwis"};
		
		// recorrido con un for each
		
		for(String fruta : frutero ) {
			System.out.println("Platillo con fruta: " + fruta);
		}
		
		
	}// fin main

	
}// fin clase

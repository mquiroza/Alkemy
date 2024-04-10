package Abril;

import java.util.Scanner;

/*Se debe desarrollar un programa que pida el ingreso del precio de un artículo y 
la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.*/


public class PrecioCompra { // inicio clase

	public static void main(String[] args) {// inicio main

		Scanner teclado= new Scanner(System.in); //objeto para usar en esta clase
		
		// Datos
		float cantidadProducto;
		float precio;
		float totalCompra; //es lo mismo que decir importe
		
		//sistema solicite el ingreso de los datos
		System.out.println("Ingresar la cantidad total de productos que lleva nuestro cliente: ");
		cantidadProducto = teclado.nextFloat();
		
		System.out.println("Ingresar el precio por unidad del producto: ");
		precio = teclado.nextFloat();
		
		//operacion o condicion
		
		totalCompra = cantidadProducto * precio;
		
		System.out.println("El total a pagar es: $ ");
		System.out.print(totalCompra);

	}// fin main

}// fin clase


/* ayuda memoria
 * Tipos de datos:
 *  int : números enteros  No tiene decimales.
 * double : se utiliza tbn para moneda extranjeras Almacena números decimales. Rango: [-1.7976931348623157e+308; 1.7976931348623157e+308]. Precisión: 15 decimales.
 * float:  Almacena números decimales. Rango: [-3.402823466e+38; 3.402823466e+38]. Precisión: 7 decimales.
 */

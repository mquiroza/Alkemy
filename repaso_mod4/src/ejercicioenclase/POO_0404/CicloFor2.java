package Abril;

import java.util.Scanner;

public class CicloFor2 {//inicio clase 

	public static void main(String[] args) {// inicio main
		
		Scanner teclado= new Scanner(System.in);
		int suma, f, valor, promedio;
			suma= 0;
		
		for(f=1; f<=5; f++) {
			System.out.println("Ingrese cada nro");
			valor = teclado.nextInt();
			suma = suma + valor;
		}
		
		System.out.println();
		System.out.print(suma);
		promedio= suma / 5;
		System.out.println(" El promedio es: ");
		System.out.print(promedio);

	}//fin main

}// fin clase



/* Diferencias entre ciclo for y for each  (clase EjForEachNro)
 * 
 * for (inicializa, condicion, incremento ++ o decremento --
 * for each (tipo elemento : coleccion) {cuerpo}
 * 
 * 
 * for es muy preciso en cuanto a la iteracion. es el mas comun utilizado para definir un contador
 * 
 * for each en la industria se utiliza especificamente para recorrer colecciones de elementos
 * "Listas, arreglos" sigue orden secuencial
 * 
 * 
 * for each es que no se puede utilizar en caso de cambio de orden o cambio de indice en arreglos complejos
 * 
 * */

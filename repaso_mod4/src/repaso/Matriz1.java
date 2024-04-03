package Repasos;

import java.util.Scanner;

public class Matriz1 {//inicio clase

	// matriz [] [] 3 filas x 5 columnas

	// datos

	private Scanner teclado;
	int[][] nros;

	// cargar o solicitar datos
	public void cargar() { //inicio metodo

		teclado = new Scanner(System.in);
		nros = new int[3][5];
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Ingresar dato/componente: ");
				nros[f][c] = teclado.nextInt();
			}
		}

	}//fin metodo

	
	//imprimir o mostrar lo solicitado
	
	public void imprimir() {
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(nros[f][c] + " ");
			}
		System.out.println();
		}
	}
	
		//ejecuto
		
		public static void main(String[] arg) {
			Matriz1 apodo= new Matriz1();
			apodo.cargar();
			apodo.imprimir();
			
			
		}
		
		
	
}// fin clase

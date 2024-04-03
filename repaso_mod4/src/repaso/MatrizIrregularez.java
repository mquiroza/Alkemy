package Repasos;

import java.util.Iterator;
import java.util.Scanner;

public class MatrizIrregularez { //inicio clase
//matriz irregular, que se muestre por consola
	
	private Scanner teclado;
	private int [][] matrizIrregular;
	
	//solicite el ingreso datos
	
public void solicitarIngresoDatos() { // primer metodo
		
		teclado = new Scanner(System.in);
		System.out.print("Cuantas Filas tiene la matriz: ");
		int filas= teclado.nextInt();
		matrizIrregular=new int [filas] [];
		for(int f=0; f<matrizIrregular.length; f++) {
			System.out.print("Cuantos elementos tiene la fila " + f + ":");
			int elementos= teclado.nextInt();
			matrizIrregular[f]= new int[elementos];
			for(int c=0; c<elementos; c++) {
				System.out.print("Ingrese componente: ");
				matrizIrregular[f][c]= teclado.nextInt();
			}
		}
		
	}// fin primer metodo
	
	//mostrar la consola imprimir
	
	public void imprimir() {//inicio metodo 2
		for(int f=0;  f<matrizIrregular.length; f++) {
			for(int c=0; c<matrizIrregular[f].length; c++) {
			System.out.print(matrizIrregular[f][c] + " - ");
		}
			System.out.println();
		}
	}// fin metodo 2
	
	//ejecutor resultado
	
	public static void main(String [] ar) {
		MatrizIrregularez apodo= new MatrizIrregularez();
		apodo.solicitarIngresoDatos();
		apodo.imprimir();
	}
	
	
	
} // fin clase

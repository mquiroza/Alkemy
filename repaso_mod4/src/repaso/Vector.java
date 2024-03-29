package Basicos;

import java.util.Iterator;
import java.util.Scanner;


//esto es la clase principañ
public class Vector {
	
	private Scanner teclado;
	private String[] nombres;
	private int[] edades;
	
	
	//llamo al teclado de consola y agrego nombres + edad
	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[2];
		edades = new int[2];
		
		for(int f=0; f<nombres.length;f++) {
			System.out.println("Ingrese nombre");
			nombres[f]=teclado.next();
			System.out.println("Ingrese edad");
			edades[f]=teclado.nextInt();
		}
		
	}
	
	public void Edad() {
		
		for(int f=0; f<nombres.length;f++) {
			if (edades[f]>=18) {
				System.out.println(nombres[f]);
				System.out.println("Mayor ");
			}
		}
		
	}
	
public static void main (String[] args) {
	Vector vc= new Vector();
	vc.cargar();
	vc.Edad();
}
}

package Repasos;

import java.util.Scanner;

public class VectorParaleloOrdenado {
	
	//alumnos vs notas ordenados
	
	private Scanner tecladoScanner;
	private String[] nombreAlumnos;
	private int[] notas;
	
	//solicitar datos - cargar
	
	public void cargar() {
		
		tecladoScanner = new Scanner(System.in);
		nombreAlumnos = new String[3];
		notas = new int[3];
		
		System.out.println("Cargar los nombres y notas de los alumnos: ");
		for(int f=0; f<nombreAlumnos.length;f++) {
			
			System.out.print("Ingrese el nombre del alumno: ");
			nombreAlumnos[f] = tecladoScanner.next();
			
			System.out.print("Ingrese notas del alumno: ");
			notas[f]=tecladoScanner.nextInt();
		}
		
	}
	
	//condicion u operacion
	
	
	public void ordenar() {
		for(int x=0; x<notas.length; x++) {
			for(int f=0; f<notas.length-1-x; f++) {
				
				if(notas[f]<notas[f+1]) {
					
					int auxnota;
					auxnota= notas[f];
					notas[f] = notas[f+1];
					notas[f+1]= auxnota;
					
					String auxnombre;
					auxnombre = nombreAlumnos[f];
					nombreAlumnos[f] = nombreAlumnos[f+1];
					nombreAlumnos[f+1] = auxnombre;
					
				}
			}
		}
	}
	
	//imprimir o mostrar por consola
	
	public void mostrarPorConsola() {
		System.out.println( "Alumnos ordenados con notas de mayor a menor");
		for(int f=0; f<notas.length; f++) {
			System.out.println(nombreAlumnos[f] + " - " + notas[f]);
		}
	}
	
	public static void main(String[] args) {
		
		VectorParaleloOrdenado apodo= new VectorParaleloOrdenado();
		apodo.cargar();
		apodo.ordenar();
		apodo.mostrarPorConsola();
		
	}
	
	
	
	
	
	
	
	

}

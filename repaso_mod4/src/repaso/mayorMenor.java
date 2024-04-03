package Repasos;

import java.util.Scanner;

//Confeccionar una clase que permita ingresar tres valores por teclado. 
//Luego mostrar el mayor y el menor.


public class mayorMenor {
	
	public void cargarNumeros() {
		//teclado para ingresar datos
		Scanner tecladoScanner= new Scanner(System.in);
		
		//sistema solicite los datos a ingresar
		System.out.println("Ingrese el primero nro");
		int numero1=tecladoScanner.nextInt();
		
		System.out.println("Ingrese el segundo nro");
		int numero2=tecladoScanner.nextInt();
		
		System.out.println("Ingrese el tercer nro");
		int numero3=tecladoScanner.nextInt();
		
		int mayor,menor;
		
		mayor=calcularMayor(numero1,numero2,numero3);
		
		menor=calcularMenor(numero1,numero2,numero3);
		
		System.out.println("El numero de mayor valor es: " + mayor);
		
		System.out.println("El numero de menor valor es: " + menor);
		
	}
	
	//condicion u operaciones
	
	public int calcularMayor(int nro1, int nro2, int nro3) {
		int mayor;
		if(nro1>nro2 && nro1>nro3) {
			mayor= nro1;
		} else {
			if(nro2>nro3) {
				mayor=nro2;
			}else {
				mayor=nro3;
			}
		}
		
		return mayor;
		
	}
	
	public int calcularMenor(int nro1, int nro2, int nro3) {
		int menor;
		if(nro1<nro2 && nro1<nro3) {
			menor= nro1;
		} else {
			if(nro2<nro3) {
				menor=nro2;
			}else {
				menor=nro3;
			}
		}
		
		return menor;
		
	}
	
	//ejecutar y mostrar rssultados
	
	
	public static void main(String args[]) {
		
		mayorMenor maymen = new mayorMenor();
		maymen.cargarNumeros();
	
}
	
}

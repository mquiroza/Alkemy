package Repasos;

import java.util.Scanner;

public class CondicionNivel41 {

	public static void main(String[] args) {
							
			Scanner tecladoScanner= new Scanner(System.in);
			
			//datos 3 nros menores a 10
			
			float num1, num2,num3;
			
			//ingreso datos
			
			System.out.println("Ingresar nro 1");
			num1=tecladoScanner.nextFloat();
			
			System.out.println("Ingresar nro 2");
			num2=tecladoScanner.nextFloat();
			
			System.out.println("Ingresar nro 3");
			num3=tecladoScanner.nextFloat();
			
			if(num1<10 || num2<10 || num3<10) {
				System.out.println( "algun nro es menor a diez");
			}
			
		}
	}



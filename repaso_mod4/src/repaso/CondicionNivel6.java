package Repasos;

import java.util.Iterator;
import java.util.Scanner;

public class CondicionNivel6 {

	//disparador 
	
	public static void main(String  args[]) {
		
		Scanner tecladoScanner = new Scanner(System.in);
		
		//datos
		
		int nro3, nro5, valor, x;
		nro3 = 0;
		nro5 = 0;
		
		//condicion
		for (x=1; x<=10; x++) {
			System.out.println("Ingresar valor X: ");
			valor=tecladoScanner.nextInt();
		
			if(valor%3==0) {
				nro3=nro3+1;
			}
			
			if(valor%5==0) {
				nro5=nro5+1;
			}
		}
		
		System.out.print("multiplos de 3: ");
		System.out.println(nro3);
		System.out.print("multiplos de 5: ");
		System.out.println(nro5);
 	}
}

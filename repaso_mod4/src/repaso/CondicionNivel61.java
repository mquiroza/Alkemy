package Repasos;

import java.util.Scanner;

public class CondicionNivel61 {

	public static void main(String[] args) {
		//220 trabajadores - 3 turnos - promedio de edades
		//teclado
		Scanner tecladoScanner= new Scanner(System.in);
		
		//Datos
		int trabajador, edad, suma1, suma2, suma3, prom1, prom2, prom3;
		suma1 = 0;
		suma2 = 0;
		suma3 = 0;
		
		//condicion 
		//turno noche 
		for(trabajador=1; trabajador<=3; trabajador++) {
			System.out.print("Ingresar la Edad turno noche: ");
			edad=tecladoScanner.nextInt();
			suma1=suma1+edad;
			}
		
		prom1=suma1/3;
		System.out.print("Promedio edades turno noche");
		System.out.println(prom1);
		
		
		//turno mañana
		for(trabajador=1; trabajador<=2; trabajador++) {
			System.out.print("Ingresar la Edad turno mañana: ");
			edad=tecladoScanner.nextInt();
			suma2=suma2+edad;
		}
		
		prom2=suma2/2;
		System.out.print("Promedio edades turno mañana ");
		System.out.println(prom2);
		
		
		//turno tarde
		for(trabajador=1; trabajador<=3; trabajador++) {
			System.out.print("Ingresar la Edad turno tarde: ");
			edad=tecladoScanner.nextInt();
			suma3=suma3+edad;
		}
		
		prom3=suma3/3;
		System.out.print("Promedio edades turno tarde ");
		System.out.println(prom3);
		
		if(prom1<prom2 && prom1<prom3) {
			System.out.println("El turno de noche tiene a los mas jovenes");
		}else {
			if(prom2<prom3) {
				System.out.println("El turno de mañana tiene a los mas jovenes");
			} else {
				System.out.println("El turno de tarde tiene a los mas jovenes");
			}
		}
		
	}

}











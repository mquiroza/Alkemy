package Repasos;

import java.util.Scanner;

public class Metodos {
	// tablas de multiplicar

	public void cargarNro()	{
		Scanner tecladoScanner = new Scanner(System.in);
		int nro;
		
		do {
			System.out.println(" Ingrese el numero: ");
			nro = tecladoScanner.nextInt();
				Calcular(nro);
		}while(nro!=-1);

}

	public void Calcular(int v) {
		for (int f=v; f<=v*10; f=f+v) {
			System.out.print(f + "-");
			
		}
	}

	public static void main(String[] args) {
		Metodos tablaMulplicarMetodos;
		tablaMulplicarMetodos = new Metodos();
		tablaMulplicarMetodos.cargarNro();
	}
}

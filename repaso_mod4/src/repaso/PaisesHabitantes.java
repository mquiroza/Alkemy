package Repasos;

import java.util.Scanner;

public class PaisesHabitantes {
	// paises con su cantidad de habitantes, ordenar alfabeto, ordenar por cantidad
	// de habitantes

	/**
	 * @param args
	 * @return
	 * @throws
	 * @author sabin
	 * */
	
	private Scanner teclado;
	private String[] paises;
	private int[] habitantes;

	
	
	// cargar

	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[3];
		habitantes = new int[3];

		System.out.print("Escribir paises y cantidad de habitantes" + "\n");
		System.out.println("****************************************");

		for (int f = 0; f < paises.length; f++) {
			String pais;
            while (true) {
                System.out.print("Ingrese nombre pais: ");
                pais=teclado.next();
                if (pais.matches("[a-zA-Z ]+")) {
                    break;
                }else{
                    System.out.println("Nombre es erroneo!!");
                }
            }
            paises[f]=pais;
			
			
			//System.out.println("Ingrese nombre pais: ");
			//paises[f] = teclado.next();

			System.out.println("Ingresar cantidad de habitantes");
			habitantes[f] = teclado.nextInt();
		}

	}


	/*
	 * public static boolean soloLetras(String cadena) { return
	 * cadena.matches("[a-zA-Z]+"); do {
	 * System.out.println("Ingrese nombre pais: "); paises[f] = teclado.next(); }
	 * while (soloLetras(paises[f])); }
	 */
	// operacion o condicion Ordenar
	
	
	public void ordenarNombre() {
		for (int k = 0; k < paises.length; k++) {
			for (int f = 0; f < paises.length - 1 - k; f++) {
				String auxpais;
				auxpais = paises[f];
				paises[f] = paises[f + 1];
				paises[f + 1] = auxpais;

				int auxhabitantes;
				auxhabitantes = habitantes[f];
				habitantes[f] = habitantes[f + 1];
				habitantes[f + 1] = auxhabitantes;
			}
		}

	}
	
	

	public void ordenarHabitantes() {

		for (int k = 0; k < paises.length; k++) {
			for (int f = 0; f < paises.length - 1 - k; f++) {
				if (habitantes[f] < habitantes[f + 1]) {

					String auxpais;
					auxpais = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = auxpais;

					int auxhabitantes;
					auxhabitantes = habitantes[f];
					habitantes[f] = habitantes[f + 1];
					habitantes[f + 1] = auxhabitantes;
				}
			}
		}

	}

	// imprimir o mostrar
	public void mostrarConsola() {
		for (int f = 0; f < paises.length; f++) {
			System.out.println(paises[f] + " - " + habitantes[f]);
		}

	}

	// ejecutar

	public static void main(String[] args) {
		PaisesHabitantes apodo = new PaisesHabitantes();
		apodo.cargar();
		apodo.ordenarNombre();
		System.out.println("Ordenados alfabeticamente");

		apodo.mostrarConsola();

		apodo.ordenarHabitantes();
		System.out.println("Ordenados por cantidad de habitantes");
		apodo.mostrarConsola();
	}
}

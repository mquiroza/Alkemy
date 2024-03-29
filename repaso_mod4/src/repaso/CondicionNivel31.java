package Repasos;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sql.rowset.JoinRowSet;

public class CondicionNivel31 {
	
	//100 preguntas 
	//75 regular
	//50 no llamar
	// 100 dar carta oferta

	public static void main(String[] args) {
		
		//Ingresar datos
		Scanner teclado = new Scanner(System.in);
		
		//Declarar los datos a utilizar
		int totalPreguntas, totalCorrectas;
		
		//capturar estos datos a traves del teclado
		System.out.println("Ingresar el total de Preguntras: ");
		totalPreguntas= teclado.nextInt();
		
		System.out.println("Total contestadas correctamente");
		totalCorrectas = teclado.nextInt();
		
		//operacion
		
		int porcentaje = totalCorrectas * 100 / totalPreguntas;
		
		// condiciones
		
		if (porcentaje >= 100) {
			System.out.println("Dar carta oferta");
			
		}else {
			if (porcentaje>=75) {
				System.out.println("Regular");
				
			}else {
				if (porcentaje>=50) {
					System.out.println("No llamar");
					
				}else {
					System.out.println("Como vive esta persona");
				}
			}
			
			}
		}
		
	}



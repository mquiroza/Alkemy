package Ejemplos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coches coche1 = new Coches();
		
		coche1.setMatricula("WXDF85");
		coche1.setMarca("Toyota");
		coche1.setAnioMatricula(2024);
		coche1.setElectrico(true);
		
		
		Coches coche2 = new Coches();
		coche2.setMatricula("ZZZZ99");
		coche2.setAnioMatricula(2023);
        coche2.setMarca("Hyundai");
        coche2.setElectrico(true);
        
        Coches  coche3 = new Coches("PLKJ25", "nissan", 2023, false);
        
        //mostrar los resultados
        
       System.out.println(coche1.getMatricula() + "  " + coche1.getAnioMatricula() + "Electrico: " + (coche1.isElectrico()? "SI" : "NO"));
       System.out.println(coche2.getMatricula() + "  " + coche2.getAnioMatricula() + "Electrico: " + (coche2.isElectrico()? "SI" : "NO"));
        System.out.println(coche3.getMatricula() + "  " + coche3.getAnioMatricula() + "Electrico: " + (coche3.isElectrico()? "SI" : "NO"));
        
        
        System.out.println("Aca aparece el resultado por toString");
        //llamar metodo toString
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
      
        
        System.out.println("Solicitara ingreso por teclado");
        //ingresen un nuevo auto pero por consola o teclado
        
        String matricula, marca;
        int anio, tipo;
        boolean electrico;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Matricula: ");
        matricula=teclado.nextLine();

        System.out.println("Marca: ");
        marca=teclado.nextLine();
        
        System.out.println("Año del auto: ");
        anio=teclado.nextInt();
        
        do {
        	System.out.println("¿El auto es electrico? 1-> SI 2-> NO:  ");
        	tipo=teclado.nextInt();
        } while (tipo !=1 && tipo !=2);
        if (tipo ==1 ) {
        	electrico= true;
        }else {
        	electrico = false;
        }
        
        teclado.nextLine(); 
        
        Coches coche4 =new Coches(matricula, marca, anio, electrico);
        
        System.out.println(coche4);
        
        
//        //Crear un constructor copia para realizar el coche5
//        
//        Coches coche5= new Coches(coche4);
//        
//        System.out.println("Matricula: ");
//        matricula= teclado.nextLine();
//        
//        coche5.setMatricula(matricula);
//        
//        System.out.println(coche5);
        
	}

}
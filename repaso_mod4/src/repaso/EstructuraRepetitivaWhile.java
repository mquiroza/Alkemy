package Basicos;

import java.util.Scanner;

public class EstructuraRepetitivaWhile {
	
	public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }

}

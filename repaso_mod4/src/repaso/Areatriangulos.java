import java.util.Scanner;

public class AreaTriangulos {

    private int lado1, lado2, lado3;

    public void Inicializar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Medida lado 1:" + lado1);
         lado1 = teclado.nextInt();
        System.out.println("Ingrese Medida lado 2:" + lado2);
         lado2 = teclado.nextInt();
        System.out.println("Ingrese Medida lado 3:" + lado3);
         lado3 = teclado.nextInt();
    }



    public void ladoMayor(){
        if(lado1 > lado2 && lado1 > lado3) {
            System.out.println("El lado mayor es: " + lado1);
        }else if (lado2 > lado3) {
            System.out.println("el lado mayor es: "+ lado2);
        }else {
            System.out.println("el lado mayor es: " + lado3 );
        }

    }
    public void Equilatero() {

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo Equilatero");
        } else {
            System.out.println("Triangulo no es equilatero");
        }
    }

    public static void main(String[] args) 
    {
        AreaTriangulos TrianguloA;
        TrianguloA = new AreaTriangulos();

        TrianguloA.Inicializar();
        TrianguloA.ladoMayor();
        TrianguloA.Equilatero();
    }


}
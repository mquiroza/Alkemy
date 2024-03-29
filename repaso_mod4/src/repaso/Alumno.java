
//* integrnates del grupo:
//  Julio, juan ignacio, leonard, carla, miguel, braulio 


import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;

    // Constructor para cargar los datos del alumno
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para imprimir los datos del alumno
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método para verificar si el alumno es mayor de edad
    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para entrada de datos
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el nombre y la edad del alumno
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();

        // Crear una instancia de Alumno con los datos ingresados
        Alumno alumno1 = new Alumno(nombre, edad);
        
        // Imprimir los datos del alumno
        System.out.println("\nDatos del alumno:");
        alumno1.imprimirDatos();
        
        // Verificar si el alumno es mayor de edad
        alumno1.esMayorEdad();
        
  
    }
}
package ejercicio.java;


import java.util.Scanner;

public class EjercicioJava {

    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduzca un nombre");
    String nombre=sc.next();
    System.out.println("Introduzca un apellido");    
    String apellido=sc.next();
    System.out.println("Introduzca su edad");
    int edad=sc.nextInt();
    System.out.println("Introduzca un hobbie");    
    String hobbie=sc.next();
    System.out.println("Introduzca su editor de código preferido");    
    String editor=sc.next();
    System.out.println("Introduzca el sistema operativo que utiliza");    
    String sistema=sc.next();
    System.out.println("Bienvenido al Sistema");
    System.out.println("Los datos ingresados son: Nombre: " +nombre+ " / Apellido: " +apellido+ " / Edad: " +edad+ " años / Hobbie: " +hobbie+ " / Editor de código preferido: "+editor+ " / Sistema operativo que utiliza: " +sistema);
    System.out.println("Tu Usuario: User2020");
    System.out.println("Tu Clave: 12345");
    }
}

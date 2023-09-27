import  java.util.*;
public class ejercicio_1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Introduzca el valor de la primer variable: ");
    int a = input.nextInt();

    System.out.println("Introduzca el valor de la segunda variable: ");
    int b = input.nextInt();

    System.out.println("Variable 1 = " + a);
    System.out.println("Variable 2 = " + b);

    int auxiliar = a;
    a = b;
    b = auxiliar;

    System.out.println("Los valores han cambiado de variable: ");
    System.out.println("Variable 1 = " + a);
    System.out.println("Variable 2 = " + b);

    }
}

import java.util.*;
public class ejercicio_1_parte_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el valor de la primer variable: ");
        int a = input.nextInt();
        System.out.println("Ingrese el valor de la segunda variable: ");
        int b = input.nextInt();

        System.out.println("variable 1 = " + a + ",");
        System.out.println("variable 2 = " + b + ",");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Los valores ha cambiado de posición: ");
        System.out.println("variable 1 = " + a + ",");
        System.out.println("variable 2 = " + b + ",");
    }
}

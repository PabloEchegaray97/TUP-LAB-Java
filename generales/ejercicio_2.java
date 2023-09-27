import java.util.*;
public class ejercicio_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        char salida;

        do{
            System.out.println("Ingrese un número entero: ");
            int num = input.nextInt();
            int cifras = 0;

            while (num != 0) {
                num = num/10;
                cifras ++;
            }

            System.out.println("El número ingresado tiene " + cifras + " scifras.");
            System.out.println("Desea continuar? [N] para salir, sino presione cualquier tecla.");
            salida = input.next().charAt(0);
            salida = Character.toLowerCase(salida);

        }while (salida != 'n');
    }
}

package Recursividad;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduzca numero >0: ");
            n = sc.nextInt();
        } while (n < 0);

        System.out.print("\nBinario: ");
        decBin(n);
    }

    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
        }
    }
}

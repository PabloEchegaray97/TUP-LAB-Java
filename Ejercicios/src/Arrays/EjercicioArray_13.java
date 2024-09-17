package Arrays;
import java.util.Scanner;
public class EjercicioArray_13 {
    public static void main(String[] args) {

        int N = leerFilas();

        int[][] M = cuadradoLatino(N);

        mostrarMatriz(M);

    }

    public static int leerFilas() {
        Scanner sc = new Scanner(System.in);
        int filas;

        do {
            System.out.print("Número de filas > 2: ");
            filas = sc.nextInt();
        } while (filas <= 2);
        return filas;
    }

    public static int [][] cuadradoLatino(int n) {

        int [][] a = new int[n][n];
        for (int j = 0; j < a.length; j++) {
            a[0][j] = j + 1;
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i - 1][j];
            }
            desplazarDerecha(a[i]);
        }
        return a;
    }

    public static void desplazarDerecha(int[] a) {
        int aux = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = aux;
    }

    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}

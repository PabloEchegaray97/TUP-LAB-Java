package Arrays;
import java.util.Scanner;
public class EjercicioArray_11 {
    public static void main(String[] args) {

        int[][] M = new int[2][3];

        leerDatos(M);

        System.out.println("Matriz original");
        mostrarMatriz(M);

        int [][] T = matrizTranspuesta(M);

        System.out.println("Matriz transpuesta");
        mostrarMatriz(T);

    }

    public static void leerDatos(int[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de datos de la matriz:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "]=");
                M[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] matrizTranspuesta(int[][] a) {

        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
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

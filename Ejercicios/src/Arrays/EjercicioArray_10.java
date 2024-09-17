package Arrays;
import java.util.Scanner;
public class EjercicioArray_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;


        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);
        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 1);


        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] C = new int[filas][columnas];


        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }


        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }
}

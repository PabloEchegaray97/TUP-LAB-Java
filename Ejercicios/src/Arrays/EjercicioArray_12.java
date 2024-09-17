package Arrays;
import java.util.Scanner;
public class EjercicioArray_12 {
    public static void main(String[] args) {

        int[][] M = crearArray();

        cuadradoMagico(M);

        mostrarMatriz(M);
    }

    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas;

        do {
            System.out.print("Número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);

        int[][] A = new int[filas][filas];
        return A;
    }

    public static void cuadradoMagico(int[][] matriz) {
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont;
        for (cont = 2; cont <= N * N; cont++) {
            if (!multiplo) {
                i--;
                if (i < 0){
                    i = N - 1;
                }
                j++;
                if (j >= N){
                    j = 0;
                }
            } else {
                i++;
                if (i >= N){
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            if (cont % N == 0){
                multiplo = true;
            } else {
                multiplo = false;
            }
        }
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

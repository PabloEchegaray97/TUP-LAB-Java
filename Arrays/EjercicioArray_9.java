package Arrays;
import java.util.Random;
public class EjercicioArray_9 {
    public static void main(String[] args) {

        int tamano = 10;

        int[] numerosAleatorios = new int[tamano];

        Random generador = new Random();

        for (int i = 0; i < tamano; i++) {
            int numeroAleatorio = generador.nextInt(100);
            numerosAleatorios[i] = numeroAleatorio;
        }

        System.out.print("Array de números aleatorios: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }
    }
}

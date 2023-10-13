
package Arrays;
import java.util.*;
public class EjercicioArray_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }


        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                media = media + numeros[i];
            }
        }

        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);
    }
}

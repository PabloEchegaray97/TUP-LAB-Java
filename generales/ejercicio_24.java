import java.util.Scanner;

public class EjercicioGeneral24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;

        //lectura de un número entero positivo
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0);

        //contar las cifras del número
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux /= 10;
        }

        suma = 0; //variable que contendrá la suma de las cifras
        aux = N;
        while (aux != 0) {      //mientras le queden cifras al número
            cifra = aux % 10;   //obtenemos la última cifra
            suma = suma + Math.pow(cifra, numeroCifras); //elevamos la cifra al número de cifras y se suma
            aux /= 10;     //quitamos al número la última cifra
        }

        if (suma == N) { //si la suma es igual al número
            System.out.println("Es narcisista");
        } else {
            System.out.println("No es narcisista");
        }
    }
}

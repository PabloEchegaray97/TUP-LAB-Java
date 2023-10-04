import java.util.Scanner;

public class ejercicio_2_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma_positivos = 0, mayor_negativos=0;
        int [] vector = new int[6];
        for (int i=0; i<=5; i++) {
            System.out.println("Ingrese el valor correspondiente a la posicion " + i );
            vector[i] = scanner.nextInt();
        }
        for (int i =0; i<=5; i++) {
            if (vector[i] < 0 ) {
                mayor_negativos = vector[i];
            }
            else {
                suma_positivos = suma_positivos + vector[i];
            }
        }
        System.out.println("La suma de los numeros positivos es: " + suma_positivos);
        if (mayor_negativos==0) {
            System.out.println("No se ingresaron numeros negativos");
        } else {
            System.out.println("El mayor numero negativo es: " + mayor_negativos);
        }
    }
}

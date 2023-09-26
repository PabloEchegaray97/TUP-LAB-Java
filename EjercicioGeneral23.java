import java.util.Scanner;

public class EjercicioGeneral23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero,suma;
        //leer un número entero positivo
        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("Número no válido");
            }
        } while (numero <= 0);

        suma = 0;     //esta variable contendrá la suma de las cifras del número
        while (numero!=0){
            suma = suma + numero%10;
            numero = numero/10;
        }
        System.out.println("La suma de los digitos es: "+suma);
    }
}

import java.util.Scanner;

public class EjercicoGeneral18 {
    public static void main(String[] args) {
        int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);

        do { //introducir un número positivo
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        nuevoNumero = 0; //esta variable contendrá el número con las cifras invertidas

        while (numero != 0) {
            cifra = numero % 10;     // obtengo la ultima cifra
            numero = numero / 10;    // se la quito al número
            nuevoNumero = nuevoNumero * 10 + cifra; // se la añado al nuevo número
        }

        numero = nuevoNumero;

        System.out.println("Número con las cifras invertidas :" + numero);
    }
}


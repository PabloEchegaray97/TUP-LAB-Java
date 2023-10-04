import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la secuencia de números separados por espacios: ");
        String input = sc.nextLine();

        String[] numerosComoCadenas = input.split(" ");
        int menorPar = Integer.MAX_VALUE;
        int cantidadImpares = 0;
        boolean entradaValida = true;

        for (String numeroComoCadena : numerosComoCadenas) {
            try {
                int numero = Integer.parseInt(numeroComoCadena);
                if (numero % 2 == 0 && numero < menorPar) {
                    menorPar = numero;
                } else if (numero % 2 != 0) {
                    cantidadImpares++;
                }
            } catch (NumberFormatException e) {
                entradaValida = false;
                break;
            }
        }

        if (!entradaValida) {
            System.out.println("Error: Ingresa solo números válidos separados por espacios.");
        } else if (menorPar == Integer.MAX_VALUE) {
            System.out.println("No se encontraron números pares en la secuencia.");
        } else {
            System.out.println("El menor número par en la secuencia es: " + menorPar);
        }

        System.out.println("La cantidad de números impares en la secuencia es: " + cantidadImpares);
    }
}


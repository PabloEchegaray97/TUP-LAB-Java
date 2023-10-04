import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto terminado en un punto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.split("\\s+");

        String palabraMasConsonantes = "";
        int maxConsonantesSeguidas = 0;

        for (String palabra : palabras) {
            int contadorConsonantes = contarConsonantesSeguidas(palabra);
            if (contadorConsonantes > maxConsonantesSeguidas) {
                maxConsonantesSeguidas = contadorConsonantes;
                palabraMasConsonantes = palabra;
            }
        }

        if (!palabraMasConsonantes.isEmpty()) {
            System.out.println("La palabra con más consonantes seguidas es: " + palabraMasConsonantes);
        } else {
            System.out.println("No se encontraron palabras en el texto.");
        }

        scanner.close();
    }

    public static int contarConsonantesSeguidas(String palabra) {
        int maxConsonantes = 0;
        int contadorConsonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (!esVocal(caracter)) {
                contadorConsonantes++;
            } else {
                contadorConsonantes = 0;
            }

            if (contadorConsonantes > maxConsonantes) {
                maxConsonantes = contadorConsonantes;
            }
        }

        return maxConsonantes;
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

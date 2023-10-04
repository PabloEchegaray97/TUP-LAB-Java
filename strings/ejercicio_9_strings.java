import java.util.Scanner;

import java.util.Scanner;

public class ejercicio_9_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un texto terminado en punto:");
        String text = scanner.nextLine();

        // Dividir el texto en palabras usando el espacio como delimitador
        String[] words = text.split(" ");

        String palabraMasLarga = "";

        // Iterar a través de las palabras y encontrar la más larga
        for (String word : words) {
            // Eliminar el punto final si existe
            if (word.endsWith(".")) {
                word = word.substring(0, word.length() - 1);
            }

            if (word.length() > palabraMasLarga.length()) {
                palabraMasLarga = word;
            }
        }

        if (!palabraMasLarga.isEmpty()) {
            System.out.println("La palabra más larga es: " + palabraMasLarga);
        } else {
            System.out.println("No se encontraron palabras en el texto.");
        }
    }
}

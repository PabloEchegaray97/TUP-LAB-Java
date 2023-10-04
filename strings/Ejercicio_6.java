import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto terminado en un punto:");
        String texto = scanner.nextLine();

        // Convertir el texto a minúsculas para hacer la cuenta sin importar la capitalización
        texto = texto.toLowerCase();

        int contadorVocales = 0;

        // Recorrer el texto y contar las vocales
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }

        System.out.println("El número de vocales en el texto es: " + contadorVocales);

        scanner.close();
    }

    // Función para verificar si un carácter es una vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

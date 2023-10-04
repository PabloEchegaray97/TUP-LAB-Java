import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un texto (termina con un punto): ");
        String texto = sc.nextLine();
        
        texto = texto.replaceAll("\\s", "").toLowerCase();

        int contadorA = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contadorA++;
            }
        }

        System.out.println("La cantidad de letras 'a' en el texto es: " + contadorA);
    }
}


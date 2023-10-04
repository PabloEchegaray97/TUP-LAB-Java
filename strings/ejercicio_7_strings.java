import java.util.Scanner;

public class ejercicio_7_strings {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor");
        String phrase = lector.nextLine();
        phrase = phrase.trim();
        String [] words = phrase.split("\\s+");
        System.out.println("La cantidad de palabras de la frase ingresada son: " + words.length);
        lector.close();
    }
}

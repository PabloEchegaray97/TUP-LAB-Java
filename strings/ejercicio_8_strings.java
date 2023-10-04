import java.util.Scanner;

public class ejercicio_8_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor");
        String phrase = scanner.nextLine();
        phrase = phrase.trim();
        String [] words = phrase.split("\\s+");
        System.out.println("La cantidad de palabras de la frase ingresada son: " + words.length);
        int wordsEndendInAVocal = 0;
        for (String word : words) {
            word = word.toLowerCase(); // Convertir a minúsculas para comparar
            char lastword = word.charAt(word.length() - 1);
            if (lastword == 'a' || lastword == 'e' || lastword == 'i' || lastword == 'o' || lastword == 'u') {
                wordsEndendInAVocal++;
            }
        }

        System.out.println("La cantidad de palabras terminadas en vocal en el texto es: " + wordsEndendInAVocal);

        scanner.close();
    }

}


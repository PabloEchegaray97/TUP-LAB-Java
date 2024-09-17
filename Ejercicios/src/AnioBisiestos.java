// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class AnioBisiestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio;

        System.out.println("Introduzca un año: ");
        anio = sc.nextInt();

        if (anio % 4 ==0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
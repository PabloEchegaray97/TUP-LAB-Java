import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char salida = '0';
        do {
            System.out.println("Ingrese una temperatura en grados centígrados: ");
            int centigrados = input.nextInt();

            int kelvin = centigrados + 273;
            System.out.println(centigrados + " grados centígrados equivale a " + kelvin + " grados kelvin.");
            System.out.println("[N] para salir y cualquier tecla para continua.");
            salida = input.next().charAt(0);
            salida = Character.toLowerCase(salida);
        }while(salida != 'n');
        System.out.println("Finalizo el programa, gracias.");
    }
}

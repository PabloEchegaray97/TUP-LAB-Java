import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Ingrese un número: ");
        int num = input.nextInt();

        while(num >= 0){
            if(num% 10 == 2){
                i++;
            }
            System.out.println("Ingrese un número: ");
            num = input.nextInt();
        }
        System.out.println("Se ingresaron " + i + " números terminados en 2.");
    }
}

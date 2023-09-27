import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = input.nextInt();
        System.out.println("<Tabla del " + num + ">");
        System.out.println("_______________________");
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println("[" + num + " x " + (i+1) + " = " + num*(i+1) + "]");
        }
    }
}

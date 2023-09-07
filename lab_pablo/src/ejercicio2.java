import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Enter your grade");
        int numero = lector.nextInt();
        if (numero >10 || numero <0) {
            System.out.println("Grade incorrect");
        }
        else if (numero %2 ==0 && numero==10) {
            System.out.println("The grade is even: " + numero + ". Congrats ! You have a 10% bonus for the global assignment");
            System.out.println("You rock ! Just like el diego or messi");
        }
        else if (numero == 9) {
            System.out.println("Your grade is " + numero + " you have a 9% bonus for the global assignment");
        }
    }
}

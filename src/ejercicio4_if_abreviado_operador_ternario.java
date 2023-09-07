import java.util.Scanner;

public class ejercicio4_if_abreviado_operador_ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();
        System.out.println(grade>5 ? "You pass" : "You didn't pass :(");
        int number = sc.nextInt();
        number = (number<10 ? number = 10 : number );
        System.out.println("The number is: " + number);
    }
}

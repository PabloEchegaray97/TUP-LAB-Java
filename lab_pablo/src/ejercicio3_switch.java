import java.util.Scanner;

public class ejercicio3_switch {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Coffe with croissant\n2.Coffe with cake\n3.Coffe with something else");
        System.out.println("Enter a new value: ");

        option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Here 's your coffe with croissant, it is $20 please");
                break;
            case 2:
                System.out.println("It's $15 please");
                break;
            case 3:
                System.out.println("How can I help you ?");
                break;
            default:
                System.out.println("You didnt enter a valid option :(");
                break;
        }

    }
}

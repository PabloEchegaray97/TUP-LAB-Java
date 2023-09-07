import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter a name:");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        if(!name.equals("Pablo")) {
            System.out.println("You 're banned from the server, sorry :(");
        } else {
            System.out.println("Welcome to facebook(2)");
        }
    }
}

import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un numero >0: ");
            n = sc.nextInt();
        } while (n <= 0);

        if (n == 1) {
            System.out.println("No es primo");
        } else {
            i = 2;
            while (n % i != 0) {
                i++;
            }
            if (i == n) {
                System.out.println("Primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}

import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número de 3 cifras: ");
        n = sc.nextInt();

        if (n >= 100 && n <= 999){
            if (n % 10 == n/100){
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }
        }else {
            System.out.println("No es un número de 3 cifras");
        }
    }
}

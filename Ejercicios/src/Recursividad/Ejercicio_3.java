package Recursividad;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.print("Introduce un numero entero >=0 ");
            num = sc.nextInt();
        }while(num < 0);

        System.out.println("2 ^ " + num + " = " + potencia(num));
    }
    public static double potencia(int n){
        if(n == 0){
            return 1;
        } else {
            return 2 * potencia(n-1);
        }
    }
}

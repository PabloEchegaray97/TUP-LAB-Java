package Recursividad;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Introduce un numero entero >0 ");
            num = sc.nextInt();
        }while(num <= 0);
        System.out.println("Número de cifras: " + numeroCifras(num));
    }
    public static int numeroCifras(int n){
        if(n < 10) { //caso base
            return 1;
        } else {
            return 1 + numeroCifras(n/10);
        }
    }
}

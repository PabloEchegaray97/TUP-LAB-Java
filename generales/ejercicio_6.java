import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese un número: ");
        int num = input.nextInt();

        for(int i = 1; i < num ; i++){
            if(num%i == 0){suma += i;}
        }
        if(suma == num){
            System.out.println(num + " es un número perfecto.");
        }else{ System.out.println(num + " no es un número perfecto.");}
    }
}

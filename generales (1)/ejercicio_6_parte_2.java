import java.awt.*;
import java.util.Scanner;

public class ejercicio_6_parte_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 1000 ; i ++){
            int suma = 0;
            for(int j = 1; j < i ; j++){
                if(i%j == 0){suma += j;}
            }
            if(suma == i){
                System.out.println(i + " es un número perfecto.");
            }
        }
    }
}

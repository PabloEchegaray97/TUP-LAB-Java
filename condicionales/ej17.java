import java.util.Scanner;

/*
El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
 */

import  java.util.Scanner;

public class ejercio17 {
    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        int number_1, number_2, number_3;
        int mayor = 0;
        System.out.println("Introduzca el primer número: ");
        number_1 = lec.nextInt();
        System.out.println("Introduzca el segundo número: ");
        number_2 = lec.nextInt();
        System.out.println("Introduzca el tercer número: ");
        number_3 = lec.nextInt();

        if(number_1 > mayor){ mayor = number_1;}
        else if (number_2 > mayor) { mayor = number_2; }
        else if (number_3 > mayor) {mayor = number_3; }

        System.out.println("El número mayor es " + mayor + ".");

    }
}

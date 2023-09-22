
/*
Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.

Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24.

El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos
 */

import  java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        int H, M, S;
        int mayor = 0;
        System.out.println("Introduzca la hora: ");
        H = lec.nextInt();
        System.out.println("Introduzca los minutos: ");
        M = lec.nextInt();
        System.out.println("Introduzca los segundos: ");
        S = lec.nextInt();

        if((H < 0 || H>23) || (M < 0 || M>59) || (S < 0 || S>59) ){
            System.out.println("Error introdujo una hora incorrecta: ");
        } else {
            System.out.println("Se introdujo una correcta: " + H+":"+M+":"+S);
        }


    }
}
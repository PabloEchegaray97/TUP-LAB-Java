import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        String nombre;
        double radio;
        int n;

        System.out.print("Introduzca su nombre:");
        nombre = sc.next();
        System.out.println("Hola " + nombre + "!!!");

        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble(); //leer un double
        System.out.println("Longitud de la circunferencia:" + 2*Math.PI*radio);

        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt(); //leer un entero
        System.out.println("El cuadrado es: " + Math.pow(n,2));
        if (n < 6) {
            System.out.println(n + " es menor que 6 uwu");
        }
        */

        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Ingresa tu nota, maquina:");
        int nota = sc.nextInt();
        if (nota>5) {
            System.out.println("Felicitaciones crack, aprobaste");
        } else {
            System.out.println("Desaprobaste, nt :(");
        }
        */
        System.out.println("Ingrese un numero par");
        int numero = sc.nextInt();
        if (numero%2 == 0) {
            System.out.println("El numero ingresado es par :=)");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
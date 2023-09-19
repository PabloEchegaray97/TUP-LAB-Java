//Programa java que lee dos números distintos por teclado y calcula y muestra el resultado
// de dividir el mayor entre el menor.
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double num1, num2;
        double resultado=0;
        System.out.println("Ingrese el primer numero: ");
        num1 = lector.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = lector.nextInt();
        if(num2 == 0 || num1 == 0) {
            System.out.println("Error, no se puede dividir por 0");
        } else if (num2>num1) {
            resultado = num2/num1;
            System.out.println("El resultado de dividir " + num2 + " por " + num1 + " es: " + resultado);
        } else {
            resultado = num1/num2;
            System.out.println("El resultado de dividir " + num1 + " por " + num2 + " es: " + resultado);
        }
    }
}

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        //Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un caracter por favor: ");
        char caracter = lector.next().charAt(0);
        if(Character.isDigit(caracter)) {
            System.out.println(caracter + " es un número comprendido entre 0 y 9");
        } else {
            System.out.println(caracter + " no es un número comprendido entre 0 y 9");
        }
        //Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo.
        //Se debe comprobar que el divisor no puede ser cero.
        int num1, num2;
        float resultado = 0;
        System.out.println("Ingrese el primer número: ");
        num1 = lector.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = lector.nextInt();
        if(num2==0) {
            System.out.println("Error de ejecución, no se puede dividir por 0");
        } else {
            resultado = num1/num2;
            System.out.println("El resultado de dividir " + num1 + " por " + num2 + " es: " + resultado);
        }
    }
}

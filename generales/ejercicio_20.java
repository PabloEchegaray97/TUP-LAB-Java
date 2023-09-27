import java.util.Scanner;

public class EjercicoGeneral20 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int numero, cifra, posicionMayor, posicion, mayor;

        do {
            System.out.print("Introduce numero entero mayor a 0: ");
            numero = myInput.nextInt();
        } while (numero <= 0);
        mayor = 0; //Esta variable contendrá el valor de la cifra mayor.
        //Inicialmente le damos el valor 0 que es el menor valor de cualquier cifra del número.

        posicionMayor = 0; //variable que contendrá la posición donde se encuentra la cifra mayor del número
        posicion = 0; //variable que contendrá la posición de la cifra con la que estamos trabajando
        while(numero!=0){
            cifra = numero %10;
            posicion++;
            if(cifra>mayor){
                mayor=cifra;
                posicionMayor= posicion;
            }
            numero = numero/10;
        }
        System.out.println("EL numero mayor es: "+mayor);
        System.out.println("La posicion del mayor es: "+posicion);
    }



}
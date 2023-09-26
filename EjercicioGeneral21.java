import java.util.Scanner;

public class EjercicioGeneral21 {
    public static void main(String[] args)  {

        int num, aux, posicionMayor, cifra, mayor, posicion, numCifras;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        //copiamos el número en una variable auxiliar
        aux = num;
        //obtenemos el número de cifras que tiene el número introducido
        numCifras = 0;
        while (aux != 0) {
            numCifras++;
            aux = aux / 10;
        }

        mayor = 0;//Esta variable contendrá el valro de la cifra mayor.
        //Inicialmente le damos el valor 0 que es el menor valor de cualquier cifra del número.
        posicionMayor = 0; //variable que contendrá pa posición donde se encuentra la cifra mayor del número
        posicion = 0; //variable que contendrá la posición de la cifra con la que estamos trabajando
        for(int i = numCifras-1; i >= 0; i--){
            posicion++;
            cifra = num / (int)Math.pow(10, i); //obtenemos la primera cifra de la izquierda del número
            if (cifra > mayor) { //si es mayor que la mayor actual
                mayor = cifra; // la tomamos como nueva mayor
                posicionMayor = posicion; //y guardamos su posición
            }
            num = num % (int)Math.pow(10, i); //le quitamos al número su primera cifra de la izquierda.
        }

        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posicionMayor);

    }
}

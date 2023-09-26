import java.util.Scanner;

public class EjercicioGeneral19 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int numero,mayor;
        System.out.print("Introduce número, para acabar introduce 0: ");
        numero = myInput.nextInt();
        mayor = numero;
        while(numero!=0){

            System.out.print("Introduce número, para acabar introduce 0: ");
            numero = myInput.nextInt();
            if(numero > mayor){
                mayor = numero;
            }
        }
        if(numero == 0){
            System.out.println("No se introdujo ningun numero" );

        }
        else {
            System.out.println("El mayor número introducido ha sido: " + mayor);
        }

    }
}

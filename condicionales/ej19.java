
import java.util.Scanner;

public class ej19 {

    public static void main(String[] args) {
        int mes;
        Scanner myInput = new Scanner(System.in);
        System.out.print("Escriba un numero de mes: ");
        mes = myInput.nextInt();

        if (mes<1 || mes>12){
            System.out.println("El numero de mes digitado es incorrecto!!");

        }
        else {
            switch (mes){
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                case 4:
                    System.out.println("Abril");
                case 5:
                    System.out.println("Mayo");
                case 6:
                    System.out.println("Junio");
                case 7:
                    System.out.println("Julio");
                case 8:
                    System.out.println("Agosto");
                case 9:
                    System.out.println("Septiembre");
                case 10:
                    System.out.println("Octubre");
                case  11:
                    System.out.println("Noviembre");
                case 12:
                    System.out.println("Diciembre");

            }
            if (mes==4 || mes==6 || mes==9 || mes==11){
                System.out.println("Este mes tiene 30 dias");

            } else if (mes==2) {
                System.out.println("Su mes tiene 28 dias!!");

            }
            else {
                System.out.println("Su mes tiene 31 dias");
            }
        }

    }
}

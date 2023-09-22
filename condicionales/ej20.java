import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        int nota;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Digite su nota: ");
        nota = myInput.nextInt();

        if (0<=nota && nota<5){
            System.out.println("Su nota es Insuficiente");
        }
        else if (nota>=5 && nota<6) {
            System.out.println("Su nota es Suficiente");

        }
        else if (nota>=6 && nota < 7){
            System.out.println("Su nota es Bien");
        }
        else if (nota>=7 && nota <9) {
            System.out.println("Su nota es Notable");
        }
        else if (nota>=9 && nota <=10) {
            System.out.println("Su nota es Sobresaliente");
        } else {
            System.out.println("La nota digitada no es valida");
        }
    }
}

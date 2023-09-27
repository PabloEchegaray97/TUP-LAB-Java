import java.util.Scanner;

public class ejercicio13_generales {
    public static void main(String[] args) {
        int N, aux, inverso = 0, cifra;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un número mayor o igual a 10 por favor: ");
            N = sc.nextInt();
        } while (N < 10);

        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}

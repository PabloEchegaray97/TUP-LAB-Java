import java.util.Scanner;

public class ejercicio8_generales {
    /*
La serie de fibonacci la forman una serie de números tales que:
El primer término de la serie es el número 1
El segundo término de la serie es el número 1
Los siguientes términos de la serie de fibonacci se obtienen de la suma de los dos anteriores:
1, 1, 2, 3, 5, 8, 13, .....
 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,num,nextnum,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");

            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("A continuacion se mostraran " + numero + " numeros de la serie Fibonacci: ");
        num=1;
        nextnum=1;

        System.out.print(num + " ");
        for(i=2;i<=numero;i++){
            System.out.print(nextnum + " ");
            nextnum = num + nextnum;
            num = nextnum - num;
        }
        System.out.println();
    }
}

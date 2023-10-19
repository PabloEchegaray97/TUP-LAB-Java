import java.util.Scanner;

public class SumaNumeroFactorial {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N,factorial,suma;
        do{
            System.out.println("Digite un numero mayor a 0: ");
            N = sc.nextInt();
            suma = 0;
        }
        while(N<0);
        for(int i=0;i<=N;i++){
            factorial = 1;
            for(int j=1;j<=i;j++){
                factorial = factorial*j;
            }
            suma = suma + factorial;
            System.out.println(i+"!"+"="+factorial);
        }
         System.out.println("La suma del 0 al "+N+" es de: "+suma);
    }
   
}

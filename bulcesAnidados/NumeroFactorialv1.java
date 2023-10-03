import java.util.Scanner;

public class NumeroFactorialv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N,factorial;
        do{
            System.out.println("Digite un numero mayor a 0: ");
            N = sc.nextInt();
        }
        while(N<0);
        for(int i=0;i<=N;i++){
            factorial = 1;
            for(int j=1;j<=i;j++){
                factorial = factorial*j;
            }
            System.out.println(i+"!"+"="+factorial);
        }
    }
}

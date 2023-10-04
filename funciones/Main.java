import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Selecciona una opcion del 1 al 10 para ver el ejercicio\n1.Contador5digitos\n2.NumeroFactorialv1\n3.numeroPerfecto1al1000\n4.NumeroPrimo2aN\n5.Separacion de linea\n6.SumaNumeroFactorial");
        int option = lector.nextInt();
        switch (option){
            case 1:
                System.out.println("Seleccionaste la opcion 1");
                Contador5digitos();
                break;
            case 2:
                System.out.println("Seleccionaste la opcion 2");
                NumeroFactorialv1();
                break;
            case 3:
                System.out.println("Seleccionaste la opcion 3");
                numeroPerfecto1al1000();
                break;
            case 4:
                System.out.println("Seleccionaste la opcion 4");
                NumeroPrimo2aN();
                break;
            case 5:
                System.out.println("Seleccionaste la opcion 5");
                SeparacionDeLinea();
                break;
            case 6:
                System.out.println("Seleccionaste la opcion 6");
                SumaNumeroFactorial();
                break;
            case 7:
                System.out.println("Seleccionaste la opcion 7");
                cifrasEntero();
                break;
            case 8:
                System.out.println("Seleccionaste la opcion 8");
                conversorTemperatura();
                break;
            case 9:
                System.out.println("Seleccionaste la opcion 9");
                tablaMultiplicacion();
                break;
            case 10:
                System.out.println("Seleccionaste la opcion 10");
                terminaEn2();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void Contador5digitos() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.print(i != 3 ? i : "E");
                            System.out.print(j != 3 ? j : "E");
                            System.out.print(k != 3 ? k : "E");
                            System.out.print(l != 3 ? l : "E");
                            System.out.println(m != 3 ? m : "E");
                        }
                    }
                }
            }
        }
    }

    public static void NumeroFactorialv1() {
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
    public static void numeroPerfecto1al1000() {
        int suma;

        for (int i = 1; i <= 1000; i++) {

            suma = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {
                System.out.println("es un número perfecto: " + i);
            }
        }
    }
    public static void NumeroPrimo2aN() {
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 2);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) { //
                System.out.println(j);
            }
        }
    }
    public static void SeparacionDeLinea() {
        for(char x = 'Z';x>='A';x--){
            for(char c ='A';c<x;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void SumaNumeroFactorial() {
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
    public static void cifrasEntero() {
        Scanner input = new Scanner(System.in);

        char salida;

        do{
            System.out.println("Ingrese un número entero: ");
            int num = input.nextInt();
            int cifras = 0;

            while (num != 0) {
                num = num/10;
                cifras ++;
            }

            System.out.println("El número ingresado tiene " + cifras + " scifras.");
            System.out.println("Desea continuar? [N] para salir, sino presione cualquier tecla.");
            salida = input.next().charAt(0);
            salida = Character.toLowerCase(salida);

        }while (salida != 'n');
    }
    public static void conversorTemperatura() {
        Scanner input = new Scanner(System.in);
        char salida = '0';
        do {
            System.out.println("Ingrese una temperatura en grados centígrados: ");
            int centigrados = input.nextInt();

            int kelvin = centigrados + 273;
            System.out.println(centigrados + " grados centígrados equivale a " + kelvin + " grados kelvin.");
            System.out.println("[N] para salir y cualquier tecla para continua.");
            salida = input.next().charAt(0);
            salida = Character.toLowerCase(salida);
        }while(salida != 'n');
        System.out.println("Finalizo el programa, gracias.");
    }
    public static void tablaMultiplicacion() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = input.nextInt();
        System.out.println("<Tabla del " + num + ">");
        System.out.println("_______________________");
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println("[" + num + " x " + (i+1) + " = " + num*(i+1) + "]");
        }
    }
    public static void terminaEn2() {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Ingrese un número: ");
        int num = input.nextInt();

        while(num >= 0){
            if(num% 10 == 2){
                i++;
            }
            System.out.println("Ingrese un número: ");
            num = input.nextInt();
        }
        System.out.println("Se ingresaron " + i + " números terminados en 2.");
    }
}

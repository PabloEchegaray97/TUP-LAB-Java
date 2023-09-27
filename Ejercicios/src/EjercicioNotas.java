import java.util.Scanner;

public class EjercicioNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        double nota, suma=0, mayor, menor;

        System.out.println("Ingrese una nota mayor, menor y media de una clase");

        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble();

        suma = suma + nota;

        mayor = nota;
        menor = nota;

        for (int i = 2; i <= n; i++) {
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota;
            if (nota > mayor){
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        // mostrar resultados
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);
    }
}

import java.util.Scanner;

public class calculadora_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("What do you want to do ?\n1.Add\n2.Subtract\n3.Multiplicate\n4.divide ");
        int option = sc.nextInt();
        System.out.println("You selected " + option + " \nNow please enter 2 numbers:");
        int num1, num2;
        System.out.println("n1 = ");
        num1 = sc.nextInt();
        System.out.println("n2 = ");
        num2 = sc.nextInt();
        int result;
        switch (option) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + "+" + num2+"="+ result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1 + "-" + num2+"="+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1 + "x" + num2+"="+ result);
                break;
            case 4:
                if(num2!=0) {
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2+"="+ result);
                } else {
                    System.out.println("Error: can't divide by 0");
                }
                break;
            default:
                System.out.println("You didn't enter a valid option");
                break;
        }
    }
}

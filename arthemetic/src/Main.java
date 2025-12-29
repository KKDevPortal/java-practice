import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int sumOfTwoNumber(int x, int y) {
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number_1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a number_2: ");
        int num2 = sc.nextInt();

        System.out.println("You entered: \nnum1 " + num1 + "\nnum2 "+ num2 );

        System.out.println("Sub is :: " + sumOfTwoNumber(num1, num2));
    }
}
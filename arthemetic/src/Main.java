import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int sumOfTwoNumber(int x, int y) {
        return x+y;
    }

    static  int substractTwoNumber(int x, int y) {
        return x-y;
    }

    static int multiplication(int x, int y) {
        return x*y;
    }

    static float division_withReinder(int x, int y) {
        if(x < 0 || y <0) {
            return 0;
        } else {
            return x%y;
        }
    }

    static float division_quoient(int x, int y) {
        if(x < 0 || y <0) {
            return 0;
        } else {
            return x/y;
        }
    }

    static void choice(int ch) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number_1: ");
        int x = sc.nextInt();

        System.out.print("Enter a number_2: ");
        int y = sc.nextInt();

        System.out.println("You entered: \nnum1 " + x + "\nnum2 "+ y );

        switch(ch) {
            case 1:
                System.out.println(sumOfTwoNumber(x, y));
                break;
            case 2:
                System.out.println(substractTwoNumber(x, y));
                break;
            case 3:
                System.out.println(multiplication(x,y));
                break;
            case 4:
                System.out.println(division_quoient(x,y));
                break;
            case 5:
                System.out.println(division_withReinder(x,y));
            default:
                System.out.println("Thank you for using this application, please try again.....");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculation opeeration\n---------------------------------------------------\n");
        System.out.println("Select for following operation :");
        System.out.println("\n1. ADD TWO NUMBER");
        System.out.println("\n2. SUBTRACT TWO NUMBER");
        System.out.println("\n3. MULTIPLICATION OF TWO NUMBER");
        System.out.println("\n4. DIVISION WITH QUOTIENT");
        System.out.println("\n5. DIVISION WITH REMINDER");
        System.out.println("\n---------------------------------------------------");

        System.out.print("Select your choice:> ");
        int choice = sc.nextInt();
        choice(choice);
    }
}
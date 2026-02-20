import InterfaceDef.Calculate;
import InterfaceDef.SayHello;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Example-1
        SayHello greeting = ()  -> System.out.println("I am called through lambda expression flow");
        greeting.sayHello();

        // Example-2
        Calculate addition = (x, y) -> x + y;
        int sum = addition.calculate(10, 20);
        System.out.println("Sum is: " + sum);

        // Example-3
        Calculate subtraction = (x, y) -> {
            System.out.println("Subtraction of x "+ x + " and y " + y );
            return x - y;
        };

        System.out.println("Subtraction is: " + subtraction.calculate(50, 13));





    }
}
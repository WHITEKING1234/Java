import java.util.Scanner;

public class Calculator {
    static public void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your first number: ");
       double a = scanner.nextDouble();
        System.out.println("Enter your operator (+, -, *, /): ");
        String operator = scanner.next();
       System.out.println("Enter your second number: ");
       double b = scanner.nextDouble();

       double result = 0.0;
       switch (operator) {
           case "+":
               result = a + b;
               break;
           case "-":
               result = a - b;
               break;
           default:
               System.out.println("Invalid operator");
       }
           System.out.println(result);
    }
}

import java.util.Scanner;

public class Imt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter your operator (+, -, *, /): ");
        String operator = scanner.next();
        System.out.println("Enter your second number: ");
        double b = scanner.nextDouble();

        double total = 0;
        switch (operator){
            case "+":
                total = a + b;
                break;
            case "-":
                total = a - b;
                break;
        }
        System.out.println(total);
    }
}

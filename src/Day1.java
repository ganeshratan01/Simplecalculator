
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num1 = scanner.nextInt();
        System.out.println("Enter your Second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter\n + for Addition\n- for Subraction\n" + "Enter * for Multiplictaion\n / for Division");
        String input = scanner.next();
        if (input.equals("+")) {
            System.out.println("Addition: " + (num1 + num2));
        } else if (input.equals("-")) {
            System.out.println("Subraction: " + (num1 - num2));
        } else if (input.equals("*")) {
            System.out.println("Multiplication: " + (num1 * num2));
        } else if (input.equals(" / ")) {
            System.out.println("Division: " + (num1/num2));
        }
    }
}
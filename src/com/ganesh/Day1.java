package com.ganesh;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your number");
            int num1 = scanner.nextInt();
            System.out.println("Enter your Second number");
            int num2 = scanner.nextInt();
            System.out.println("Enter\n + for Addition\n- for Subraction\n" + "Enter * for Multiplictaion\n / for Division");
            String input = scanner.next();
            switch (input) {
                case "+":
                    System.out.println("Addition: " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Subraction: " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;

                case "/":
                    System.out.println("Division: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Incorrect option Selected");
            }
            System.out.println("Enter Y to continue and N to exit");
            String op = scanner.next();
            if(op.equals("N") || op.equals("n"))
                break;
        }
    }
}

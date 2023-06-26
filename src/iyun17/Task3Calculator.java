package iyun17;

import java.util.Scanner;

public class Task3Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter operator: ");
        String operator = scanner.next();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        switch (operator) {
            case "+":
                System.out.println(a+" + "+b+" = "+(a + b));
                break;
            case "-":
                System.out.println(a+" - "+b+" = "+(a - b));
                break;
            case "*":
                System.out.println(a+" * "+b+" = "+(a * b));
                break;
            case "/":
                System.out.println(a+" / "+b+" = "+(a / b));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}

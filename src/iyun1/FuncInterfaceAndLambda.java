package iyun1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncInterfaceAndLambda {
    public static void main(String[] args) {
        //TASK 1
        int num1 = 5;
        int num2 = 10;
        SumFunction sumFunction = (a, b) -> a + b;
        int sum = sumFunction.calculateSum(num1, num2);
        System.out.println("Sum: " + sum);


        //TASK 2
        int number = 5;
        FactorialFunction factorialFunction = n -> {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        long factorial = factorialFunction.calculate(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        //TASK 3
        String str = "Hello, world!";
        StringLengthFunction stringLength = s -> s.length();
        int length = stringLength.getLength(str);
        System.out.println("Length of the string: " + length);


        //TASK 4
        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
        StringTransformer toUpperCase = (input) -> input.toUpperCase();
        List<String> result = new ArrayList<>();
        for (String s : stringList) {
            result.add(toUpperCase.transform(s));
        }
        System.out.println("Uppercase Strings in the list are " + result);


        //TASK 5
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        EvenNumberChecker checker = (num) -> num % 2 == 0;
        List<Integer> evenNumbers = filterEvenNumbers(numbers, checker);
        System.out.println(evenNumbers);
    }

    @FunctionalInterface //for Task 1
    interface SumFunction {
        int calculateSum(int a, int b);
    }

    @FunctionalInterface //for Task 2
    interface FactorialFunction {
        long calculate(int n);
    }

    @FunctionalInterface //for Task 3
    interface StringLengthFunction {
        int getLength(String s);
    }

    @FunctionalInterface  //for Task 4
    interface StringTransformer {
        String transform(String input);
    }

    @FunctionalInterface //for Task 5
    interface EvenNumberChecker {
        boolean isEven(Integer num);
    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers, EvenNumberChecker checker) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (checker.isEven(num)) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }
}

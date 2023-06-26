package iyun17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%10*1000+a%1000/10*10+a/1000;
        System.out.println(b);
    }
}

package com.eneyeitech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(sum(number1, number2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

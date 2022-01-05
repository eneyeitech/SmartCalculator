package com.eneyeitech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String line = scanner.nextLine();
            String[] values = line.split(" ");

            if ("/exit".equals(line)) {
                System.out.println("Bye!");
                break;
            } else if ("/help".equals(line)) {
                System.out.println("The program calculates the sum of numbers");

            } else if ("".equals(line)) {

            } else {
                if (values.length >= 2) {
                    calculateSum(values);
                } else if (values.length == 1) {
                    System.out.println(values[0]);
                }
            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void calculateSum(String[] values) {
        int sum = 0;
        int a = 0;
        try {
            for (String s : values) {
                a = Integer.parseInt(s);
                sum += a;
            }
            System.out.println(sum(sum, 0));

        } catch (NumberFormatException e) {

        }
    }
}


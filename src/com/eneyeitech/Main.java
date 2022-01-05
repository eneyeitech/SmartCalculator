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
            }
            if ("".equals(line)) {

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
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(values[0]);
            b = Integer.parseInt(values[1]);
            System.out.println(sum(a, b));

        } catch (NumberFormatException e) {

        }
    }
}


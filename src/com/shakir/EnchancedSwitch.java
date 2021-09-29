package com.shakir;

import java.util.Scanner;

public class EnchancedSwitch {
    public static void main(String[] args) throws IllegalStateException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String dept = sc.next();


            switch (dept) {
                case "IT" -> {
                    System.out.println("IT Department");
                    Integer num = sc.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("Kunal");
                        case 2 -> System.out.println("Shakir");
                    }
                }
                case "HR" -> {
                    System.out.println("HR Dept");
                    Integer num = sc.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("Suman");
                        case 2 -> System.out.println("Pavana");
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + dept);
            }
        }


    }
}

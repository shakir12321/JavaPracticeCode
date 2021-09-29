package com.shakir;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String fruit = sc.next();

            switch (fruit) {
                case "mango" -> System.out.println("King of fruit");
                case "orange" -> System.out.println("Not so sweet");
                default -> throw new IllegalStateException("Unexpected value: " + fruit);
            }
        }
    }
    }


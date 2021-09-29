package com.shakir;

import java.util.Locale;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("is Lower Case");
        }
        else
            System.out.println("Upper");
    }
}

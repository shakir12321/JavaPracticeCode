package com.shakir;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter first and second number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+sum);;

    }
}

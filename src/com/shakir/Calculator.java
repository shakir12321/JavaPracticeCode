package com.shakir;

import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter operator");
        Scanner sc = new Scanner(System.in);
        while(true){
            char op = sc.next().trim().charAt(0);
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            System.out.println("Operator "+op);
            if(op == '+') System.out.println(a+b);
            if (op == 'x') exit(0);

        }
    }
}

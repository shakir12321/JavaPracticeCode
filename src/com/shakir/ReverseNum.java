package com.shakir;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter a long number");
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        Long rem = 0L;
       // String rev = "";
        Long rev = 0L;
        while (num > 0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);

    }
}

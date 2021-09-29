package com.shakir;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        System.out.println("Enter a really long number");
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        System.out.println("Enter the number to find rep");
        Scanner sc1 = new Scanner(System.in);
        Long find = sc1.nextLong();
       // System.out.println("Length of the number");
        int count = 0;
        Long mod = 0L;
        int count1 = 0;
        while(num > 0) {
            mod = num % 10;
            if(mod == find) {
                count1++;
            }
            num = num/10;
            System.out.println(num);
        }
        System.out.println("The number is found --" + count1);

//
//        Integer l = num.l
//        last = num % 10;
//        while (mod > 0){
//            last = num % 10
//
//
//        }

    }
}

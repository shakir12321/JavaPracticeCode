package com.shakir;

import java.util.Scanner;

public class Fiban {
    public static void main(String[] args) {
        System.out.println("Number in Fibannachi series");
        Scanner sn = new Scanner(System.in);
        int num =  sn.nextInt();
        int a = 0;
        int b = 1;
        int sum =  a+b;
        int iter = 0;
        while (iter != num)
        {
            sum = a+b;
            System.out.println(sum + " ");
            a = b;
            b = sum;
            iter++;
        }

    }
}

package com.shakir;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        System.out.println("Enter the salary");
        Scanner sc = new Scanner(System.in);
        Integer sal = sc.nextInt();
        if(sal>2000){
            System.out.println("The bonus is "+ 2000);
        }
        else
            System.out.println("The bonus is "+1000);
    }
}

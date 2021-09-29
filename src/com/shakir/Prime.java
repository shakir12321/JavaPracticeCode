package com.shakir;

import java.util.Scanner;

import static java.lang.System.exit;

public class Prime {
    public static void main(String[] args) {
        while(true){

        System.out.println("Enter number");

        Scanner sc = new Scanner(System.in);
        Long ln = sc.nextLong();
        if (ln == 'x') {
            exit(0);
        }
        System.out.println(isPrime(ln));;
        }

    }

    public static boolean isPrime(Long ln){
        int i = 2;
        while (i*i <= ln){
            if((ln%i) == 0 ) return false;
            i++;
        }
        return i*i>ln;


    }
}

package com.shakir;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers");
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
      //  int max = a;

//        if((b > a) ){
//            max = b;
//        }
//        if((c > max) ){
//            max = c;
//        }

        System.out.println( Math.max(c, Math.max(a,b)));
    }
}

package com.shakir;

import java.util.ArrayList;
import java.util.Scanner;

public class MulitDimArray {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(2);
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> aml = new ArrayList<>(3);

        for(int i=0; i < 3; i++){

                aml.add(new ArrayList<>());

        }

        for(int i=0; i< 3; i++){
            for(int j = 0; j< 3; j++) {
                aml.get(i).add(sc.nextInt());
            }
        }

        System.out.println(aml);


    }



}

package com.shakir;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {

    public static void main(String[] args) {
        System.out.println("Enter 5 objects");
        Long[] arr = new Long[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.valueOf(i);
        }

        for (Long i : arr) {
            System.out.print(arr[Math.toIntExact(i)]);

        }

        System.out.println(Arrays.toString(arr));

        int [][] arr1 = new int [3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 dim arrays ");

        for(int row = 0 ; row < arr1.length; row++){
            //for each col in that row
            for(int col = 0; col < arr1[row].length; col++){
                arr1[row][col] = sc.nextInt();

            }
        }

        System.out.println(Arrays.toString(arr1));

        for(int row = 0; row < arr1.length ; row++){
            System.out.println(Arrays.toString(arr1[row]));
        }

        //Advance
        for ( int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }

        int [][] arr2 = {
                {1,2,3},
                {'a','b'},
                {4,5,6,7}
        };
        //Advance for
        for ( int[] a : arr2){
            System.out.println(Arrays.toString(a));
        }


    }

}

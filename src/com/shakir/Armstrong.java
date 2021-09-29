package com.shakir;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("All Armstrong number between 1 to 200");
        arms();
    }

    public static void arms(){

        for (int i = 100; i < 1000; i++) {
            if (isArm(i)) System.out.println(i);
        }


    }

    private static boolean isArm(int n) {
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n %10;
            n = n / 10;
            sum += rem * rem * rem;
        }
       return (sum == original);
    }
}

package com.shakir;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4};
        myPrint(a);
        Float f[] = {1.1f, 2.2f, 3.3f};
        myPrint(f);
    }

    private static void myPrint(Integer[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void myPrint(Float... a) {
        System.out.println(Arrays.toString(a));
    }
}

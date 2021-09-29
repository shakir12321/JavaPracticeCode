package com.shakir;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);

        ArrayList<Double> ald = new ArrayList<>(4);

        al.add(22);
        al.add(11);
        al.add(33);
        al.add(44);

        System.out.println(al);

    }
}

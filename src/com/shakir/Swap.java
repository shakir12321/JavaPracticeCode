package com.shakir;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        Integer num[] = {22,33,44,55,66,77};
        Integer ind1 = 1;
        Integer ind2 = 4;
        Integer [] res = swap(num, ind1, ind2);
        System.out.println(Arrays.toString(res));
        Integer  res2 = max(num);
        System.out.println((res2));
        Integer [] rev = reverse(num);
        System.out.println(Arrays.toString(rev));

    }

    private static Integer[] reverse(Integer[] num) {
//        for (int i=0; i < num.length/2; i++){
//           num = swap(num, i, num.length -1 - i);
//        }
        int start = 0;
        int end = num.length -1;
        while(start < end){
            num = swap(num, start, end);
            start++;
            end--;
        }

         return num;
    }



    public static Integer[] swap(Integer[] arr, Integer index1, Integer index2){
        Integer temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
        return arr;
    }

    private static Integer max(Integer[] num) {
        Integer max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i]> max) max = num[i];
        }
        return max;
    }

}

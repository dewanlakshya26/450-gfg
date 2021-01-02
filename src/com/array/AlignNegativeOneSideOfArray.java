package com.array;

public class AlignNegativeOneSideOfArray {

    public int[] alignNegative(int[] a){
        int start = 0;
        int end = a.length -1;
        int temp = 0;
        while(end > start){
            if (a[start] >= 0){
                if (a[end] < 0){
                    temp = a[start];
                    a[start] = a[end];
                    a[end]=temp;
                    start++;
                }
                end --;
            }
            else start++;

        }
        return a;
    }
}

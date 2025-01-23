package com.array;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,1};

    }
    public static void moveZeroToEnd(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

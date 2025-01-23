package com.array;

import java.util.Scanner;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,55,66,17,8,9};
        largestElement(arr);
        smallestElement(arr);
    }
    public static void largestElement(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }
    public static void smallestElement(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }

}

package com.array;

import java.util.Arrays;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,55,66,56,66,66,17,8,9};
        secondLargestElementSort(arr);
        secondLargestElementWithoutSort(arr);
    }
    public static void secondLargestElementSort(int[] arr){
//       sort the array in parameter
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i = arr.length-2; i > 0; i--) {
            if(arr[i]!=largest){

                System.out.println("second largest array element is : "+arr[i]);
                break;
            }
        }
    }

    public static void secondLargestElementWithoutSort(int[] arr) {
        // 1. find the largest element
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // 2. find the second-largest element
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }

    public static void findSecondLargestElementWithoutSortOptimal(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        // in case of array having negatuce number
//        int secondLargestNeg = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element most optimal : "+secondLargest);
    }
}

package com.array;

import java.util.HashSet;

public class RemoveDuplcateFromArray {
    public static void main(String[] args) {
        int[] arr = {5,67,2,2,2,8,8};
        int n = arr.length;
        int[] ans = removeDuplicatesUsingSet(arr,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        // optimal
        int answer = removeDuplicatesUsingTwoPointer(arr,n);
        System.out.println(answer);
    }
    public static int[] removeDuplicatesUsingSet(int[] arr,int n) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Create a new array with the correct size
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }

        return result;
    }
    public static int removeDuplicatesUsingTwoPointer(int[] arr,int n){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}

package com.array;

public class IfArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,4,5};
       boolean ans =  isSorted(arr,arr.length);
        System.out.println(ans);
    }
    public static boolean isSorted(int[] arr,int n){
        for (int i = 1; i < n; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}

package com.bitManipulation;

public class NonRepeatingNumber {
    public static void main(String[] args) {
        // in an array where each number APPEARs twice rather than one numebr find the number
        int[] arr = {1,3,5,3,5,3,3,4,1};
        findNonRepeated(arr);
    }
    public static void findNonRepeated(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i]; // XOR all elements together
        }
        System.out.println(ans); // The result will be the non-repeated element
    }

}

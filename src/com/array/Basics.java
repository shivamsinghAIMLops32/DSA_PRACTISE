package com.array;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Scanner scn =  new Scanner(System.in);

    // basics of array can hold same kind of data
        int[] arr = new int[5];
        System.out.println("Enter values in array");
        // filling values
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scn.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}

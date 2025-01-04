package com.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NoOfDistinctElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int answer= findDistinct(arr);
        System.out.println(answer);
    }

    // using HASHSET
    public static int findDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int value:arr){
            set.add(value);
        }
        return set.size();
    }

    // using O(n^2) arrayList on every contains O(N) *O(arr.length)
    public static int findDistinctBruteForce(int[] arr) {
        ArrayList<Integer> aList =new ArrayList<>();

        for (int value:arr){
            if(!aList.contains(value)){
                aList.add(value);
            }
        }
    return aList.size();

    }


}


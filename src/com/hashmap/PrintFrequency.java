package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        // Input array elements
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Input the size of the queries array
        System.out.println("Enter the size of the queries array:");
        int k = scn.nextInt();

        // Input query elements
        System.out.println("Enter the query elements:");
        int[] queries = new int[k];
        for (int i = 0; i < queries.length; i++) {
            queries[i] = scn.nextInt();
        }

        // Call the method to calculate occurrences
        ArrayList<Integer> ans = printElementsOccurrences(arr, queries);

        // Display the results
        System.out.println("Frequency of query elements:");
        for (int freq : ans) {
            System.out.print(freq+" ");
        }

        // Close the scanner
        scn.close();
    }

    // Method to calculate occurrences of query elements in the array O(arr*queries)
    public static ArrayList<Integer> printElementsOccurrences(int[] arr, int[] queries) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int val : queries) {
            int count = 0;
            for (int num : arr) {
                if (num == val) {
                    count++;
                }
            }
            arrList.add(count);
        }
        return arrList;
    }

    // using hashmap  O(m+n)
    public static ArrayList<Integer>  freqBYHashmap(int[] m ,int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0;i<m.length;i++){
            if(map.containsKey(m[i])){
                map.put(m[i],map.get(m[i])+1);
            }else{
                map.put(m[i],1);
            }

        }
        for (int i=0;i<n.length;i++){
            if(map.containsKey(n[i])){
                answer.add(map.get(n[i]));
            }else{
                answer.add(0);
            }
        }
        return answer;
    }
}

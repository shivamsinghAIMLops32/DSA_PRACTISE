package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static int nonRepeatingFirst(int n,int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else {
                map.put(val,1);
            }
        }

        for(int val : arr){
            if(map.get(val)==1){
              return val;
            }
        }
        return -1;
    }



}

package com.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PairSumK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
pairSum(arr,6);
    }
    // arr[i]+arr[j]==k where i!=j

    public static boolean pairSum(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int val:arr){
            if(map.containsKey(val)){

            map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = a-k;
            if((a!=b)&&map.containsKey(b)==true){
                return true;
            } else if ((a==b)&&map.containsKey(b)==true&&map.get(b)>1) {
                return true;
            }
        }
        return false;
    }
}

package com.hashmap;

import java.util.HashMap;

public class OperationsHashmap {
    public static void main(String[] args) {
        int[] arr = {2,10,50,40,70};
        HashMap<Integer,Integer>  map = new HashMap<>();

        for (int i = 0 ;i< arr.length;i++){
            map.put(i,arr[i]);
        }

        System.out.println(map);
        System.out.println("***************");
        // iterations to get keys of map
        for (int val : map.keySet()){
            System.out.println(val);
        }
        System.out.println("***********************");
        // iterations to get values of map
        for (int val : map.keySet()){
            System.out.println(map.get(val));
        }
    }
}

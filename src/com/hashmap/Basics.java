package com.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

// methods => put,get,remove,keypair,includes,containsKey
public class Basics {
    public static void main(String[] args) {
        // stores values in key and pair
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =1;i<=5;i++){
            map.put(i*10,i*100);
        }

        // remove by key
map.remove(20);

        // map with values
        System.out.println(map);

        // tells whether key is present in hashmap or map
        System.out.println(map.containsKey(20));

        System.out.println(map.get(30));  // value or null


        System.out.println("*************************");

        // ITERATION IN HASHMAP using KEYSET of each map index.
        for (int val : map.keySet()) {
            System.out.println(val);
        }
    }

}

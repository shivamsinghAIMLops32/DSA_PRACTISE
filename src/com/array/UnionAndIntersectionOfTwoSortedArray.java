package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,6,7};
        int[] ans = union(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

        System.out.println();
        ArrayList<Integer> ans2 = unionUsingTwoPointer(arr1,arr2);
        for (int i = 0; i < ans2.size(); i++) {
            System.out.print(ans2.get(i)+" ");
        }
    }

    // fin\d union using linkedhashset to maintain order
    public static int[] union(int[] arr1,int[] arr2){
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int[] ans = new int[set.size()];
        int i=0;
        for (Integer integer : set) {
            ans[i++]=integer;
        }
        return ans;
    }


    public static ArrayList<Integer> unionUsingTwoPointer(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) { // Correct comparison and increment
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++; // Increment i
            } else if (arr1[i] > arr2[j]) { // Correct comparison and increment
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++; // Increment j
            } else { // arr1[i] == arr2[j]
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]); // Or ans.add(arr2[j]); - they are equal
                }
                i++; // Increment both
                j++;
            }
        }

        while (i < arr1.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
    }
}

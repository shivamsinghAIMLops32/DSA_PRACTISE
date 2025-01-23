package com.array;

public class RightRotateByKth {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static  void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle k > n cases

        // 1. Reverse the whole array
        reverse(nums, 0, n - 1);

        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

package com.array;

public class LeftRotateElementsByKthPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    }

    public static void leftRotateByOnePlace(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }

    public static void leftRotateByKthPlace(int[] arr,int k){
        k = k%arr.length;
       for (int i = 0; i < k; i++) {
           leftRotateByOnePlace(arr);
       }
    }

    public static void leftRotateByKthPlaceBrute(int[] arr,int k,int n){
        k=k%n;

        // first store starting k elements in another array
        int[] temp = new int[k];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }

        // now move from kth position to empty starting index
        // start from i = k and put arr[i-k]=arr[i]
        for (int i = k; i < arr.length ; i++) {
            arr[i-k]=arr[i];
        }
        // again fill up last left indexes from temp arr
//        int j =0;
        for (int i = n-k; i < arr.length ; i++) {
//            arr[k]=temp[j];
//            j++;

            arr[i]=temp[i-(n-k)];

        }
        }
}

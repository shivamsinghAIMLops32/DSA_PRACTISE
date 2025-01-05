package com.bitManipulation;

public class EvenOrOdd {
    public static void main(String[] args) {
oddEven(8);
    }
    public static void oddEven(int num) {

        // to check rightmost bit use num&1;
        if((num&1)==1){
            System.out.println("odd");
        }else {
            System.out.println("even");
        }
    }
}

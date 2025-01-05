package com.backtracking;

import java.util.Scanner;

public class AllPermutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        permutations("abc","");
    }
    public static void permutations(String input,String output){
        if(input.equals("")){
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String left = input.substring(0,i);
            String right = input.substring(i+1);
            String ros = left+right;
        permutations(ros,output+ch);
        }
    }
}

package com.bitManipulation;

public class basics {
    public static void main(String[] args) {
        // 0 to 9 decimal no system
        // 22 => binary is 10110

decimalToBinary(22);
    }
    public static void decimalToBinary(int n) {
        String ans = "";
        while (n >= 1) {
            ans = (n % 2) + ans; // Prepend the remainder to the result
            n = n / 2; // Update the number
        }
        System.out.println(ans);
    }
    public static void binaryToDecimal(String n) {
        int ans = 0; // Initialize the result variable
        int length = n.length();

        for (int i = 0; i < length; i++) {
            // Convert the character at position (length - 1 - i) to an integer
            int bit = n.charAt(length - 1 - i) - '0';
            ans += bit * Math.pow(2, i); // Add the corresponding power of 2
        }

        System.out.println("Decimal value: " + ans);
    }

}

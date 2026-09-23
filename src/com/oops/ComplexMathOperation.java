package com.oops;

public class ComplexMathOperation {

    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(5, 2);
        z1.print();

        ComplexNumber z2 = new ComplexNumber(10, -20);
        z2.print();

        System.out.println("after operation");
        z2.add(z1);
        z2.print();

        System.out.println("after multiply operation");
        z1.multiply(z2);
        z1.print();
    }
}
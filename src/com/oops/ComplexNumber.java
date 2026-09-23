package com.oops;

public class ComplexNumber {
    int realPart;
    int imaginaryPart;
    final static String iota = "i";

    // default constructor
    ComplexNumber(){}

    ComplexNumber(int realPart,int imaginaryPart){
        this.realPart = realPart; this.imaginaryPart= imaginaryPart;
    }

    void print(){
        System.out.println("real part is " + this.realPart+" imaginary part is "+this.imaginaryPart+this.iota );
    }

    void add(ComplexNumber cp2){
        this.realPart += cp2.realPart;
        this.imaginaryPart += cp2.imaginaryPart;
    }

    void subtract(ComplexNumber cp2){
        this.realPart -= cp2.realPart;
        this.imaginaryPart -= cp2.imaginaryPart;
    }
}



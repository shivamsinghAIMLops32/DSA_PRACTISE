package com.oops;

public class ComplexNumber {
    double realPart;
    double imaginaryPart;
    final static String iota = "i";

    // default constructor
    ComplexNumber(){}

    ComplexNumber(double realPart,double imaginaryPart){
        this.realPart = realPart; this.imaginaryPart= imaginaryPart;
    }

    void print() {
        if (this.imaginaryPart >= 0) {
            System.out.println(this.realPart + " + " + this.imaginaryPart + iota);
        } else {
            System.out.println(this.realPart + " - " + Math.abs(this.imaginaryPart) + iota);
        }
    }

    void add(ComplexNumber z){
        this.realPart += z.realPart;
        this.imaginaryPart += z.imaginaryPart;
    }

    void subtract(ComplexNumber z){
        this.realPart -= z.realPart;
        this.imaginaryPart -= z.imaginaryPart;
    }

    void multiply(ComplexNumber z){
        // (x + yi)(a + bi) = (xa + xbi)+ (yai + ybi^2)  where i^2 is -1
        //   xa + xbi + yai - yb
        // so finally group imaginary and real together => (za-yb)+(xb + ya)i
        double newReal = this.realPart * z.realPart - this.imaginaryPart * z.imaginaryPart;
        double newImaginary = this.realPart * z.imaginaryPart + this.imaginaryPart * z.realPart;

        this.realPart = newReal;
        this.imaginaryPart = newImaginary;
    }

    void divide(ComplexNumber z) {
        // Formula: (x + yi) / (a + bi) = [(xa + yb) + (ya - xb)i] / (a^2 + b^2)

        double denominator = z.realPart * z.realPart + z.imaginaryPart * z.imaginaryPart;

        if (denominator == 0) {
            throw new ArithmeticException("Division by zero (complex number 0 + 0i)");
        }

        double newReal = (this.realPart * z.realPart + this.imaginaryPart * z.imaginaryPart) / denominator;
        double newImaginary = (this.imaginaryPart * z.realPart - this.realPart * z.imaginaryPart) / denominator;

        this.realPart = newReal;
        this.imaginaryPart = newImaginary;
    }

}



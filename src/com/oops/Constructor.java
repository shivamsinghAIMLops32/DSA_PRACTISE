package com.oops;

public class Constructor {
   public static class Car{
        int seats;
        String name;
        double length;
// normally this run when object is being created, but we usually don't really create this until we need
       Car(){}

       // constructor overloading
      // parameterised constructor
       Car(int seats,String name,double length){
           this.seats = seats;
           this.name = name;
           this.length = length;  // length = length means it will confuse language to put on value so use this keyboard to reference this class val
       }

        void print(){
            System.out.println("car name is "+ name + " with seats "+seats+" with length "+length);
        }
    }

    public static void main(String[] args) {
        Car c = new Car(5,"audi",4.32); // unless we create a parameterised constructor it will have default value of each field
        c.print();
    }

}



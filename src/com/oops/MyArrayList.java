package com.oops;

import java.util.Arrays;

class DynamicArrayList{
    int[] array;
    private int size; // this is like length tells how much is array filled with elements
    private final static  int DEFAULT_CAPACITY = 10;

    DynamicArrayList(){
        array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    DynamicArrayList(int initialCapacity){
        if (initialCapacity <= 0) {
            this.array = new int[DEFAULT_CAPACITY];
        } else {
            this.array = new int[initialCapacity];
        }
        this.size = 0;
    }

    // methods

    // appending at last
    void append(int num){
        if(size == this.array.length){
            grow();
        }
        array[size] = num;
        size++;
    }

    // doubling array
    private void grow(){
        int newCapacity = this.array.length *2;
        this.array = Arrays.copyOf(this.array,newCapacity);
    }

    // size getter
    int size(){
        return this.size;
    }

    // get capacity
    int getCapacity(){
        return this.array.length;
    }

    // replace
    int replace(int newValue,int index){
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + this.size);
        }
        int oldValue = this.array[index];
        this.array[index] = newValue;
        return oldValue;
    }

    // find element at index
    int get(int index){
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + this.size);
        }
        return array[index];
    }

    // find if element exist in array
    boolean find(int num){
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i]==num){
                return true;
            }
        }
        return false;
    }


}


public class MyArrayList {
    public static void main(String[] args) {
        DynamicArrayList arr = new DynamicArrayList(5);
        arr.append(20);


    }
}

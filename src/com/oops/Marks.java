package com.oops;

public class Marks {
public static class StudentData{
    String name;
    int rno;
    int[] marks;

    StudentData(int arraySize){    // basically when object will be created this will automatically run
        this.marks = new int[arraySize];
    }

}
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        s1.marks[0] = 45;
    }
}

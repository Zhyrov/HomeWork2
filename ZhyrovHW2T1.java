package com.epam.lesson2;

public class ZhyrovHW2T1 {
    public static void main(String [] arg){
        int data1 = 13409;
        int data2 = 2385;
        System.out.println("data1=" + data1 + "; data2=" + data2);
        data1 += data2;
        data2 = data1 - data2;
        data1 -=data2;
        System.out.println("After convers:");
        System.out.println("data1=" + data1 + "; data2=" + data2);
    }
}

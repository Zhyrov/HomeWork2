package com.epam.lesson2;

public class ZhyrovHW2T3 {
    public static void main(String [] arg){
        double pound = 2;
        double kg = pound*0.4536;
        double gram = kg%1*1000;
        int gramInt = (int) gram;
        int kgInt = (int) kg;
        System.out.println(kgInt + " kilogram " + gramInt + " gram");
    }
}

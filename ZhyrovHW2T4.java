package com.epam.lesson2;

public class ZhyrovHW2T4 {
    public static void main(String [] arg){
        int deposit = 10000;
        int month = 6;
        double percent = 12.1;
        double profit = deposit*percent*0.01*month/12;
        System.out.println("profit= " + profit);
    }
}

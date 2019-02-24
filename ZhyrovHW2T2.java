package com.epam.lesson2;

public class ZhyrovHW2T2 {
    public static void main(String [] arg){
        int number = 123;
        int hundred = number%10;
        int ten = number/10%10;
        int unit = number/100;
        int data =  hundred*100 + ten*10 + unit;
        int result = number - data;
        System.out.println(result);
    }
}

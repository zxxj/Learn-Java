package com.dataType.variable;

public class variableDemo1 {
    public static void main(String[] args) {

        int age = 18; // =是赋值的意思
        System.out.println(age);

        // 用变量的好处
        int num = 9;
        System.out.println(num);

        System.out.println("-----------");
        double price = 188.5;
        price = (price - 100) + 20;
        System.out.println(price);

        System.out.println("-----------");
        int big = 2;
        int sub = 1;
        int count = 0;
        int totalMoney = 0;

        int one = (big * 3) + sub;
        int two = big + sub;
        count = 3 + 1 + 1 + 1;
        totalMoney = one + two;
        System.out.println(totalMoney);
        System.out.println(count);
    }
}

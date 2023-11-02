package com.oop;

public class GirlTest {
    public static void main(String[] args) {

        Girl g1 = new Girl();

        g1.setName("大美女");
//        g1.setAge(18);
        g1.setAge(22);

        String g1Name = g1.getName();
        int g1Age = g1.getAge();
        System.out.println(g1Name);
        System.out.println(g1Age);
    }
}

package com.oop;

public class PhoneTest {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.price = 2000;
        p.title = "小米手机";

        p.call();
        p.playGame();
    }
}

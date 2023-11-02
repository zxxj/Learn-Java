package com.oop;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "zxx";
        p1.age = 23;
        p1.gender = '男';
        p1.height = 1.75;
        p1.weight = 118.1;

        p1.eat();
        p1.sleep();
        p1.editCode();

        Person p2 = new Person();
        p2.name = "coder";
        p2.age = 99;
        p2.height = 99.99;
        p2.weight = 99.98;
        p2.eat();
        p2.sleep();
        p2.editCode();
    }
}

package com.oop;

public class Person {

    String name;
    int age;
    double height;
    double weight;
    char gender;

    public void eat() {
        System.out.println(this.name + "吃饭");
    }

    public void sleep() {
        System.out.println(this.name + "会睡觉");
    }

    public void editCode() {
        System.out.println(this.name + "喜欢敲代码");
    }
}

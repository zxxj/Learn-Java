package com.oop;

public class Girl {
    // 利用权限修饰符与get/set方法来确保数据的安全性

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if(age >= 18 && age < 50) {
            this.age = age;
        }else {
            System.out.println("我不要");
        }
    }

    public int getAge() {
        return this.age;
    }
}

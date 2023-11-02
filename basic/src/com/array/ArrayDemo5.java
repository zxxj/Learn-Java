package com.array;

public class ArrayDemo5 {
    public static void main(String[] args) {

        // 数组的动态初始化和常见问题

        // 1.数组动态初始化格式: 数据类型[] 数组名 = new 数组类型[数组长度];
        // 在动态创建数组的时候,需要手动指定数组的长度再由虚拟机给出默认的初始化值
        /* 数组默认初始化值的规律:
            byte short int long  => 0
            float double => 0.0
            char => '\u0000'
            boolean => false
            引用数据类型: String => null
         */


        // 2.存储50个学生姓名,但是学生名字是未知的
        String[] names = new String[50];

        // 添加学生
        names[0] = "zxx";
        names[1] = "xin";

        // 获取值
        System.out.println(names[0]); // zxx
        System.out.println(names[1]); // xin
        System.out.println(names[2]); // null

        // 3.测试数组默认数据类型
        int[] testArr = new int[3];
        System.out.println(testArr[0]); // 0
        System.out.println(testArr[1]); // 0
        System.out.println(testArr[2]); // 0

        // 4.索引越界异常
        System.out.println(testArr[10]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3 at com.数组.ArrayDemo5.main(ArrayDemo5.java:38)
    }
}

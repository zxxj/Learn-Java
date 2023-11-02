package com.dataType.variable;

public class variableDemo2 {
    public static void main(String[] args) {
        // 一开始没有乘客
        int person = 0;

        // 第一站,上去两位乘客
        person = person + 2;

        // 第二站,上去两位乘客,下来一位乘客
        person = person + (2 - 1);

        // 第三站,上去两位乘客,下来一位乘客
        person = person + (2 - 1);

        // 第四站,下来一位乘客
        person = person - 1;

        // 第五站,上去一位乘客
        person = person + 1;
        System.out.println(person);
    }
}

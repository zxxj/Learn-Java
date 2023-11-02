package com.array;

import java.util.Random;

public class ArrayDemo6 {
    public static void main(String[] args) {

        // 1.求最大值
        int[] nums = { 33, 5, 22, 44, 55, 18 };
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }

        System.out.println(max);

        // 2.生成10个随机数,求和
        int[] nums2 = new int[10];
        Random r = new Random();
        int sum = 0;

        for(int i = 0; i < nums2.length; i++) {
            sum += nums2[i] + r.nextInt(100) + 1;
        }

        System.out.println(sum);

        // 3.生成10个随机数,求平均数
       int avgNum = (sum / nums2.length);

       // 4.计算有多少数字小于平均数
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if(avgNum > nums2[i]) count ++;
        }

        System.out.println(count);

        // 5.交换数据
        int[] nums3 = { 1, 2, 3, 4, 5 };

        for(int i = 0, j = nums3.length - 1; i < j; i ++, j --) {
            int temp = nums3[i]; // 1 2 3 4 5
            nums3[i] = nums3[j]; // 5 4 3 2 1
            nums3[j] = temp; // 1 2 3 4 5
        }

        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }

        // 6.打乱数组
        int[] num4 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < num4.length; i++) {
            int randomNumber = r.nextInt(num4.length);
            num4[i] = num4[randomNumber];
        }

        for (int i = 0; i < num4.length; i++) {
            System.out.println(num4[i]);
        }
    }
}

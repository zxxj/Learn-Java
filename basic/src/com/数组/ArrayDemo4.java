package com.数组;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 1.遍历数组并求和
        int[] nums = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println(sum);

        // 2.有多少能被3整除的数字
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for(int i = 0; i< nums2.length; i++) {
            if(nums2[i] % 3 == 0) count ++;
        }

        System.out.println(count);

        // 3.奇数扩大两倍,偶数变成二分之一
        int[] nums3 = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < nums3.length; i++) {
            if(nums3[i] % 3 == 0) {
                nums3[i] = nums3[i] * 2;
            }else {
                nums3[i] = nums3[i] / 2;
            }
        }

        System.out.println(nums3[1]);
        System.out.println("test git");
    }
}

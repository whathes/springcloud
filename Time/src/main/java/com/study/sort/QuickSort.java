package com.study.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,-1,6,5,7,9,3};
        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------------------");
        int l = 0;
        int r = nums.length-1;
        sortNums(nums,l,r);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortNums(Integer[] nums, int l, int r) {
        int left = l;
        int right = r;
        if(left>=right)
            return;
        int flag = nums[left];
        while (left<right){
            while (left < right && nums[right]>=flag){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left]<=flag){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = flag;
        sortNums(nums,l,left-1);
        sortNums(nums,left+1,r);
    }
}

package com.study.sort;

import com.sun.javafx.util.TempState;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1,-1,6,5,7,9,3};
//        Random r = new Random();
//        for (int i = 0; i<nums.length;i++ ){
//            nums[i]= r.nextInt();
//            System.out.print(nums[i]+" ");
//        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static Integer[] mergeSort(Integer[] nums) {
        int l = 0;
        int r = nums.length-1;
        sortNums(nums,l,r);
        return nums;
    }

    private static void sortNums(Integer[] nums, int l, int r) {
        if (l>=r){
            return;
        }
        int[] temp = new int[nums.length];
        int mid = (l+r)/2;
        sortNums(nums,l,mid);
        sortNums(nums,mid+1,r);
        mergeNums(nums,l,mid,r,temp);
    }

    private static void mergeNums(Integer[] nums, int l, int mid, int r,int[] temp) {
        int start = l;
        int i = l;
        int j = mid+1;
        while (i<=mid && j<=r){
            if (nums[i]<nums[j]){
                temp[start++] = nums[i++];
            }
            if (nums[i]>nums[j]){
                temp[start++] = nums[j++];
            }
        }
        while (i<=mid){
            temp[start++] = nums[i++];
        }
        while (j<=r){
            temp[start++] = nums[j++];
        }
        for(int k = l;k<=r;k++){
            nums[k] = temp[k];
        }

    }
}

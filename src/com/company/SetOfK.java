package com.company;

import java.util.Arrays;

public class SetOfK {
    public static void main(String[] args) {
        int[] nums = {16,21,26,35};
        int[] nums2 = {1,2,3,3,4,4,5,6};
        int[] nums3 = {2,5,6,8,9,10};
        int[] nums4 = {1,2,3,3,4,4,5,6};
        int k = 4;

        for (int num : nums4)
            System.out.println(num);
//
//        System.out.println(isConsecutive(nums, k));
//        System.out.println(isConsecutive(nums2, k));
//        System.out.println(isConsecutive(nums3, 3));
//        System.out.println(isConsecutive(nums4, 4));
    }

    static boolean isConsecutive(int[] nums, int k){
        boolean q = false;

        //Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            for (int j =0; j<nums.length-i-1; ++j)
            if (nums[j+1]<nums[j]){
                int swap = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = swap;
            }
        }

        return q;
    }
}

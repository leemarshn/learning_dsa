package com.company;

public class SumOfRunningNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
       // new SumOfRunningNumbers().runningSum(nums);
        for (int num:new SumOfRunningNumbers().runningSum(nums)) {
            System.out.println(num);
        }
    }

    int[] runningSum(int[] array){
        int count = 0;
        int[] nums = new int[array.length];
        for (int i=0; i<array.length; i++){
            count +=array[i];
            nums[i] = count;
        }
        return nums;
    }
}

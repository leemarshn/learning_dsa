package com.company;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(getNumsWithEvenDigits(nums));

    }

    static int getNumsWithEvenDigits(int[] num){
        int r= 0;
        for (int i=0; i<num.length; i++){
            String nm = String.valueOf(num[i]);
            if (nm.length()%2==0){
                r++;
            }
        }
        return r;
    }
}

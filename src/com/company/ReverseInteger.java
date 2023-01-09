package com.company;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(876));
    }

    static int reverse(int num){
        int sub = num;
        int reversed = 0;

        while (sub !=0){

            reversed = reversed *10 + sub %10;
            sub = sub/10;

        }
        
        return reversed;
    }
}

package com.company;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(Integer x ){
        if (x<0)
            return false;
        int sub = x;
        int reversed = 0;
        while (sub != 0) {
            reversed = reversed * 10 + sub % 10;
            System.out.println("reversed:" + reversed);
            sub /= 10;
            System.out.println("sub: " + sub);

        }
        return x == reversed;
    }
}

package com.company;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random random = new Random();

        // Generate 10 random numbers below 15
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(15);  // Generate random number between 0 and 14
        }

        // Print the random numbers
        for (int i = 0; i < 10; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }

}

package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class SortByLeeNBubble {


    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        Instant start = Instant.now();

        bubbleSort(array);
        for (int arr:array) {
            System.out.println(arr);
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long seconds = timeElapsed.toSeconds();

        System.out.println(seconds);

    }

    static void bubbleSort(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j =1+i; j<array.length; j++){
                int temp;
                if (array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

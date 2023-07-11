package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class ImprovedBubbleSort {


    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100000);
        }
        Instant start = Instant.now();

        bubbleSort(array, array.length);
        for (int arr:array) {
            System.out.println(arr);
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long seconds = timeElapsed.toSeconds();

        System.out.println(seconds);

    }


   static void bubbleSort(int[] array, int n){
        int pass, i,temp,  swapped =1;
        for (pass=n-1; pass >=0 && swapped==1; pass--){
            swapped = 0;

            for (i=0; i<=pass -1; i++){
                if(array[i]> array[i+1]){
                    temp =array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = 1;
                }
            }

        }
    }
}

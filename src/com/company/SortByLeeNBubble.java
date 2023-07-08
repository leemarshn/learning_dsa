package com.company;

import java.util.Arrays;

public class SortByLeeNBubble {


    public static void main(String[] args) {
        int[] array;
        array = new int[]{3,60,35,2,45,320,5};
        bubbleSort(array);
        for (int arr:array) {
            System.out.println(arr);
        }
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

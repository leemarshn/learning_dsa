package com.company;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo {
    // Create a list of Strings.
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>( );
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        Stream<String> myStream = myList.stream();
        Spliterator<String> splitItr = myStream.spliterator();
        while(true) {
            if (!splitItr.tryAdvance(System.out::println)) break;
            ;
        }
    }

}

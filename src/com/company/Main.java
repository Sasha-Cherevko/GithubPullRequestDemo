package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private static final int Size = 10;
    private static final int min = 10;
    private static final int max = 20;
    private static final int diff = (max - min) + 1;

    public static void main(String[] args) {
        // show me you Stream API power
        System.out.println("test");

        int[] array = new  int[Size];
        Random random = new Random();
        for (int i = 0; i < Size; i++) {
            array[i] = random.nextInt(diff + min);
        }
        IntStream streamFromArrays = Arrays.stream(array);
        streamFromArrays.sorted().forEach(value -> System.out.print(value + " "));
    }

}

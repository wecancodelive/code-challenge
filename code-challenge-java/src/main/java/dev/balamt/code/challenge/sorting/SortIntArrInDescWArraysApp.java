package dev.balamt.code.challenge.sorting;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortIntArrInDescWArraysApp {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,5,7,3,6,-4,8,9};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i : arr) {
            JavaCodeChallengeUtil.printLoopWithCommaSeparation(i);
        }
        /*
         * Output:
         *  9, 8, 7, 6, 5, 3, 2, 1, -4,
         */
    }
}

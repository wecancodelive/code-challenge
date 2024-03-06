package dev.balamt.code.challenge.sorting;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortIntArrInDescWStreamsApp {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,3,6,-1,0,4,8,9};

        arr = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        arr = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(v -> v).toArray();

        for (int i : arr) {
            JavaCodeChallengeUtil.printLoopWithCommaSeparation(i);
        }
    }
}

package dev.balamt.code.challenge.thirdlargestnumber;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.Arrays;

public class ThirdLargestNoWArraysApp {
    public static void main(String[] args) {
        int[] arr = { 100,14, 46, 47, 94, 98, 52, 86, 36, 93, 89, -23 };
        Arrays.sort(arr);
        JavaCodeChallengeUtil.
                printLine("Third largest item in the array is ", arr[arr.length - 3]);
    }
}

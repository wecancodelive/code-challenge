package dev.balamt.code.challenge.thirdlargestnumber;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestNoWStreamsApp {
    public static void main(String[] args) {
        int[] arr = { 100,14, 46, 47, 94, 98, 52, 86, 36, 94, 89, -23 };

        List<String> sortedArray = Arrays.stream(arr).asLongStream().sorted().mapToObj(String::valueOf).collect(Collectors.toList());
        JavaCodeChallengeUtil.
                printLine("Third largest item in the array is ", sortedArray.get(sortedArray.size() - 3));
    }
}

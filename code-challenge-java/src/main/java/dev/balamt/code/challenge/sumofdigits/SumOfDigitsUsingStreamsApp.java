package dev.balamt.code.challenge.sumofdigits;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.Arrays;

public class SumOfDigitsUsingStreamsApp {
    public static void main(String[] args) {
        int n = 12345;
        String[] numbersAsStringArr = Integer.toString(n).split("");
        int answer = Arrays.stream(numbersAsStringArr)
                .mapToInt(Integer::parseInt).reduce(0, Integer::sum);

        JavaCodeChallengeUtil.printLine(answer);
    }
}

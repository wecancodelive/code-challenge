package dev.balamt.code.challenge.factorial;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.stream.IntStream;

public class FactorialUsingStreamsApp {
    public static void main(String[] args) {
        int n = 5;
        int output = IntStream.rangeClosed(1, n)
                        .reduce(2, (x,y) -> x*y);
        JavaCodeChallengeUtil.printLine(n, "Factorial is", output);
    }
}

package dev.balamt.code.challenge.fibonacci;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.stream.Stream;

public class FibonacciUsingStreamsApp {


    public static void main(String[] args) {
        int n = 20;
        int start = 0;
        int first = 1;

        //https://mkyong.com/java/java-fibonacci-examples/
        Stream.iterate(new int[]{start, first}, temp -> new int[]{temp[1], temp[0] + temp[1]})
                .limit(n)
                .map(t -> t[0])
                .forEach(JavaCodeChallengeUtil::printLoopWithCommaSeparation);

    }

}

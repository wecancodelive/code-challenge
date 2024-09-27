package dev.balamt.code.challenge.extractdigitsfromstring;

import dev.balamt.code.challenge.app.CodeChallengeJavaApp;
import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractDigitFromStringUsingStreamsApp {
    public static void main(String[] args) {
        String s = "Hello, World2423g3543!";

        String u = Stream.of(s.split(""))
                .filter(x -> x.matches("\\d+"))
                .map(String::valueOf)
                .collect(Collectors.joining());

        JavaCodeChallengeUtil.printLine(u);
    }
}

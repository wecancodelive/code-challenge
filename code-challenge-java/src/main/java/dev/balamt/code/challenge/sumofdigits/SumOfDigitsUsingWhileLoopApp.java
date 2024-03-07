package dev.balamt.code.challenge.sumofdigits;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class SumOfDigitsUsingWhileLoopApp {
    public static void main(String[] args) {
        int n = 1234;
        int answer = 0;

        while(n > 0){
            answer+=n%10;
            n = n/10;
        }
        JavaCodeChallengeUtil.printLine(answer);
    }
}

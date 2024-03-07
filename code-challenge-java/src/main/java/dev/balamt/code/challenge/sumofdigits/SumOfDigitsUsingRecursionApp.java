package dev.balamt.code.challenge.sumofdigits;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class SumOfDigitsUsingRecursionApp {
    public static void main(String[] args) {
        int n = 1234;
        int answer = sumOfDigits(0, n);
        JavaCodeChallengeUtil.printLine(answer);
    }

    private static int sumOfDigits(int sum, int n) {
        if(n <= 0)
            return sum;
        sum +=n%10;
        return sumOfDigits(sum, (n/10));
    }
}

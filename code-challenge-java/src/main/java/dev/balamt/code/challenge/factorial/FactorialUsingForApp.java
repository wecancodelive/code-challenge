package dev.balamt.code.challenge.factorial;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class FactorialUsingForApp {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        for(int i = 1; i<=n; i++){
            factorial *= i;
            /*
             * factorial = factorial * i;
             */
        }

        JavaCodeChallengeUtil.printLine(n, "Factorial is", factorial);
    }
}

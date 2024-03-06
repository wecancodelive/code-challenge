package dev.balamt.code.challenge.factorial;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class FactorialUsingRecursiveApp {
    public static void main(String[] args) {
        int n = 5;
        int output = findFactorial(n);
        JavaCodeChallengeUtil.printLine(n, "Factorial is", output);
    }

    private static int findFactorial(int n){
        if(n == 0)
            return 1;
        else
            return (n * findFactorial(n-1));
    }
}

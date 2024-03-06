package dev.balamt.code.challenge.fibonacci;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class FibonacciUsingRecursionApp {
    static int start = 0;
    static int first = 1;
    static int temp;

    public static void main(String[] args) {
        int n = 20;

        JavaCodeChallengeUtil.printLoopWithCommaSeparation(start, first);
        printFibonacciNumber(n - 2);
        /*
            Output:
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
         */
    }

    private static void printFibonacciNumber(int n) {
        if(n > 0) {
            temp = start + first;
            start = first;
            first = temp;
            JavaCodeChallengeUtil.printLoopWithCommaSeparation(temp);
            printFibonacciNumber(n - 1);
        }
    }
}

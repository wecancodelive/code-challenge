package dev.balamt.code.challenge.fibonacci;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class FibonacciUsingForLoopApp {
    public static void main(String[] args) {
        int n = 20;

        int start = 0;
        int first = 1;
        int temp;

        JavaCodeChallengeUtil.printLoopWithCommaSeparation(start, first);

        for(int i=2; i<=n;i++){
            temp = start + first;
            start = first;
            first = temp;
            JavaCodeChallengeUtil.printLoopWithCommaSeparation(temp);
        }
    }
}

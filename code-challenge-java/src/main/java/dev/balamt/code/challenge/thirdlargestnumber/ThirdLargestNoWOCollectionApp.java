package dev.balamt.code.challenge.thirdlargestnumber;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class ThirdLargestNoWOCollectionApp {
    public static void main(String[] args) {
        int[] arr = { 100,14, 46, 47, 94, 98, 52, 86, 36, 94, 89, -23 };
        int[] sorted = sortedArray(arr);

        JavaCodeChallengeUtil.printLine("Input Array ");
        for (int a : arr
                ) {
            JavaCodeChallengeUtil.printLine(a);
        }

        JavaCodeChallengeUtil.
                printLine("Third largest item in the array is ", sorted[2]);
    }

    private static int[] sortedArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int tmp;
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}

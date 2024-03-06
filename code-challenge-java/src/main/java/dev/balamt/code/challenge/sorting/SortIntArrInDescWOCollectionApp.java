package dev.balamt.code.challenge.sorting;

import dev.balamt.code.challenge.app.util.JavaCodeChallengeUtil;

public class SortIntArrInDescWOCollectionApp {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,7,3,7,8,3,4,8,9};

        for(int i=0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            JavaCodeChallengeUtil.printLoopWithCommaSeparation(arr[i]);

            /*
             * Output:
             * 9, 8, 8, 7, 7, 5, 4, 3, 3, 2, 1,
             */
        }

    }
}

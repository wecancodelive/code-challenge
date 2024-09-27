package dev.balamt.code.challenge.splitintothreeandreverse;

import java.util.ArrayList;
import java.util.List;

/**
 * Given String s1 = "ahuryilwaxc";
 * Split the String into 3 characters by 3 char.
 * Reverse the 3 Char
 * If Char length is < 3
 *      Do not reverse
 */
public class SplitStringIntoThreeAndReverseOnlyIfThreeApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String s1 = "ahuryilwaxc";
        String s2 = "uhaiyrawlxc";
        int n = 3;
        //Split the String into n times and get the arraylist
        List<String> splitted = splitInto(s1,n);
        //replace if length == 3 with reversed string, else don't reverse just replace.
        splitted.replaceAll(str -> str.length() == n ? new StringBuilder(str).reverse().toString() : str);
        //Use String.join to combine all the elements in the String ArrayList
        if (s2.equals(String.join("", splitted))) {
            System.out.println("Matching");
        }

        //String revString = splitAndReverse(input);

        //Split the String into Char Arr
        //Read 3 char from the array
        //reverse the last char
        //if the char array has less than 3 letters do not reverse

//        String[] input = s1.split("");
//
//        int y = input.length/3;
//        System.out.println(y);
//        int counter = 2;
//
//        for(int i = 0; i< input.length-1;i++){
//            for(int j=counter; j>=0;j--) {
//                System.out.print(input[j] + " ");
//            }
//            counter =2;
//        }

//        System.out.println(s1.toCharArray().length %3==0);

        long endTime = System.nanoTime();
        // Calculate the execution time in milliseconds
        long executionTime = (endTime - startTime); // Convert nanoseconds to milliseconds

        System.out.println("Execution Time: " + executionTime + " nanoseconds");

    }

    private static List<String> splitInto(String input, int n) {
        List<String> as = new ArrayList<>();
        for (int x = 0; x < input.length(); x += n) {
            as.add((input).substring(x, Math.min(x + n, input.length())));
        }
        return as;
    }
}

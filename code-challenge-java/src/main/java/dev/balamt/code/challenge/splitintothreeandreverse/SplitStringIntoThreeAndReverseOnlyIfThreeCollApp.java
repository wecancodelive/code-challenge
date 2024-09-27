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
public class SplitStringIntoThreeAndReverseOnlyIfThreeCollApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String s1 = "ahuryilwaxc";
        String s2 = "uhaiyrawlxc";

        List<String> splitted = splitInto(s1);
        splitted.replaceAll(str -> str.length() == 3 ? reverse(str) : str);
        if (s2.equals(String.join("", splitted))) {
            System.out.println("Matching");
        }
        long endTime = System.nanoTime();

        // Calculate the execution time in milliseconds
        long executionTime = (endTime - startTime); // Convert nanoseconds to milliseconds
        System.gc();
        System.out.println("Execution Time: " + executionTime + " nanoseconds");
    }

    private static List<String> splitInto(String input) {
        List<String> as = new ArrayList<>();
        for (int x = 0; x < input.length(); x += 3) {
            as.add((input).substring(x, Math.min(x + 3, input.length())));
        }
        return as;
    }

    private static String reverse(String st) {
        StringBuilder sj = new StringBuilder();
        for(int x = st.length(); x>0; x--){
            sj.append(st.substring(x));
        }
        return sj.toString();
    }
}
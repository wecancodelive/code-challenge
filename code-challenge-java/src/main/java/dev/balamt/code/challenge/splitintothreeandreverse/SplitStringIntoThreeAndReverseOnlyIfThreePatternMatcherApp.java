package dev.balamt.code.challenge.splitintothreeandreverse;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Given String s1 = "ahuryilwaxc";
 * Split the String into 3 characters by 3 char.
 * Reverse the 3 Char
 * If Char length is < 3
 *      Do not reverse
 */
public class SplitStringIntoThreeAndReverseOnlyIfThreePatternMatcherApp {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String s1 = "ahuryilwaxc";
        String s2 = "uhaiyrawlxc";

        List<String> splitted = splitInto(s1,3);

        splitted.replaceAll(str -> str.length() == 3 ? reverse(str) : str);
        System.out.println(splitted);
        if (s2.equals(String.join("", splitted))) {
            System.out.println("Matching");
        }
        long endTime = System.nanoTime();

        // Calculate the execution time in milliseconds
        long executionTime = (endTime - startTime); // Convert nanoseconds to milliseconds
        System.gc();
        System.out.println("Execution Time: " + executionTime + " nanoseconds");
    }

    private static List<String> splitInto(String input, int n) {
        return Pattern.compile(".{0,"+n+"}")
                .matcher(input)
                .results()
                .peek(x -> System.out.println(x.group()))
                .map(MatchResult::group)
                .collect(Collectors.toList());
    }

    private static String reverse(String st) {
        StringBuilder sj = new StringBuilder();
        for(int x = st.length()-1; x>=0; x--){
            System.out.println(x + " ss " + st.trim().substring(x));
            sj.append(st.substring(x));
        }
        return sj.toString();
    }
}
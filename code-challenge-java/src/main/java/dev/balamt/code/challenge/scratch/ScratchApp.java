package dev.balamt.code.challenge.scratch;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.*;

public class ScratchApp {
    public static void main(String[] args) {
        String s = "Hello, World2423g3543!";

        String u = Stream.of(s.split(""))
                .filter(x -> x.matches("\\d+"))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.print(u);


    }

}

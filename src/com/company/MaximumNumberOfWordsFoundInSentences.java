package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentences m = new MaximumNumberOfWordsFoundInSentences();
        System.out.println(m.mostWordsFound(new String[] {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"}));
    }

    public int mostWordsFound(String[] sentences) {

        int counter = 0;
        int max = 0;

        for (String text : sentences) {

            Matcher matcher = Pattern.compile("\\s").matcher(text);

            while (matcher.find()) {
                counter++;
            }
            if (counter > max) {
                max = counter;
            }
            counter = 0;
        }
        return max + 1;

    }
}

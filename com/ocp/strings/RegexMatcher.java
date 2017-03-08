package com.ocp.strings;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by agermenos on 3/7/17.
 */
public class RegexMatcher {
    public static void main(String args[]){
        String text = "I am fine to dine between sine and nine. What of diner?";
        String regex = "[fdn]ine";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group() + " Found starting at " + matcher.start() + " and ending at " + matcher.end());
        }
    }
    @Test
    public void testNegation(){
        String text = "123123carcar";
        String regex = "([123])[car]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group() + " Found starting at " + matcher.start() + " and ending at " + matcher.end());
        }
        System.out.println("Replacing text in text: " + text.replaceAll("123","X"));
        System.out.println("Text altered : " + text);
    }
}

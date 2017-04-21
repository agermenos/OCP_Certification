package com.ocp.strings;

/**
 * Created by agermenos on 3/8/17.
 */
public class IndexOf {
    public static void main(String args[]){
        String test="paint the cup and the plate";
        System.out.println(test.indexOf('t'));
        System.out.println(test.lastIndexOf('t', 15));

        System.out.println(test.indexOf("the"));
        System.out.println(test.indexOf('t', 15));

        System.out.println(test.lastIndexOf("the"));
        System.out.println(test.lastIndexOf('t'));

    }
}

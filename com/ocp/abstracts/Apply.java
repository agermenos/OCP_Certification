package com.ocp.abstracts;

import java.util.*;
import static com.ocp.util.Print.*;
/*  Thinking in Java, at it's finest :) */

class Upcase extends Processor {
    public String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor {
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    public String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
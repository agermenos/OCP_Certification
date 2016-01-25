package com.ocp.abstracts.filters;

import com.ocp.abstracts.Processable;

public class Filter implements Processable{
    public String name() {
        return getClass().getSimpleName();
    }
    public Object process(Object input) { return input; }
}
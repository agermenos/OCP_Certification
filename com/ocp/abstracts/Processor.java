package com.ocp.abstracts;

class Processor implements Processable{
    public String name() {
        return getClass().getSimpleName();
    }
    public Object process(Object input) { return input; }
}

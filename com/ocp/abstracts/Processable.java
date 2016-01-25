package com.ocp.abstracts;

/**
 * Created by Alejandro on 1/25/16.
 */
public interface Processable {
    String name();
    Object process(Object input);
}

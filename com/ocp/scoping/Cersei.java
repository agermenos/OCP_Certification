package com.ocp.scoping;

/**
 * Created by Alejandro on 9/5/2015.
 */
public class Cersei extends Queen {
    public Cersei() {
        super("Cersei", new Throne("Iron"));
    }

    public String claim (){
        return ("I, " + getName() + " claim the @#$@#!!" + this.getThrone().getName() + " for me and my children/nephews!!");
    }
}

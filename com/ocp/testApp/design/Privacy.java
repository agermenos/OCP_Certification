package com.ocp.testApp.design;

public class Privacy {
    private int i;

    public void modifyOther(Privacy a1) {
        a1.i = 20;// ----> But but... isn't i private? Well, yes, but we're inside Privacy class, right?
    }
}

/**

 WATCH AND LEARN


 */
class X{
    public void remodify(Privacy p){
       // p.i=3; ---->   i has private access in com.ocp.testApp.design.Privacy
    }
}


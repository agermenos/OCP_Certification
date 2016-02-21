package com.ocp.inner;

/**
 * Created by Alejandro on 2/2/16.
 */
public class Outer {
    private double d = 10.0;
    public Inner i =new Inner();
    private class Inner{
        private String peace="none";
        public void m1(){
            //this.d=5; BEWARE OF THIS!!!
        }
    }
    public String showInnerPeace(){
        return i.peace;
    }
    public static void main(String args[]){
        Outer o=new Outer();
        System.out.println("Inner peace:" + o.showInnerPeace());
    }
}
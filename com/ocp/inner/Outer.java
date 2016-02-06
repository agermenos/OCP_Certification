package com.ocp.inner;

/**
 * Created by Alejandro on 2/2/16.
 */
public class Outer {
    private double d = 10.0;
    class Inner{
        public void m1(){
            //this.d=5; BEWARE OF THIS!!!
        }
    }
    public static void main(String args[]){

    }
}
package com.ocp.testApp.design;

import org.junit.Test;

/**
 * Created by agermenos on 1/29/16.
 */

public class TestClass implements T1, T2{
    public void m1(){}
    @Test
    public void test1(){
        TestClass t = new TestClass();
        System.out.print("Works!!");
    }

}

interface T1{
    int VALUE = 1;
    void m1();
}
interface T2{
    int VALUE = 2;
    void m1();
}
package com.ocp.inner;

import org.junit.Test;

/**
 * Created by alejandrogermenos on 4/5/17.
 * Lessons:
 * 1. non static inner can't have any static methods or properties
 * 2. Children modify parent's properties, static or not and public or private
 */

public class Mother {
    private static String heart = "mom's heart";
    public class Child{
        String tell="Children's tale";
        private void sing(){
            System.out.printf("%s, obladi oblada!!\n", tell);
        }
        private void giveTrouble(){
            heart="child's heart, hehe";
            tell="My new tell";
            sing();
            System.out.printf("My mom's heart is dead... %s\n", heart);
        }
    }

    @Test
    public static void test(){
        Child child= new Mother().new Child();
        child.sing();
    }
    @Test
    public void test2(){
        Child child = new Child();
        child.giveTrouble();
        System.out.printf("Mom's heart? %s\n", heart);
    }

    public static void main(String args[]){
        System.out.println("Test 1:\n");
        test();
        System.out.println("\n-------\nTest 2:\n");
        new Mother().test2();
    }
}

package com.ocp.testApp.design;

public class Shady {
    public static void main(String args[]) {
        A o1 = new C();
        A o2 = (A) o1;
        System.out.println("C typeof A --> " + (o1 instanceof B));
        System.out.println(o1.m1());
        System.out.println(o2.i);
        System.out.println(o2.m1());
    }
}

class A {
    int i = 10;

    int m1() {
        return i;
    }
}

class B extends A {
    int i = 20;

    int m1() {
        return i;
    }
}

class C extends B {
    int i = 30;

    int m1() {
        return i;
    }
}
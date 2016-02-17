package com.ocp.interfaces;


interface I {
}

class A implements I {
}

class B extends A {
}

class C extends B {
}

public class IsA {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        a = (B)(I)b; // THis works... B is A
        b = (B)(I)a; // This will not work at runtime... A is not B
    //    a = (I)b;    //  I is not A
        I i = (C)a;  // This will fail at runtime, I is not C
    }
}
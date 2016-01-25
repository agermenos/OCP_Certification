package com.ocp.book.scoping;

class Wood {
    public Wood() {

        System.out.println("Wood");
    }
    {
        System.out.println("Wood:init");
    }
}
class Teak extends Wood {
    {
        System.out.println("Teak:init");
    }
    public Teak() {
        System.out.println("Teak");
    }
    public static void main(String args[]) {
        new Teak();
    }
}
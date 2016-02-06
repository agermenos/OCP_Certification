package com.ocp.inner;


public class TestClass {
    public static void main(String args[]) {
        OtherOuter out = new OtherOuter();
        System.out.println(out.getInner().getOi());
    }
}

class OtherOuter {
    private int oi = 20;

    class Inner {
        int getOi() {
            return oi;
        }
    }

    Inner getInner() {
        return new Inner();
    }
}

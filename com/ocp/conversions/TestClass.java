package com.ocp.conversions;

/**
 * Created by Alejandro on 2/17/16.
 */
class TestClass{
        public static void main(String[] args){
        Integer a = 4; new TestClass().probe(a);
        float b = 4; new TestClass().probe(b);
        }
        
        void probe(int... x) { System.out.println("In ..."); }
        
        void probe(Number x) { System.out.println("In Number"); }
        
        void probe(long x) { System.out.println("In long"); }
        
        void probe(Long x) { System.out.println("In LONG"); }

        void probe(Float x) { System.out.println("In FLOAT"); }

        void probe(double x) { System.out.println("In double"); }
}
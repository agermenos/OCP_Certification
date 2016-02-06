package com.ocp.testApp.design;

public class SubClass extends SuperClass
{
        int i, j, k;
        public SubClass( int m, int n ) {
            super(m);
            i = m ;
            j = m ;
        }
        public SubClass( int m ){
            super(m);
        }

        public static void main(String args[]){
            SuperClass sc = new SubClass(4);
            System.out.println("Here you have sc... " + sc);
        }
}

class SuperClass {
    public SuperClass(int m) {
        m=0;
    }
}



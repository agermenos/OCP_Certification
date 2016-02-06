package com.ocp.testApp.design;

interface I {
}

class One implements I {
}

class Two extends One {
}

class Three extends Two {
}
    public class CastingTest{

        public static void main(String args[]){
            One one = new One();
            Two two = new Two();
            one = (Two)(I)two;
            two = (Two)(I)one;  // fails at runtime
            //one = (I)two;       // can't compile
            I i = (Three)one;   // fails at runtime
        }

    }




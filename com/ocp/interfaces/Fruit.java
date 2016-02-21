package com.ocp.interfaces;


interface Eatable{
        int types = 10;
}
class Food implements Eatable {
        public static int types = 20;
}
public class Fruit extends Food implements Eatable {

    public static void main(String[] args) {
        //types = 30;
        //System.out.println(types);
        Fruit f = new Fruit();
        System.out.println(((Food)f).types);
    }
}
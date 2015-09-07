package com.ocp.scoping;

/**
 * Created by Alejandro on 9/5/2015.
 */
public class Throne {
    private String name;

    public Throne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Throne{" +
                "name='" + name + '\'' +
                '}';
    }

    public String sitQueen(Queen q){
        return ("The queen " + q.getName() + " is sittint in the " + name + " throne!");
    }

    public String sitQueen(Cersei c){
        return ("Queen Cersei (the cruel) is sitting in the " + name + " throne!!");
    }
}

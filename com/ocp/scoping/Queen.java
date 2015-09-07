package com.ocp.scoping;

/**
 * Created by Alejandro on 9/5/2015.
 */
public class Queen {
    private String name;
    private Throne throne;

    public Queen(String name, Throne throne) {
        this.name = name;
        this.throne = throne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Throne getThrone() {
        return throne;
    }

    public void setThrone(Throne throne) {
        this.throne = throne;
    }

    public String claim(){
        return ("I, " + name + ", claim the " + getThrone().getName() + " Throne!");
    }
}

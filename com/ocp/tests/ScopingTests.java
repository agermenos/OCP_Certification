package com.ocp.tests;

import com.ocp.scoping.Cersei;
import com.ocp.scoping.Queen;
import com.ocp.scoping.Throne;
import org.junit.Test;

/**
 * Created by Alejandro on 9/5/2015.
 */
public class ScopingTests {
    private static final String LINE = "\n===========================================================";

    class IronThrone extends Throne {
        public IronThrone(String name) {
            super("Iron");
        }
    }

    public void write(String text){
        System.out.println(text);
    }

    /**
     * Test 1:
     * When you overload a method, you have to look which object you're representing
     */
    @Test
    public void testOverloadAndOverride (){
        System.out.println("\nCreating a Queen, and sitting her in the throne" + LINE);
        Throne t = new Throne("West Coast");
        Queen q = new Queen("Margery", t);
        write(q.claim());
        write(t.sitQueen(q));
        System.out.println("\nCreating a Queen as Cersei, and sitting her in the throne" + LINE);
        q = new Cersei();
        write("OVERLOADING: " + q.claim());
        write(q.getThrone().sitQueen(q));
        System.out.println("\nFinally, creating Cersei as Cersei, and sitting her in the Throne" + LINE);
        Cersei c= new Cersei();
        write("OVERLOADING: " + c.claim());
        write("OVERRIDING: " + c.getThrone().sitQueen(c));
    }


}

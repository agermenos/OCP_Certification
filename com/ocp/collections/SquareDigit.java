package com.ocp.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by agermenos on 3/10/17.
 */
public class SquareDigit {

    public int squareDigits(int n) {
        List<Integer> results = new ArrayList<>();
        while (n>0) {
            int cv = (n%10);
            results.add(cv*cv);
            n=n/10;
        }
        int position=0;
        int total=0;
        for (Integer value:results) {
            total+= value*Math.pow(10,position);
            int size = String.valueOf(value).length();
            position+=size;
        }
        return total;
    }

    @Test
    public void test() {
        assertEquals(491181, new SquareDigit().squareDigits(7119));
    }

}
